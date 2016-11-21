package lluissegarra.monedero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private BBDD bbdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bbdd = new BBDD(getApplicationContext());
        bbdd.getWritableDatabase().execSQL("INSERT INTO "+Monedero.Moviments.TABLE_NAME+ " VALUES()");
        bbdd.getWritableDatabase().insert(Monedero.Moviments.TABLE_NAME,null,null);
        bbdd.getWritableDatabase().insert(Monedero.Moviments.TABLE_NAME,null,null);
        bbdd.getWritableDatabase().insert(Monedero.Moviments.TABLE_NAME,null,null);
        bbdd.getWritableDatabase().insert(Monedero.Moviments.TABLE_NAME,null,null);
    }
}
