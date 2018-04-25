package edu.illinois.cs.cs125.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.SearchView;


public class MainActivity extends AppCompatActivity {
    //TextView searchResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //searchResult = (TextView) findViewById(R.id.searchbar);
    }
    public void buttonOnclick(View v) {
        Button button = (Button) v;
        ((Button) v).setText("complete");
    }
    public void buttonOnclick1(View v) {
        double a = Math.random() * 10000000;
        int b = (int) a;
        Button button = (Button) v;
        if (b % 104862387 == 0) {
            ((Button) v).setText("Very Lucky");
        } else if (b % 4 == 0) {
            ((Button) v).setText("Lucky");
        } else if (b % 3 == 0) {
            ((Button) v).setText("normal");
        } else if (b % 2 == 0) {
            ((Button) v).setText("Try again");
        } else {
            ((Button) v).setText(".....");
        }
    }


}
