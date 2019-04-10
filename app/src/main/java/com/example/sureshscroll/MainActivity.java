package com.example.sureshscroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText etName, etYear, etColour, etPrice, etEngineSize;
private TextView tvOutput;
private Button bButton1, bButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.etName);
        etYear = (EditText) findViewById(R.id.etYear);
        etColour = (EditText) findViewById(R.id.etColour);
        etPrice = (EditText) findViewById(R.id.etPrice);
        etEngineSize = (EditText) findViewById(R.id.etEngineSize);

        tvOutput = (TextView) findViewById(R.id.tvOutput);
        bButton1 = (Button) findViewById(R.id.bButton1);
        bButton2 = (Button) findViewById(R.id.bButton2);

        bButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();

                String year = etYear.getText().toString();
                String colour = etColour.getText().toString();
                String price = etPrice.getText().toString();
                String engineSize = etEngineSize.getText().toString();

                tvOutput.setText("Name:\t" + name + "\nYear:\t" + year +  "\nColour:\t" + colour + "\nPrice:\t" + price +  "\nEnginesize:\t" + engineSize);
            }
        });

        bButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
