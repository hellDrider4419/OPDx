package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import android.widget.TextView;


import com.example.login.ui.hospitals.HospitalsFragment;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public class Hospital3Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {

    public int x;
    int n = 4;
    public String array[]=new String[n];
    public String a[]={"sdaasafasf","shubham","sameer","mayank"};
    TextView sam;
    TextView date;
    DatePickerDialog.OnDateSetListener dateSetListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital3);
        Spinner spinner = (Spinner) findViewById(R.id.spinner3);
        spinner.setOnItemSelectedListener(this);

        date = (TextView) findViewById(R.id.datec);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                int month = cal.get(Calendar.MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        Hospital3Activity.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth,dateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                Log.w("date:",Integer.toString(year)+Integer.toString(month)+Integer.toString(day));
            }
        };

        for(int i = 0;i<n;++i){
            array[i] = Integer.toString(i);
        }

        sam = findViewById(R.id.sam3);

        //
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,array);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

    }


    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        x = pos;
        sam(x);
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

    public  void  sam(int y){
        Log.w("hello: ",array[y]);
        sam.setText(array[y]);

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
