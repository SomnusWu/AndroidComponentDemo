package com.somnus.baselibrary;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by Somnus on 2017/6/22.
 *
 * @Description:
 */

public class ARouterUtils {
    /***
     * 跳转一个普通的界面
     * @param path
     */
    public static void toAouter(String path) {
        ARouter.getInstance().build(path).navigation();
    }
}
