package com.flippey.bcnd.Orm;

import android.util.Log;

import com.flippey.bcnd.bean.User;
import com.j256.ormlite.android.AndroidDatabaseConnection;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.sql.Savepoint;

/**
 * Created by flippey on 2018/2/2 18:14.
 */

public class OrmLiteDbUtils {

    private static OrmLiteDbUtils mInstance;
    private OrmLiteDbHelper mDbHelper;
    public static OrmLiteDbUtils getInstance() {
        if (mInstance == null) {
            synchronized (OrmLiteDbUtils.class) {
                if (mInstance == null) {
                    mInstance = new OrmLiteDbUtils();
                }
            }
        }
        return mInstance;
    }

    public void setDbHelper(OrmLiteDbHelper dbHelper) {
        mDbHelper = dbHelper;
    }

    public void addUser(User user) {
        AndroidDatabaseConnection connection = new AndroidDatabaseConnection(mDbHelper.getWritableDatabase(), true);
        Savepoint savepoint = null;
        try {
            savepoint = connection.setSavePoint("start"); //事务的保存点
            connection.setAutoCommit(false); //事务处理需要手动提交

            Dao<User,Integer> userDao = mDbHelper.getDao(User.class);
            User queriedUser = userDao.queryForId(user.getPhone());
            if(queriedUser!=null){
                Log.e("login", "用户: "+ queriedUser.getName()+"已存在,手机号： "+queriedUser.getPhone());

                //                TecentTjSdk.submitUserInfo(false); //老用户登录
            }else{
                Log.e("login","当前用户总数"+userDao.countOf());
                userDao.create(user);
                Log.e("login", "新增用户: "+ user.getName()+" 手机号： "+user.getPhone()+" 新增后的用户总数： "+userDao.countOf());
            }
            connection.commit(savepoint);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
