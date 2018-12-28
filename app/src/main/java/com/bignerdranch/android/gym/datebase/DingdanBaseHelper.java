package com.bignerdranch.android.gym.datebase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DingdanBaseHelper extends SQLiteOpenHelper {
    private static final String TAG = "DingdanBaseHelper";
    private static final int VERSION = 2;
    private static final String DATABASE_NAME = "dingdanBase.db";

    public DingdanBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table " + DingdanDbSchema.DingdanTable.NAME + "(" +
                " _id integer primary key autoincrement, " +
                DingdanDbSchema.DingdanTable.Cols.UUID + ", " +
                DingdanDbSchema.DingdanTable.Cols.TITLE + ", " +
                DingdanDbSchema.DingdanTable.Cols.DATE + ", " +
                DingdanDbSchema.DingdanTable.Cols.SOLVED +
                ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
