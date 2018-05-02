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
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Scanner;


public class MainActivity extends AppCompatActivity {
    private RequestQueue requestQueue;
    String TAG = "Main Activity";
    public Button button;
    public Button buttonr;
    public String info;
    public int sum1 =0;
    public int sum2 = 0;

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
                intent.setData(Uri.parse("https://www.google.es/"));
                startActivity(intent);
            }
        });

        //startAPICall("Apple Inc.");

//        buttona = (Button) findViewById(R.id.button1);
//        buttona.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                String b1 = info;
////                TextView b2 = (TextView) findViewById(R.id.textView3);
////                b2.setText(b1);
//
//            }
//        });
    }


    public void buttonOnclick1(final View v) {
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
//            image1.setImageResource(R.drawable.imageTree);
        } else {
            ((Button) v).setText("Surprise");
            image1.setImageResource(R.drawable.horror);
        }
    }

//    public void doSomething(String v) {
//        startAPICall("Apple Inc.");
//       // TextView view3 = (TextView) findViewById(R.id.textView3);
//    }
    public void buttonOnclick2(View v) {
        int n = (int) (Math.random() * 6) + 1;
        int m = (int) (Math.random() * 6) + 1;
        int l = (int) (Math.random() * 6) + 1;
        TextView ab = (TextView) findViewById(R.id.textView12);
        TextView bc = (TextView) findViewById(R.id.textView11);
        TextView cd = (TextView) findViewById(R.id.textView10);
        ab.setText(""+ n);
        bc.setText(""+ m);
        cd.setText("" + l);
        sum1 = n + m +l;

    }
    public void buttonOnclick3(View v) {
        int n = (int) (Math.random() * 6) + 1;
        int m = (int) (Math.random() * 6) + 1;
        int l = (int) (Math.random() * 6) + 1;
        TextView ab = (TextView) findViewById(R.id.textView21);
        TextView bc = (TextView) findViewById(R.id.textView22);
        TextView cd = (TextView) findViewById(R.id.textView20);
        ab.setText(""+ n);
        bc.setText(""+ m);
        cd.setText("" + l);
        sum2 = n + m + l;

    }

    public void buttonClick4(View v) {
        TextView fg = (TextView) findViewById(R.id.textView3);
        if (sum1 > sum2) {
             fg.setText("Player 1 Win");
        } else if (sum1 < sum2) {
            fg.setText("Player 2 Win");
        } else {
            fg.setText("No Winner");
        }

    }

//    public String getFormat(final String json) {
//        if (json == null) {
//            return null;
//        }
//        JsonParser parser = new JsonParser();
//        JsonObject result = parser.parse(json).getAsJsonObject();
//        JsonObject a1 = result.getAsJsonObject("data");
//        String a2 = a1.get("attribute").getAsString();
//        return a2;
//
//    }




//   void startAPICall(String company) {
//        try{
//            Log.d(TAG,"im 2");
//            JsonObjectRequest something = new JsonObjectRequest(
//                    Request.Method.GET,
//                    "https://api.iextrading.com/1.0/stock/" + company + "/chart/Id",
//                    null,
//                    new Response.Listener<JSONObject>() {
//                        @Override
//                        public void onResponse(final JSONObject response) {
////                            TextView some = (TextView) findViewById(R.id.textView3);
////                            some.setText(response.toString());
//                            //info = getFormat(response.toString());
//                            Log.d(TAG, "im");
//                        }
//                    }, new Response.ErrorListener() {
//                @Override
//                public void onErrorResponse(final VolleyError error) {
//                    Log.v(TAG, error.toString());
//                }
//            });
//Log.d(TAG,"im3");
//            requestQueue.add(something);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }


}
