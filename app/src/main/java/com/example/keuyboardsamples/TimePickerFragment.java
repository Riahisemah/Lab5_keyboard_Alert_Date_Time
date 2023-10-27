package com.example.keuyboardsamples;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TimePicker;


public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
// Use the current time as the default values for the picker.
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
// Create a new instance of TimePickerDialog and return it.
        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
// Set the activity to the Main Activity.
        Date_Time activity = (Date_Time) getActivity();
// Invoke Main Activity's processTimePickerResult() method.
        activity.processTimePickerResult(hourOfDay, minute);
    }
}