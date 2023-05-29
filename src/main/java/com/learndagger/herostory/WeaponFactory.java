package com.learndagger.herostory;

import dagger.Component;

/**
 * @author 高超（gaochao.cc）
 * @since 2023/5/29
 */
@Component(modules = M78CloudWeaponFactory.class)
public interface WeaponFactory {

    Gun getGun();

    Sword getSword();

    Bracelet getBracelet();

    Unclear getUnclear();
}
