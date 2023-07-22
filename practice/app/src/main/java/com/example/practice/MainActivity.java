package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Converter(View view){
          EditText txt = findViewById(R.id.editAmount);
          TextView msg = findViewById(R.id.amountView);
          boolean checked = ((RadioButton) view).isChecked();
          String res;
          if(view.getId() == R.id.bdtousd && checked)
          {
              double amount = Double.parseDouble(txt.getText().toString()) / 100.0;
              res = String.valueOf(amount);
              msg.setText( "$" + res);
          }
          else if(view.getId() == R.id.usdtobdt && checked)
          {
              double amount = Double.parseDouble(txt.getText().toString()) * 100.0;
              res = String.valueOf(amount);
              msg.setText(res + "/-");
          }
          else if(view.getId() == R.id.bdtoeuro && checked)
          {
              double amount = Double.parseDouble(txt.getText().toString()) / 120.0;
              res = String.valueOf(amount);
              msg.setText( "€" + res);
          }
          else if(view.getId() == R.id.Eurotobd && checked)
          {
              double amount = Double.parseDouble(txt.getText().toString()) * 120.0;
              res = String.valueOf(amount);
              msg.setText(res + "/-");
          }
          else
          {
             res = "Error!!";
              msg.setText(res);
          }

    }

}