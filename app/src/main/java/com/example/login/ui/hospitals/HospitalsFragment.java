package com.example.login.ui.hospitals;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.login.Hospital1Activity;
import com.example.login.Hospital2Activity;
import com.example.login.Hospital3Activity;
import com.example.login.R;

public class HospitalsFragment extends Fragment implements AdapterView.OnItemClickListener{

    private HospitalsViewModel hospitalsViewModel;
    ListView lv;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        hospitalsViewModel =
                ViewModelProviders.of(this).get(HospitalsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_hospitals, container, false);
        //final TextView textView = root.findViewById(R.id.text_gallery);

        lv = (ListView) root.findViewById(R.id.listView);
        lv.setOnItemClickListener(this);
        return root;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String name = (String)parent.getItemAtPosition(position);

        if (name.equals("Hospital 1")) {
            startActivity(new Intent(getActivity(), Hospital1Activity.class));
        }else if (name.equals("Hospital 2")) {
            startActivity(new Intent(getActivity(), Hospital2Activity.class));
        }else if (name.equals("Hospital 3")) {
            startActivity(new Intent(getActivity(), Hospital3Activity.class));
        }

    }
}