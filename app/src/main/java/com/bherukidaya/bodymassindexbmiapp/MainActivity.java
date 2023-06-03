package com.bherukidaya.bodymassindexbmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;
        EditText i,f,w;
        TextView r;
        LinearLayout LM=findViewById(R.id.llm);
        btn = findViewById(R.id.btn);
        f=findViewById(R.id.edtHft);
        i=findViewById(R.id.edtHin);
        w=findViewById(R.id.edtW);
        r=findViewById(R.id.txtR);
        btn.setOnClickListener(new View.OnClickListener(){

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
              int inch= Integer.parseInt( i.getText().toString());
              int feet= Integer.parseInt(f.getText().toString());
              int weight=Integer.parseInt(w.getText().toString());
              int totalin= feet*12 +inch;
              double totalcm= totalin*2.53;
              double totalm= totalcm/100;
              double BMI=weight/(totalm*totalm);
              if(BMI>25){
                  LM.setBackgroundColor(getResources().getColor(R.color.red));
                  r.setText("your are overweight");}
              else if(BMI<18){
                  r.setText("your underweight");
                LM.setBackgroundColor(getResources().getColor(R.color.yello));}
              else {
                  r.setText("you are Healthy");
                  LM.setBackgroundColor(getResources().getColor(R.color.green));
              }
            }
        });

    }
}