package mastersid.richard.immo_estimation.backend

import android.util.Log
import javax.inject.Inject

class ImmoUtilImpl @Inject constructor(): ImmoUtil {
    override fun Estimate(surface_terrain : Float, surface_bati : Float, nb_pieces : Int): Float {

        var x = surface_bati
        var y = surface_terrain - surface_bati
        var z = 18170.0
        var t = 3
        var u = nb_pieces
        return (487752.737 + (7168.382 * x) - ( 12257.693 * y) - (58.784 * z) + (13479.606 * t)
                + (33.812 * (x * x)) - (0.278 * x * y) - (0.249 * x * z) - (220.587 * x * t)
                - (1385.503 * x * u) - (0.053 * (y*y)) + (0.699 * y * z) + (0.0397 * y * t)
                + (2.306 * y * u) + (0.0016 * (z*z)) + (0.254 * z * t) + (9.105 * z * u)
                - (991.898 * (t * t)) + (2480.101 * t * u) + (14057.467 * (u*u))).toFloat()
    }
}