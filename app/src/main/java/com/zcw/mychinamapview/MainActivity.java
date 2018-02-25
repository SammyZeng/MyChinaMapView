package com.zcw.mychinamapview;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.HashMap;

/**
 * Created by zcw on 2017/10/17.
 */


public class MainActivity extends AppCompatActivity implements MyImageView.ChinaMapViewProvinceListener {

    private MyImageView mMyImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMyImageView = (MyImageView) findViewById(R.id.imgCnMap);
        initView();
    }

    private void initView() {
        mMyImageView.setChinaMapViewProvinceListener(this);
        // first get the config map
        // 首先获取总设置 map
        CnMap cnMap = mMyImageView.getCnMap();
        HashMap<String, CnMapConfig> cnConfigMap = cnMap.configMap;
        // or cnMap.configMap.get("Anhui"); but use cnMap.PROVINCE[0] better
        // 或者 cnMap.configMap.get("Anhui"); 但是用 cnMap.PROVINCE[0] 更好些
        CnMapConfig configAnhui = cnConfigMap.get(cnMap.PROVINCE[0]);
        // support method chaining
        // 支持链式调用（方法链）
//        configAnhui
//                .setFillColor(Color.parseColor("#ee0000"))
//                .setClickColor(Color.parseColor("#99ffff"));
    }

    @Override
    public void onProvinceClick(int i) {
        Toast.makeText(this, mMyImageView.getCnMap().PROVINCE[i] + " is clicked", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onProvinceLongClick(int i) {
        Toast.makeText(this, mMyImageView.getCnMap().PROVINCE[i] + " is long clicked", Toast.LENGTH_LONG).show();

    }
}
