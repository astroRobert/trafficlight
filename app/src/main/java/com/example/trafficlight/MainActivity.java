package com.example.trafficlight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView red;
    private ImageView yellow;
    private ImageView green;

    private Button redbutton;
    private Button yellowbutton;
    private Button greenbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red = findViewById(R.id.red_light);
        yellow = findViewById(R.id.yellow_light);
        green = findViewById(R.id.green_light);

        redbutton = findViewById(R.id.red_button);
        yellowbutton = findViewById(R.id.yellow_button);
        greenbutton = findViewById(R.id.green_button);

        redbutton =(Button)findViewById(R.id.red_button);
        yellowbutton = (Button)findViewById(R.id.yellow_button);
        greenbutton= (Button)findViewById(R.id.green_button);

        redbutton.setOnClickListener(this);
        yellowbutton.setOnClickListener(this);
        greenbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        turnlightsOff();
        if (view == redbutton) {
            turnOnRedLight();
        } else if (view == yellowbutton) {
            turnOnYellowLight();
        } else if (view == greenbutton) {
            turnOnGreenLight();
        }
    }

    private void turnlightsOff(){
        red.setImageResource(R.drawable.off);
        yellow.setImageResource(R.drawable.off);
        green.setImageResource(R.drawable.off);
    }

    private void turnOnGreenLight() {
        green.setImageResource(R.drawable.green);
    }

    private void turnOnRedLight() {
        red.setImageResource(R.drawable.red);
    }

    private void turnOnYellowLight() {yellow.setImageResource(R.drawable.yellow);
    }
}