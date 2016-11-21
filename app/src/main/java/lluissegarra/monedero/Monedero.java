package lluissegarra.monedero;

import android.provider.BaseColumns;

/**
 * Created by victor on 21/11/2016.
 */
public final class Monedero {
    public static final String SQL_CREATE_TABLE_MOVIMENTS = "CREATE TABLE " + Moviments.TABLE_NAME+"("+
                                                      Moviments._ID + " INTEGER AUTOINCREMENT)";

    private Monedero() {
    }

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + Monedero.Moviments.TABLE_NAME;

    public static class Moviments implements BaseColumns {
        public static final String TABLE_NAME = "Moviments";

    }
}
