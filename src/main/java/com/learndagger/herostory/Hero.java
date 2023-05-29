package com.learndagger.herostory;

import javax.annotation.Nullable;
import javax.inject.Inject;

/**
 * @author 高超（gaochao.cc）
 * @since 2023/5/28
 */
public class Hero {

    private final String name;

    private final String sex;

    @Nullable
    private final Weapon weapon1;

    @Nullable
    private final Weapon weapon2;

    @Inject
    Hero(@HeroName String name, @HeroSex String sex, @HeroMainWeapon @Nullable Weapon weapon1, @HeroSubWeapon @Nullable Weapon weapon2) {
        this.name = name;
        this.sex = sex;
        this.weapon1 = weapon1;
        this.weapon2 = weapon2;
    }

    public void fight() {
        System.out.println("英雄 " + name + ", 性别: " + sex + " 正在战斗！");
        if (weapon1 != null) {
            weapon1.attack();
        }
        if (weapon2 != null) {
            weapon2.attack();
        }
    }
}
