package com.example.preworkassignment_huzeyfa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button firstButton;
    Button secondButton;
    Button thirdButton;
    View rootView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstButton = findViewById(R.id.button);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Get the input from user
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                //If user doesn't type anything don't set the text string to be default
                if (TextUtils.isEmpty(newText)){
                    ((TextView) findViewById(R.id.textView)).setText("Hello From Huzeyfa!");
                }
                else {
                    //otherwise display the text user inputted.
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }
            }
        });
        secondButton = findViewById(R.id.button2);
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Change background color to pink
                findViewById(R.id.RootView).setBackgroundColor(
                        getResources().getColor(R.color.purple_200)
                );
            }
        });
        thirdButton = findViewById(R.id.button3);
        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Change the text color to teal_200
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.teal_700));
            }
        });
        rootView = findViewById(R.id.RootView);
        rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Rest the text string
                ((TextView) findViewById(R.id.textView)).setText("Hello From Huzeyfa!");

                //Rest the view color
                findViewById(R.id.RootView).setBackgroundColor(
                        getResources().getColor(R.color.purple_700)
                );

                //Reset the text color
                ((TextView)  findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.white));
            }
        });
    }
}