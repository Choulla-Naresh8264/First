package com.may6.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class InterestActivity extends AppCompatActivity {

    EditText editAmount, editRate;
    TextView tvResult;
    CheckBox checkRound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);

        editAmount = (EditText) findViewById( R.id.editAmount);
        editRate = (EditText) findViewById( R.id.editRate);
        tvResult  = (TextView) findViewById( R.id.tvResult);
        checkRound = (CheckBox) findViewById( R.id.checkRound);
    }

    public void calculate(View v) {

        double  amount  =  Double.parseDouble(editAmount.getText().toString());
        double rate  =  Double.parseDouble(editRate.getText().toString());

        double  result = amount * rate / 100;

        if (checkRound.isChecked())
             result = Math.round(result);

        tvResult.setText( String.valueOf(result));

    }

}
