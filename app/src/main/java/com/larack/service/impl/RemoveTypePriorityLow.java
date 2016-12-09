package com.larack.service.impl;

import com.larack.entity.CacheObject;
import com.larack.service.CacheFullRemoveType;

/**
 * Remove type when cache is full.<br/>
 * when cache is full, compare priority of object in cache, if priority is lower remove it first.<br/>
 * 
 * @author <a href="http://www.cnblogs.com/larack/" target="_blank">Larack</a> 2011-12-26
 */
public class RemoveTypePriorityLow<T> implements CacheFullRemoveType<T> {

    private static final long serialVersionUID = 1L;

    @Override
    public int compare(CacheObject<T> obj1, CacheObject<T> obj2) {
        return (obj1.getPriority() > obj2.getPriority()) ? 1 : ((obj1.getPriority() == obj2.getPriority()) ? 0 : -1);
    }
}
