package com.adolph.singleton;


import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Currency;

/**
 * Hungry singleton
 * <p>
 * jvm类加载机制，保证实例唯一性
 *
 * @see Runtime#getRuntime Runtime#getRuntime
 * @see java.lang.reflect.Constructor#newInstance(Object...) java.lang.reflect.Constructor#newInstance(Object...)枚举不能通过反射实例化
 * @see java.io.Serializable 避免序列化实例单例  ANY-ACCESS-MODIFIER Object readResolve() throws ObjectStreamException;
 * @see ObjectInputStream#readObject()
 * @see Currency#readResolve()
 * @see ClassLoader
 * @since 2020 -02-02
 */
public class HungrySingleton implements Serializable {
    private static final long serialVersionUID = 4997670797534148713L;
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        if (instance != null) {
            throw new RuntimeException("instance already exists...");
        }
    }

    /**
     * Get instance hungry singleton
     *
     * @return the hungry singleton
     */
    public static HungrySingleton getInstance() {
        return instance;
    }

    /**
     * to avoid Serializable to create non same instance
     *
     * @return the object
     * @throws ObjectStreamException object stream exception
     */
    private Object readResolve() throws ObjectStreamException{
        return instance;
    }
}
