package sj0218.s2.studyjams.cn.simplenote;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Salmon on 2017/6/4.
 */

public class NotesDB extends SQLiteOpenHelper {

    public static final String TABLE_NAME="notes";
    public static final String CONTENT="content";
    public static final String ID="_id";
    public static final String TIME="time";
    public static final String PATH="path";
    public static final String VIDEO="video";

    public NotesDB(Context context){
        super(context,"notes",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CRETE TABLE"+TABLE_NAME+"("+ID
                +" INTEGER PRIMARY KEY AUTOINCREMENT,"+CONTENT
                +" TEXT NOT NULL,"
                +PATH+" TEXT NOT NULL,"
                +VIDEO+" TEXT NOT NULL,"
                +TIME+" TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
