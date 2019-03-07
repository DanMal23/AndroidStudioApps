package com.example.danuta.ordtak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onOpen(View view)  {
        Intent in = new Intent( MainActivity.this, SecondActivity.class);  //Alt+Enter
        startActivity(in);
    }
    public void onOpen2(View view)  {
        Intent in = new Intent( MainActivity.this, ThirdActivity.class);  //Alt+Enter
        startActivity(in);
    }
    public void onOpen3(View view)  {
        Intent in = new Intent( MainActivity.this, FourthActivity.class);  //Alt+Enter
        startActivity(in);
    }
    public void onOpen4(View view)  {
        Intent in = new Intent( MainActivity.this, FifthActivity.class);  //Alt+Enter
        startActivity(in);
    }
    public void onOpen5(View view)  {
        Intent in = new Intent( MainActivity.this, SixthActivity.class);  //Alt+Enter
        startActivity(in);
    }
    public void onOpen6(View view)  {
        Intent in = new Intent( MainActivity.this, SeventhActivity.class);  //Alt+Enter
        startActivity(in);
    }
    public void onOpen7(View view)  {
        Intent in = new Intent( MainActivity.this, EightActivity.class);  //Alt+Enter
        startActivity(in);
    }
    public void onOpen8(View view)  {
        Intent in = new Intent( MainActivity.this, NinthActivity.class);  //Alt+Enter
        startActivity(in);
    }
}
