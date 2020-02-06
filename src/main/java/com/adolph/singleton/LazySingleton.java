package com.adolph.singleton;

import org.springframework.core.ReactiveAdapterRegistry;

/**
 * 懒汉模式
 *
 * <a href="https://blog.csdn.net/weixin_30342639/article/details/91356608">volatile关键字</a>
 * @see ReactiveAdapterRegistry#getSharedInstance
 * @since 2020-02-02
 */
public class LazySingleton {
    private LazySingleton() {
    }

    // volatile 防止指令重排
    private static volatile LazySingleton singleton;

    /**
     * Gets singleton *
     *
     * @return the singleton
     */
    public static LazySingleton getSingleton() {
        if (singleton == null) {
            // 保证线程安全，实例为一
            synchronized (LazySingleton.class) {
                if (singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }
}
