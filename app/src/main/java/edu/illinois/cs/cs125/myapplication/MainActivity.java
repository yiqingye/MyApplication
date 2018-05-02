package edu.illinois.cs.cs125.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.RequestQueue;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Scanner;


public class MainActivity extends AppCompatActivity {
    private RequestQueue requestQueue;
    String TAG = "Main Activity";
    public Button button;

    //TextView searchResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        final Button refreshButton = (Button) findViewById(R.id.refresher);
//        refreshButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(final View v) {
//                log.d(TAG, "after click");
//            }
//        }
        button = (Button) findViewById(R.id.rule);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Reversi"));
                startActivity(intent);
            }
        });


        //searchResult = (TextView) findViewById(R.id.searchbar);
//        final Button refreshButton = findViewById(R.id.refresher);
//        refreshButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(final View v) {
//                Log.d(TAG, "after click, refresh anime results");
////                startAPICall();
//            }
//        });
    }
//    public void buttonOnclick(View v) {
//        Button button = (Button) v;
//        ((Button) v).setText("complete");


    public void buttonOnclick1(View v) {
        double a = Math.random() * 10000000;
        int b = (int) a;
        Button button = (Button) v;
        ImageView image1 = (ImageView) findViewById(R.id.imageView);
        image1.setImageResource(R.drawable.blank);
        if (b % 10 == 0) {
            ((Button) v).setText("Very Lucky");
            image1.setImageResource(R.drawable.pikachu);
        } else if (b % 4 == 0) {
            ((Button) v).setText("Lucky");
            image1.setImageResource(R.drawable.asmile);
        } else if (b % 3 == 0) {
            ((Button) v).setText("normal");
            image1.setImageResource(R.drawable.pikachu);
        } else if (b % 2 == 0) {
            ((Button) v).setText("Try again");
        } else {
            ((Button) v).setText("Surprise");
            image1.setImageResource(R.drawable.horror);
        }
    }
    public void doSomething(View v) {
        Scanner input = new Scanner(System.in);
        String anime1 = input.nextLine();
        startAPICall("anime");
        TextView view3 = (TextView) findViewById(R.id.textView3);
        view3.setText()
    }

//    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
//            Request.Method.GET,
//            "http://thecatapi.com/api/",
//            null,
//            new Response.Listener<JSONArray>() {
//                public void onResponse(JsonArray response) {
//
//                }
//            }, new Response.ErrorListener() {
//        @Override
//        public void onErrorResponse(VolleyError error) {
//            Log.w(TAG, error.toString());
//        }
//    });




   void startAPICall(String anime) {
        try{

            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                    Request.Method.GET,
                    "http://kitsu.io/api/edge" + anime,
                    null,
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(final JSONObject response) {
                            Log.d(TAG, response.toString());
                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(final VolleyError error) {
                    Log.v(TAG, error.toString());
                }
            });
            requestQueue.add(jsonObjectRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
