package mastersid.richard.immo_estimation.backend

import android.util.Log
import javax.inject.Inject

class ImmoUtilImpl @Inject constructor(): ImmoUtil {
    override fun Estimate(terrain : Float, surface_bati : Float, nb_pieces : Int, code_type_local : Char): Float {
        
        var surface_jardin = terrain - surface_bati
        var date_int = 18170.0
        var cadastre_code = 3
        var nombre_pieces_principales = nb_pieces

        var x = surface_bati
        var y = surface_jardin
        var z = date_int
        var t = cadastre_code
        var u = nombre_pieces_principales

        if(code_type_local == 'A') {
            return 487752.737 + (7168.382 * x) - ( 12257.693 * y) - (58.784 * z) + (13479.606 * t) + (33.812 * (x**2)) - (0.278 * x * y) - (0.249 * x * z) - (220.587 * x * t) - (1385.503 * x * u) - (0.053 * (y**2)) + (0.699 * y * z) + (0.0397 * y * t) + (2.306 * y * u) + (0.0016 * (z**2)) + (0.254 * z * t) + (9.105 * z * u) - (991.898 * (t ** 2)) + (2480.101 * t * u) + (14057.467 * (u**2))
        }

        if(code_type_local == 'M') {
            return 5.674710e06 + ( x * -2.767489e+03) + (y * -4.760508e+02) + ( z * -6.072734e+02) + (t * -3.174375e+03) + ((x ** 2) * -2.987971e+00) + (x * y * -5.661912e-02) + ( x * z * 2.467719e-01) + ( x * t * 1.227559e+01) + ((y ** 2) * -5.300586e-03) + ( y * z *  2.951426e-02) + ( y * t * 4.116583e-01) + ((z ** 2) * 1.632992e-02) + (z * t * -5.930457e-02) + ((t ** 2) * 1.156940e+02)
        }
    }
}