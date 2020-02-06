package com.adolph.singleton;

/**
 * Enum singleton
 *
 * @since 2020-02-02
 */
public enum EnumSingleton {
    /**
     * Instance enum singleton
     */
    INSTANCE;

    /**
     * Get instance enum singleton
     *
     * @return the enum singleton
     */
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
