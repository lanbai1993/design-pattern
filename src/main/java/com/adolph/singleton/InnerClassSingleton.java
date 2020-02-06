package com.adolph.singleton;

/**
 * Inner class singleton
 *
 * 调用getInstance时加载类来初始化实例对象
 * @since 2020-02-02
 */
public class InnerClassSingleton {
    private InnerClassSingleton(){}

    private static class SingletonHolder{
        private static final InnerClassSingleton singleton = new InnerClassSingleton();
    }

    /**
     * Get instance inner class singleton
     *
     * @return the inner class singleton
     */
    public static InnerClassSingleton getInstance(){
        return SingletonHolder.singleton;
    }
}
