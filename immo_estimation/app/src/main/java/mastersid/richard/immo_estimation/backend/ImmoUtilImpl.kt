package mastersid.richard.immo_estimation.backend

import javax.inject.Inject

class ImmoUtilImpl @Inject constructor(): ImmoUtil {
    override fun test(): Int {
        return 10000
    }
}