package com.larack.service.impl;

import com.larack.entity.CacheObject;
import com.larack.service.CacheFullRemoveType;

/**
 * Remove type when cache is full. not remove any one, it means nothing can be put later<br/>
 * 
 * @author <a href="http://www.cnblogs.com/larack/" target="_blank">Larack</a> 2011-12-26
 */
public class RemoveTypeNotRemove<T> implements CacheFullRemoveType<T> {

    private static final long serialVersionUID = 1L;

    @Override
    public int compare(CacheObject<T> obj1, CacheObject<T> obj2) {
        return 0;
    }
}
