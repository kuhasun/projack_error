package com.example.kuhasunyeebaka.project;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnNews = (Button) findViewById(R.id.button2);
        btnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A = new Intent(MainActivity.this, ListView_News.class);
                startActivity(A);
            }
        });



        Button btnFootball = (Button) findViewById(R.id.button3);
        btnFootball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B = new Intent(MainActivity.this, Table_Football.class);
                startActivity(B);
            }
        });

        Button btnLogin = (Button) findViewById(R.id.button);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent C = new Intent(MainActivity.this, Main_Login.class);
                startActivity(C);
            }
        });

    }

}