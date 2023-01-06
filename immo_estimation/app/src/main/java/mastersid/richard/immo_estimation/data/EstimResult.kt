package mastersid.richard.immo_estimation.data

sealed interface EstimResult {
    @JvmInline
    value class Estimated(val v: Float ): EstimResult

    @JvmInline
    value class Failed(val text: String): EstimResult

    object None: EstimResult
}