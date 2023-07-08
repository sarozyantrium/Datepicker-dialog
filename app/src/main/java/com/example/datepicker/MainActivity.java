package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_view=(TextView) findViewById(R.id.text_view);

        //to get current time
//        Calendar c=Calendar.getInstance();
//       int days=c.get(Calendar.DAY_OF_MONTH);
//    int month=c.get(Calendar.MONTH);
//     int year=c.get(Calendar.YEAR);

        text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog datePickerDialog=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayofmonth) {

                        text_view.setText(year+"/ "+(month+1)+" /"+dayofmonth);
                    }
                },0,0,0); //to start time to show 
                datePickerDialog.show();
            }
        });
    }
}



