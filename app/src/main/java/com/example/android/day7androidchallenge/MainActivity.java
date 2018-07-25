package com.example.android.day7androidchallenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //First get the view of the image by id then use a control flow statement to check the visibility
        final ImageView image= findViewById(R.id.download);
        final Button button= findViewById(R.id.button) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(image.getVisibility()==VISIBLE){
                    button.setText("Show Image");
                    image.setVisibility(INVISIBLE);

                }
                else{
                    button.setText("Hide Image");
                    image.setVisibility(View.VISIBLE);
                }
            }

        });

    }



}
