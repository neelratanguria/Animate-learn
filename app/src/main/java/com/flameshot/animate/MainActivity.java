package com.flameshot.animate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView_bart;
    ImageView imageView_homer;
    boolean yes = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView_bart = findViewById(R.id.imgView);
        imageView_homer = findViewById(R.id.imgView_homer);
    }

    public void fade(View view)
    {
        if (yes)
        {
            imageView_bart.animate().alpha(0.0f).setDuration(2000);
            imageView_homer.animate().alpha(1f).setDuration(2000);
            yes = false;
        }
        else
        {
            imageView_bart.animate().alpha(1f).setDuration(2000);
            imageView_homer.animate().alpha(0f).setDuration(2000);
            yes = true;
        }

    }

}
