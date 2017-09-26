package com.somnus.baselibrary;

/**
 * Created by Somnus on 2017/6/22.
 *
 * @Description:
 */

public class Constans {
    public static final boolean isDebug = true;
    public static final String ArouterParentPath = "/somnus/";
    public static final String ArouterAppPath = ArouterParentPath+"app";
    public static final String ArouterParentUri = "arouter://m.somnus.com" + ArouterParentPath;

    public static final String ArouterPathActivity3Uri = ArouterParentUri + "ArouterActivity3?key1=我是参数";
    public static final String ArouterPathActivityWebPath = ArouterParentPath + "webActivity";


}
