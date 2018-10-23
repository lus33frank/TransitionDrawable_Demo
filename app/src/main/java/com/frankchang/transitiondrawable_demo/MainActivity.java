package com.frankchang.transitiondrawable_demo;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private TransitionDrawable transition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgShow = findViewById(R.id.imgShow);
        transition = (TransitionDrawable) getResources()
                .getDrawable(R.drawable.photo, null);
        imgShow.setImageDrawable(transition);
    }

    public void loadingOnClick(View view) {
        transition.startTransition(6000);
    }

}
