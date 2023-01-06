package mastersid.richard.immo_estimation.backend

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class ImmoUtilModule {
    @Binds
    abstract fun bindImmoUtil(immoUtilImpl: ImmoUtilImpl): ImmoUtil
}