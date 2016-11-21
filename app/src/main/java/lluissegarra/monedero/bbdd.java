package lluissegarra.monedero;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by victor on 21/11/2016.
 */

public class BBDD extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Monedero.db";

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + Monedero.Moviments.TABLE_NAME + " (" +
                    Monedero.Moviments._ID + " INTEGER PRIMARY KEY";
//                    Monedero.COLUMN_NAME_TITLE + TEXT_TYPE + COMMA_SEP +
//                    Monedero.COLUMN_NAME_SUBTITLE + TEXT_TYPE + " )";

    public BBDD(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
         sqLiteDatabase.execSQL(Monedero.SQL_CREATE_TABLE_MOVIMENTS);
    }

    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);


    }
}
