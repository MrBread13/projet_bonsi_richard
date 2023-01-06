package mastersid.richard.immo_estimation.backend

import javax.inject.Inject

class ImmoUtilImpl @Inject constructor(): ImmoUtil {
    override fun Estimate(terrain : Float, batiment : Float, nb_pieces : Int): Float {
        var estimated = 1.00

        return estimated.toFloat()
    }
}