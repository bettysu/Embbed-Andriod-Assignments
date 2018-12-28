package com.bignerdranch.android.gym.datebase;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.bignerdranch.android.gym.Dingdan;

import java.util.Date;
import java.util.UUID;

public class DingdanCursorWrapper extends CursorWrapper {
    public DingdanCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Dingdan getDingdan() {
        String uuidString = getString(getColumnIndex(DingdanDbSchema.DingdanTable.Cols.UUID));
        String title = getString(getColumnIndex(DingdanDbSchema.DingdanTable.Cols.TITLE));
        long date = getLong(getColumnIndex(DingdanDbSchema.DingdanTable.Cols.DATE));
        int isSolved = getInt(getColumnIndex(DingdanDbSchema.DingdanTable.Cols.SOLVED));

        Dingdan dingdan = new Dingdan(UUID.fromString(uuidString));
       dingdan.setTitle(title);
        dingdan.setDate(new Date(date));
        dingdan.setSolved(isSolved != 0);

        return dingdan;
    }
}
