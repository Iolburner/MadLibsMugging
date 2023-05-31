package com.example.madlibsmugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private EditText etName;

    private EditText etCity;

    private EditText etObject;

    private EditText etVerb;

    private EditText etObject2;

    private EditText etName2;

    private EditText etAdjective;

    private EditText etEmotion;

    private EditText etVehicle;

    private Button btnGenerate;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.et_name)

    }
}