package com.flippey.bcnd.Orm;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.flippey.bcnd.bean.User;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by flippey on 2018/2/2 17:48.
 */

public class OrmLiteDbHelper extends OrmLiteSqliteOpenHelper {
    private Context mContext;
    public OrmLiteDbHelper(Context context) {
        super(context, "user_db", null, 1);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, User.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }


}
