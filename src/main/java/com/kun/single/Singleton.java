package com.kun.single;

/**
 *
 * 懒汉式单例
 *
 * 不安全的单例模式
 *
 *
 * @author kun
 * @data 2019/3/10 20:57
 */
public class Singleton {
    private static Singleton uniqueInstance = null;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
