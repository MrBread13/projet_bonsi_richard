package mastersid.richard.immo_estimation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import mastersid.richard.immo_estimation.databinding.FragmentInfoBinding
import java.lang.IllegalArgumentException

@AndroidEntryPoint
class InfoFragment: Fragment() {
    private lateinit var binding: FragmentInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInfoBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.goToEstimate.setOnClickListener(){
            try {
                val data1 = binding.data1.text.toString().toInt()
                val data2 = binding.data2.text.toString().toInt()
                val data3 = binding.data3.text.toString().toInt()
                val action = InfoFragmentDirections.actionInfoFragmentToEstimFragment()
                findNavController().navigate(action)
            } catch (e: java.lang.NumberFormatException) {
                val action = InfoFragmentDirections.actionInfoFragmentToEstimFragment()
            }

        }
    }
}