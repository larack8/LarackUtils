package com.larack.util;

/**
 * Singleton helper class for lazily initialization.
 *
 * @param <T>
 * @author <a href="http://www.cnblogs.com/larack//" target="_blank">Larack</a>
 */
public abstract class SingletonUtils<T> {

    private T instance;

    protected abstract T newInstance();

    public final T getInstance() {
        if (instance == null) {
            synchronized (SingletonUtils.class) {
                if (instance == null) {
                    instance = newInstance();
                }
            }
        }
        return instance;
    }
}
