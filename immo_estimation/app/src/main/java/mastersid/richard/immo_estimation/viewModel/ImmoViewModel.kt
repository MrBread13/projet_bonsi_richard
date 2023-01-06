package mastersid.richard.immo_estimation.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import mastersid.richard.immo_estimation.backend.ImmoUtil
import mastersid.richard.immo_estimation.data.EstimResult
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlin.IllegalArgumentException

private const val STATE_ENCRYPT_RESULT = "state_estim_result"

@HiltViewModel
class ImmoViewModel @Inject constructor(
    state: SavedStateHandle,
    private val ImmoUtil : ImmoUtil
) : ViewModel() {

    private val _resultEstim : MutableLiveData<EstimResult> = state.getLiveData(STATE_ENCRYPT_RESULT, EstimResult.None)
    val resultEstim: LiveData<EstimResult> = _resultEstim

    fun estimation(terrain : Float, batiment : Float, nb_pieces : Int) {
        try {
            _resultEstim.value = EstimResult.Estimated(ImmoUtil.Estimate(terrain, batiment, nb_pieces))
        } catch (e: IllegalArgumentException){
            _resultEstim.value = EstimResult.Failed(e.message.toString())
        }
    }

}