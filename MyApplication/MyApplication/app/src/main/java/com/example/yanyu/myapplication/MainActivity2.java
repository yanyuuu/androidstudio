package com.example.yanyu.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * Created by Yan Yu on 28/3/2017.
 */

public class MainActivity2 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntentA2A1 = new Intent(MainActivity2.this,
                MainActivity.class);

        switch (item.getItemId()) {
            case R.id.activity1:
                startActivity(myIntentA2A1);
                return true;
            case R.id.activity2:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
