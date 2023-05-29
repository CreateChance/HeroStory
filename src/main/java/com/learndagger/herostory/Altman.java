package com.learndagger.herostory;

import dagger.Lazy;

import javax.inject.Provider;

/**
 * @author 高超（gaochao.cc）
 * @since 2023/5/28
 */

public class Altman {

    private final String name;

    // 每次战斗都需要新的手环才行
    private final Provider<Bracelet> bracelet;

    // 不随身携带原子弹，远程召唤即可
    private final Lazy<Unclear> unclear;

    public Altman(String name, Provider<Bracelet> bracelet, Lazy<Unclear> unclear) {
        this.name = name;
        this.bracelet = bracelet;
        this.unclear = unclear;
    }


    public void fight() {
        System.out.println(name + "奥特曼正在战斗！手镯 id: " + bracelet.get().hashCode());
        bracelet.get().attack();
        unclear.get().attack();
    }
}
