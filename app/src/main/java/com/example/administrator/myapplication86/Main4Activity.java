package com.example.administrator.myapplication86;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void onButtonClick1(View v)
    {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntent);
    }

    public void onButtonClick2(View v)
    {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-000-0000"));
        startActivity(myIntent);
    }

    public void onButtonClick3(View v)
    {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.daum.net"));
        startActivity(myIntent);
    }

    public void onButtonClick4(View v)
    {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.nl"));
        startActivity(myIntent);
    }

    public void four(View vi) {
        Intent i = new Intent(this, Main5Activity.class);
        startActivity(i);
    }


}
