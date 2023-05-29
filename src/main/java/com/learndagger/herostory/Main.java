package com.learndagger.herostory;


/**
 * Game entry
 *
 * @author 高超（gaochao.cc）
 * @since 2023/5/28
 */
public class Main {
    public static void main(String[] args) {
        // 英雄们的武器库，可以造出各种武器
        WeaponFactory weaponFactory = DaggerWeaponFactory.create();

        // 雷欧奥特曼寻呼器
        M78Cloud m78CloudLeiouFinder = DaggerM78Cloud.builder()
                .name("雷欧")
                .build();

        // 英雄召唤师构建器
        // 村子里面的所有的英雄都能召唤雷欧奥特曼！
        HeroVillage.Builder heroCallerBuilder = DaggerHeroVillage.builder().m78Cloud(m78CloudLeiouFinder);

        // 第一个英雄召唤师
        HeroVillage heroCaller1 = heroCallerBuilder
                .heroName("艾里尔")
                .heroSex("女")
                .mainWeapon(weaponFactory.getGun()) // 艾里尔擅长使用枪
                .subWeapon(weaponFactory.getSword())
                .build();
        // 第而个英雄召唤师
        HeroVillage heroCaller2 = heroCallerBuilder
                .heroName("霍尔达")
                .heroSex("男")
                .mainWeapon(weaponFactory.getSword()) // 霍尔达擅长使用剑
                .subWeapon(weaponFactory.getGun())
                .build();
        // 超级英雄召唤师
        HeroVillage superHeroCaller = heroCallerBuilder
                .heroName("斯特曼")
                .heroSex("男")
                .mainWeapon(weaponFactory.getGun()) // 超级英雄斯特曼也擅长用枪，不过枪法相当了得
                .subWeapon(weaponFactory.getUnclear())
                .build();
        // 奥特曼召唤师，他只负责召唤即可，不需要主、副武器
        HeroVillage altmanCaller = heroCallerBuilder
                .heroName("里特")
                .heroSex("男")
                .build();

        // 开始召唤英雄们
        Hero hero1 = heroCaller1.newHero();
        Hero hero2 = heroCaller2.newHero();
        SuperHero superHero = superHeroCaller.newSuperHero();
        // 这里连续召唤两次奥特曼，不过没关系，最终召唤到的都是同一个奥特曼
        // 因为 M78 只有一个雷欧奥特曼
        // 是的，这就是单例模式
        Altman altman = altmanCaller.callAltman();
        Altman altman2 = altmanCaller.callAltman();

        System.out.println("Hero1: " + hero1.hashCode() +
                ", Hero2: " + hero2.hashCode() +
                ", Super hero: " + superHero.hashCode() +
                ", altman: " + altman.hashCode() +
                ", altman2: " + altman2.hashCode()
        );

        // 战斗开始了
        hero1.fight();
        System.out.println("=================");
        hero2.fight();
        System.out.println("=================");
        superHero.fight();
        System.out.println("=================");
        altman.fight();
        System.out.println("=================");
        altman2.fight();
    }
}
