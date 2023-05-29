package com.learndagger.herostory;

import dagger.Lazy;
import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import javax.inject.Provider;

/**
 * @author 高超（gaochao.cc）
 * @since 2023/5/28
 */
@Module
public class AltmanModule {

    @M78CloudScope
    @Provides
    Altman provideAltman(@Named("altman_name") String name, Provider<Bracelet> bracelet, Lazy<Unclear> unclear) {
        return new Altman(name, bracelet, unclear);
    }
}
