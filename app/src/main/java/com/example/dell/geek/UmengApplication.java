package com.example.dell.geek;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;

public class UmengApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initUmeng();
    }

    private void initUmeng() {
        UMConfigure.init(this,"5d1c95e4570df3a82100117e"
                ,"umeng",UMConfigure.DEVICE_TYPE_PHONE,"");//5d1c95e4570df3a82100117e
        PlatformConfig.setWeixin("wxdc1e388c3822c80b", "3baf1193c85774b3fd9d18447d76cab0");
        //豆瓣RENREN平台目前只能在服务器端配置
        PlatformConfig.setWeixin("wxdc1e388c3822c80b", "3baf1193c85774b3fd9d18447d76cab0");
        PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad","http://sns.whalecloud.com");
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");

    }
}
