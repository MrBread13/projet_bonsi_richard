package mastersid.richard.immo_estimation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import mastersid.richard.immo_estimation.databinding.FragmentInfoBinding
import mastersid.richard.immo_estimation.viewModel.ImmoViewModel

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
            var terrain = binding.dataTerrain.text.toString().toFloat()
            var batiment = binding.dataBatiment.text.toString().toFloat()
            var nb_pieces = binding.dataNbPieces.text.toString().toInt()
            val action = InfoFragmentDirections.actionInfoFragmentToEstimFragment(terrain, batiment, nb_pieces)
            findNavController().navigate(action)
        }

    }
}