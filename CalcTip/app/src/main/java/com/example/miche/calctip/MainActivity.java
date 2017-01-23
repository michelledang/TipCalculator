package com.example.miche.calctip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String totalStr = "";

    public void button_calc(View view){

        EditText finalTotal = (EditText) findViewById(R.id.total_num);
        totalStr = finalTotal.getText().toString();
        calculate(totalStr);
    }


    private void calculate(String totalSoFarStr) {

        int totalSoFarNum;
        int tipTotal;

        totalSoFarNum = Integer.parseInt(totalSoFarStr);
        tipTotal = totalSoFarNum * (3/20);

        TextView totalNum = (TextView) findViewById(R.id.tip_total);
        totalNum.setText(totalSoFarStr);

    }
}
