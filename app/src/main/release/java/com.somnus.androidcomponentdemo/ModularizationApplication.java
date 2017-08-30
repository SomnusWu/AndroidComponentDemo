package com.somnus.androidcomponentdemo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;


/**
 * Created by erfli on 11/1/16.
 */
//@Route(path = Constans.ArouterAppPath)
public class ModularizationApplication extends Application {

    private static ModularizationApplication mInstace;

    public static ModularizationApplication getInstance() {
        return mInstace;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        mInstace = this;

        if (BuildConfig.DEBUG){
            ARouter.openLog();
            ARouter.openDebug();//开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            ARouter.printStackTrace();
        }
        ARouter.init(this);
    }

}
