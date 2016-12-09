package com.larack.service;

import com.larack.service.impl.ImageSDCardCache;

import java.io.Serializable;

/**
 * File name rule, used when saving images in {@link ImageSDCardCache}
 *
 * @author <a href="http://www.cnblogs.com/larack/" target="_blank">Larack</a> 2012-7-6
 */
public interface FileNameRule extends Serializable {

    /**
     * get file name, include suffix, it's optional to include folder.
     *
     * @param imageUrl the url of image
     * @return
     */
    public String getFileName(String imageUrl);
}
