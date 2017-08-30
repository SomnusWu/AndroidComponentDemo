package com.somnus.moduleb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.somnus.baselibrary.ARouterUtils;
import com.somnus.baselibrary.Constans;

@Route(path = ModuleBConstans.ArouterPathModuleBPath)
public class ModuleBMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_bmain);

        findViewById(R.id.moduleb_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //子Module跳转到工程
                ARouterUtils.toAouter(Constans.ArouterAppPath);
                finish();
            }
        });
    }
}
