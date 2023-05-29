package com.learndagger.herostory;

import dagger.BindsInstance;
import dagger.Component;

import javax.annotation.Nullable;


/**
 * @author 高超（gaochao.cc）
 * @since 2023/5/28
 */
@HeroVillageScope
@Component(modules = SuperHeroFamilyModule.class, dependencies = M78Cloud.class)
public interface HeroVillage {

    Hero newHero();

    SuperHero newSuperHero();

    Altman callAltman();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder heroName(@HeroName String name);

        @BindsInstance
        Builder heroSex(@HeroSex String sex);

        @BindsInstance
        Builder mainWeapon(@HeroMainWeapon @Nullable Weapon weapon);

        @BindsInstance
        Builder subWeapon(@HeroSubWeapon @Nullable Weapon weapon);

        Builder m78Cloud(@Nullable M78Cloud m78Cloud);

        HeroVillage build();
    }
}
