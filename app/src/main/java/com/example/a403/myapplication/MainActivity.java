package com.example.a403.myapplication;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView, textView2;
    Switch switch1;
    RadioGroup radioGroup;
    RadioButton radioButton, radioButton2, radioButton3;
    ImageView imageView3;
    Button button, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");
        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        switch1 = (Switch)findViewById(R.id.switch1);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton = (RadioButton)findViewById(R.id.radioButton);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton)findViewById(R.id.radioButton3);
        imageView3 = (ImageView)findViewById(R.id.imageView3);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(switch1.isChecked() == true){
                    textView2.setVisibility(View.VISIBLE);
                    radioGroup.setVisibility(View.VISIBLE);
                    imageView3.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);

                }else{
                    textView2.setVisibility(View.INVISIBLE);
                    radioGroup.setVisibility(View.INVISIBLE);
                    imageView3.setVisibility(View.INVISIBLE);
                    button.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (radioGroup.getCheckedRadioButtonId()) {
                    case R.id.radioButton:
                        imageView3.setImageResource(R.drawable.zelli);
                        break;
                    case R.id.radioButton2:
                        imageView3.setImageResource(R.drawable.kikat);
                        break;
                    case R.id.radioButton3:
                        imageView3.setImageResource(R.drawable.lolipap);
                        break;
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
