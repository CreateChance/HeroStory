package com.learndagger.herostory;

import dagger.BindsInstance;
import dagger.Component;

import javax.inject.Named;

/**
 * @author 高超（gaochao.cc）
 * @since 2023/5/28
 */
@M78CloudScope
@Component(modules = {M78CloudWeaponFactory.class, AltmanModule.class})
public interface M78Cloud {
    Altman newAltman();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder name(@Named("altman_name") String name);

        M78Cloud build();
    }
}
