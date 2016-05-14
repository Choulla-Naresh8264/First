package com.may6.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CourseActivity extends AppCompatActivity {
    Spinner spCourses;
    CheckBox cbOldStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        spCourses = (Spinner) findViewById(R.id.spCourses);
        cbOldStudent = (CheckBox)  findViewById(R.id.cbOldStudent);

        // dynamically adding items to spinner
        List<String> courses = new ArrayList<String>();
        courses.add("Android Programming");
        courses.add("Java Programming");
        courses.add("Asp.Net and Asp.net MVC");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item,courses);

        spCourses.setAdapter(adapter);
    }

    public void calculate(View v) {
        double fee = 0;

        switch( spCourses.getSelectedItemPosition() )
        {
            case 0 : fee = 5000; break;
            case 1 : fee = 4000; break;
            case 2 : fee = 6000; break;
        }

        if ( cbOldStudent.isChecked())
             fee = fee - (fee * 0.10);

        Toast.makeText(this, "Course Fee : " + fee ,  Toast.LENGTH_LONG).show();
    }
}
