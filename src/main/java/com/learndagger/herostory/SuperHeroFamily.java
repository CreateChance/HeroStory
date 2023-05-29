package com.learndagger.herostory;

import dagger.Subcomponent;

/**
 * @author 高超（gaochao.cc）
 * @since 2023/5/28
 */
@Subcomponent
public interface SuperHeroFamily {

    @Subcomponent.Factory
    interface Factory {
        SuperHeroFamily create();
    }
}
