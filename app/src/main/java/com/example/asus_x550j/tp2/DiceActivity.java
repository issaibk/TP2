package com.example.asus_x550j.tp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

public class DiceActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textResult;
    private int max;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        max = getIntent().getIntExtra("max", 0);// means if max is not defined zero is the default value

        TextView textTitle=(TextView)findViewById(R.id.textTitle);
        textTitle.setText(max+" sided dice");

        textResult=((TextView)findViewById(R.id.textResult));
        textResult.setText("");

        Button buttonRoll=(Button)findViewById(R.id.buttonRoll);
        buttonRoll.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        SecureRandom random = new SecureRandom();
        int result = random.nextInt(max) + 1;
        textResult.setText(String.valueOf(result));
    }


    //Begin bloc conserver la modification lors de la rotation
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("aux",Integer.parseInt(textResult.getText().toString()));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int aux=savedInstanceState.getInt("aux");
        textResult.setText(String.valueOf(aux));
    }

    //End bloc conserver la modification lors de la rotation
}
