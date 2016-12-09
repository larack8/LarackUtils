package com.larack.util;

import com.larack.entity.PatchResult;

/**
 * PatchUtils
 *
 * @author <a href="http://www.cnblogs.com/larack/" target="_blank">Larack</a> 2013-12-10
 */
public class PatchUtils {

    /**
     * patch old apk and patch file to new apk
     *
     * @param oldApkPath
     * @param patchPath
     * @param newApkPath
     * @return
     */
    public static native PatchResult patch(String oldApkPath, String patchPath, String newApkPath);
}
