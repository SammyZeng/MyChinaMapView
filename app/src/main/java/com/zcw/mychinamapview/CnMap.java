package com.zcw.mychinamapview;

import java.util.HashMap;

/**
 * Created by zcw on 2017/10/17.
 */

public class CnMap {

    public String[] PROVINCE = {"Anhui", "Beijing", "Chongqing", "Fujian", "Gansu", "Guangdong",
            "Guangxi", "Guizhou", "Hainan", "Hebei", "Heilongjiang", "Henan", "Hong Kong", "Hubei",
            "Hunan", "Jiangsu", "Jiangxi", "Jilin", "Liaoning", "Macau", "Nei Mongol", "Ningxia",
            "Qinghai", "Shaanxi", "Shanghai", "Shandong", "Shanxi", "Sichuan", "Taiwan", "Tianjin",
            "Xinjiang", "Xizang", "Yunnan", "Zhejiang"};

    public HashMap<String, CnMapConfig> configMap;

    public CnMap() {
        configMap = new HashMap<>();
        for (String s : PROVINCE) {
            configMap.put(s, new CnMapConfig());
        }
    }

}