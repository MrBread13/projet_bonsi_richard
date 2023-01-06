package mastersid.richard.immo_estimation.backend

interface ImmoUtil {
    /**
     * calcule l'estimation du prix, des caractéristiques du mobilier en entrée.
     * @return estimation du prix
     */
    fun Estimate(terrain : Float, batiment : Float, nb_pieces : Int): Float
}