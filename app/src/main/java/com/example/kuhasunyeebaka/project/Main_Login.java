package com.example.kuhasunyeebaka.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button sentlogin = (Button) findViewById(R.id.login);
                sentlogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent L = new Intent(Main_Login.this, Profile.class);
                        startActivity(L);
                    }
                });
    }
}
