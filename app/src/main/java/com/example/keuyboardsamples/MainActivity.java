package com.example.keuyboardsamples;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private String mSpinnerLabel = "";
    private static final String TAG =MainActivity.class.getSimpleName() ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.label_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    public void showText(View view) {
        EditText editText = (EditText) findViewById(R.id.hint_phonenumber);
        if (editText != null) {
            String showString = editText.getText().toString()+ " - " + mSpinnerLabel;
            Toast.makeText(this, showString, Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        mSpinnerLabel = adapterView.getItemAtPosition(i).toString();
        showText(view);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Log.d(TAG, getString(R.string.onnothingselected));
    }

    public void navgate(View view) {
        Intent intent = new Intent(this, alert_sample.class);
        startActivity(intent);
    }
    public void navgateDate(View view) {
        Intent intent = new Intent(this, Date_Time.class);
        startActivity(intent);
    }
}