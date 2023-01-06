package mastersid.richard.immo_estimation.backend

import android.util.Log
import javax.inject.Inject

class ImmoUtilImpl @Inject constructor(): ImmoUtil {
    override fun Estimate(terrain : Float, surface_bati : Float, nb_pieces : Int, code_type_local : Char): Float {
        /*
        surface_bati =
        jardin = surface_terrain - surface_bati
        cadastre = cadastre
        date = YYYY-MM sans le jour
                nombre_pieces_principales = nb de piece
        code_type_local =  appt (A) ou maison (M)
        #caster la date en timestamps
        ...
        #associer le cadastre à son code
        ...
        */
        x = surface_bati
        y = surface_jardin
        z = date_int
        t = cadastre_code
        u = nombre_pieces_principales

        if(code_type_local == 'A') {
            return
        }

        if(code_type_local == 'M') {
            return
        }
    }
}