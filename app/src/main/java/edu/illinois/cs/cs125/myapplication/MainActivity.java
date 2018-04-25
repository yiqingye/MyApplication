package edu.illinois.cs.cs125.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.SearchView;

import org.json.JSONObject;


import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    String TAG = "Main Activity";

    //TextView searchResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //searchResult = (TextView) findViewById(R.id.searchbar);
        final Button refreshButton = findViewById(R.id.refresher);
        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "after click, refresh anime results");
//                startAPICall();
            }
        });
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
//   void startAPICall()
//        }
//            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
//                    Request.Method.GET,
//                    "http://api.jikan.me/",
//                    null,
//                    new Response.Listener<JSONObject>() {
//                        @Override
//                        public void onResponse(final JSONObject response) {
//                            Log.d(TAG, response.toString());
//                        }
//                    }, new Response.ErrorListener() {
//                @Override
//                public void onErrorResponse(final VolleyError error) {
//                    Log.w(TAG, error.toString());
//                }
//            });
//            requestQueue.add(jsonObjectRequest);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//    }


}
