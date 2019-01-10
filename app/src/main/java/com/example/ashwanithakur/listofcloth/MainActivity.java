package com.example.ashwanithakur.listofcloth;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
static  String s;
    Button b1,b2;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        sharedPreferences=PreferenceManager.getDefaultSharedPreferences(this);
        s=sharedPreferences.getString("key4","12545");




        b1=findViewById(R.id.b1);

        b2=findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

                    SharedPreferences.Editor edit =sharedPreferences.edit();
                    edit.putString("key4","no");
                    edit.apply();



            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                SharedPreferences.Editor edit =sharedPreferences.edit();
                edit.putString("key4","yes");
                edit.apply();



            }
        });



        if(s.equals("yes")){

            Toast.makeText(this,"yes",Toast.LENGTH_LONG).show();
        }
        else if(s.equals("no"))
        {
            Toast.makeText(this,"No",Toast.LENGTH_LONG).show();
        }





    }


}
