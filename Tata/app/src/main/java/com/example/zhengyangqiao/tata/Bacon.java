package com.example.zhengyangqiao.tata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Bacon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);
    }

    public void onClick(View view) {
        Intent x = new Intent(this, MainActivity.class);
        startActivity(x);
    }
}
