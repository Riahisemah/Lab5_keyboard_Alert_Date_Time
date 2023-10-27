package com.example.keuyboardsamples;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class alert_sample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_sample);
    }

    public void onClickShowText(View view) {
        AlertDialog.Builder myAlertBuilder = new
                AlertDialog.Builder(alert_sample.this);
        myAlertBuilder.setTitle(R.string.alert_title);
// Set the dialog message.
        myAlertBuilder.setMessage(R.string.alert_message);
        myAlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
// User clicked OK button.
                Toast.makeText(getApplicationContext(), R.string.press_ok,
                        Toast.LENGTH_SHORT).show();
            }
        });
       myAlertBuilder.setNegativeButton("Cancel", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
// User cancelled the dialog.
                        Toast.makeText(getApplicationContext(), R.string.cancel,
                                Toast.LENGTH_SHORT).show();
                    }
                });
        myAlertBuilder.show();
    }
}