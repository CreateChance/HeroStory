package com.learndagger.herostory;

import javax.inject.Inject;

/**
 * @author 高超（gaochao.cc）
 * @since 2023/5/28
 */
public class Sword implements Weapon {

    @Inject
    Sword() {
        // do nothing.
    }

    @Override
    public void attack() {
        System.out.println("长剑正在砍杀");
    }
}
