package com.example.asus_x550j.tp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button6=(Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,DiceActivity.class);
                intent.putExtra("max", 6);
                startActivity(intent);
            }
        });

        Button button20=(Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,DiceActivity.class);
                intent.putExtra("max", 20);
                startActivity(intent);
            }
        });
    }
}
