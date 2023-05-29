package com.learndagger.herostory;

/**
 * @author 高超（gaochao.cc）
 * @since 2023/5/28
 */
public class Bracelet implements Weapon {
    @Override
    public void attack() {
        System.out.println("奥特手镯正在发射光攻击！");
    }
}
