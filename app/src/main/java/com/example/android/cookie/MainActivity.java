package com.example.android.cookie;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void eat(View v){
        ImageView changeImage = (ImageView) findViewById(R.id.image);
        changeImage.setImageResource(R.drawable.after_cookie);

        TextView changeText = (TextView) findViewById((R.id.text));
        changeText.setText("I'm FUll!");

    }
}
