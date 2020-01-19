package com.example.login.ui.appointments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.login.R;

public class AppointmentsFragment extends Fragment {

    private AppointmentsViewModel appointmentsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        appointmentsViewModel =
                ViewModelProviders.of(this).get(AppointmentsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_appointments, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);

        return root;
    }
}