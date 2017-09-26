package com.somnus.baselibrary;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by Somnus on 2017/8/30.
 * Description:
 */

public class BaseAppContext extends Application {
    private static BaseAppContext mInstace;

    public static BaseAppContext getInstance() {
        return mInstace;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        mInstace = this;

        if (Constans.isDebug){
            ARouter.openLog();
            ARouter.openDebug();//开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            ARouter.printStackTrace();
        }
        ARouter.init(this);
    }
}
