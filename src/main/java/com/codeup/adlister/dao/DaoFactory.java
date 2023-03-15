package com.codeup.adlister.dao;

//import javax.servlet.jsp.jstl.core.Config;

public class DaoFactory {
    private static Ads adsDao;
    private static Users userDao;
//    private static com.codeup.adlister.dao.Config config = new com.codeup.adlister.dao.Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            Config config = new Config();
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

    public static Users getUserDao(){
        if(userDao == null) {
            Config config = new Config();
            userDao = new MySQLUsersDao(config);
        }
        return userDao;
    }

    public static void main(String[] args) {
//        test users dao
        Users dao = DaoFactory.getUserDao();
        System.out.println(dao.findByUsername("bob").getUsername());

    }
}
