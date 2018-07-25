package com.example.kuhasunyeebaka.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        Button sentprofile = (Button) findViewById(R.id.profile);
        sentprofile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent P = new Intent(Profile.this, Main2.class);
                startActivity(P);
            }
        });
    }
}
