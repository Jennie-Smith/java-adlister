package com.codeup.adlister.dao;

import javax.servlet.jsp.jstl.core.Config;

public class DaoFactory {
    private static Ads adsDao;
//    private static Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            Config config = new Config();
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
