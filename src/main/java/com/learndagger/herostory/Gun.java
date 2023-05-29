package com.learndagger.herostory;

import javax.inject.Inject;

/**
 * @author 高超（gaochao.cc）
 * @since 2023/5/28
 */
public class Gun implements Weapon {

    @Inject
    Gun() {
        // do noting.
    }

    @Override
    public void attack() {
        System.out.println("火神枪正在射击！");
    }
}
