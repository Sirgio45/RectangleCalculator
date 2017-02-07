package com.ebookfrenzy.rectanglecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    TextView areaResults;
    TextView perimeterResults;

    EditText enterWidthText;
    EditText enterHeightText;

    Button startButton;





    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        areaResults = (TextView)findViewById(R.id.areaResultTextView);
        perimeterResults = (TextView)findViewById(R.id.perimeterResultTextView);

        enterWidthText = (EditText)findViewById(R.id.widthEnterEditText);
        enterHeightText = (EditText)findViewById(R.id.heightEnterEditText);

        startButton = (Button)findViewById(R.id.startCalculationBtn);


        startButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                double width = Double.parseDouble(enterWidthText.getText().toString());
                double height= Double.parseDouble(enterHeightText.getText().toString());

                double calcArea = width * height;
                double calcPerimeter =(width+height)*2;

                areaResults.setText(String.valueOf(calcArea));

                perimeterResults.setText(String.valueOf(calcPerimeter));


            }
        });




    }
}
