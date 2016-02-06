package appewtc.masterung.ungrestautran;

import android.database.sqlite.SQLiteDatabase;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private MyManage objMyManage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Request Database
        objMyManage = new MyManage(this);

        //Test Add Value
        //testAddValue();

        //Clean data
        cleanData();

        //Synchronize JSON to SQLite
        synJSONtoSQLite();


    }   // Main Method

    private void synJSONtoSQLite() {

        //Change Policy
        StrictMode.ThreadPolicy myPolicy = new StrictMode.ThreadPolicy
                .Builder().permitAll().build();
        StrictMode.setThreadPolicy(myPolicy);

        int intTable = 1;
        String tag = "Restaurant";

        while (intTable <= 2) {

            //1. Create InputStream
            InputStream objInputStream = null;
            String strURLuser = "http://swiftcodingthai.com/6feb/php_get_data_master.php";
            String strURLfood = "http://swiftcodingthai.com/6feb/php_get_data_food.php";

            try {

            } catch (Exception e) {
                Log.d(tag, "InputStream ==> " + e.toString());
            }


            //2. Create JSON String

            //3. Update SQLite



            intTable += 1;
        }   // while
    }   // synJSONtoSQLite

    private void cleanData() {

        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        objSqLiteDatabase.delete(MyManage.food_TABLE, null, null);
        objSqLiteDatabase.delete(MyManage.user_TABLE, null, null);

    }   //cleanData

    private void testAddValue() {

        for (int i=0;i<=1;i++) {
            objMyManage.addNewValue(i, "test1", "test2", "test3");
        }   //for

    }   // testAddValue

}   // Main Class
