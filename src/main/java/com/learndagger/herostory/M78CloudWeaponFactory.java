package com.learndagger.herostory;

import dagger.Module;
import dagger.Provides;

/**
 * @author 高超（gaochao.cc）
 * @since 2023/5/29
 */
@Module
public class M78CloudWeaponFactory {
    @Provides
    Bracelet provideBracelet() {
        return new Bracelet();
    }

    @Provides
    Unclear provideUnclear() {
        return new Unclear();
    }
}
