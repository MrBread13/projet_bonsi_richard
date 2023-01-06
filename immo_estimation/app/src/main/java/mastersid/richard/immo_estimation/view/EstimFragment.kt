package mastersid.richard.immo_estimation.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import mastersid.richard.immo_estimation.R
import dagger.hilt.android.AndroidEntryPoint
import mastersid.richard.immo_estimation.data.EstimResult
import mastersid.richard.immo_estimation.databinding.FragmentEstimBinding
import mastersid.richard.immo_estimation.viewModel.ImmoViewModel
import java.lang.IllegalArgumentException

@AndroidEntryPoint
class EstimFragment: Fragment() {

    private lateinit var binding: FragmentEstimBinding
    private val ImmoViewModel: ImmoViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEstimBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args: EstimFragmentArgs by navArgs()

        binding.goToEstimate.setOnClickListener(){
            val action = EstimFragmentDirections.actionEstimFragmentToInfoFragment()
            findNavController().navigate(action)
        }
        ImmoViewModel.resultEstim.observe(viewLifecycleOwner){
                value ->
            when(value){
               is EstimResult.None -> {
                   binding.resultText.visibility = View.VISIBLE
                   binding.resultText.text = "Estimation indisponible"
                   binding.euro.visibility = View.GONE
                   binding.error.visibility = View.GONE
                   Log.d("when -> none: ", "${value.toString()}")
               }
               is EstimResult.Estimated -> {
                   binding.resultText.visibility = View.VISIBLE
                   binding.euro.visibility = View.VISIBLE
                   binding.error.visibility = View.GONE
                   binding.resultText.text = value.toString()
               }
               is EstimResult.Failed -> {
                   binding.resultText.visibility = View.GONE
                   binding.euro.visibility = View.GONE
                   binding.error.visibility = View.VISIBLE
               }
            }
        }



    }
}
