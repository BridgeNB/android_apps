package com.example.zhengyangqiao.tata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class feature3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature3);
    }

    public void onClick(View view) {
        Intent x = new Intent(this, MainActivity.class);
        startActivity(x);
    }
}
