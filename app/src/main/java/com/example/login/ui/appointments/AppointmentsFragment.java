package com.example.login.ui.appointments;

import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.login.R;

public class AppointmentsFragment extends Fragment {

    LinearLayout LinearLayout1;
    CardView card1;
    TextView myText;
    public int x;
    int n = 4;
    public String array[]=new String[n];
    public String a[]={"sdaasafasf","shubham","sameer","mayank"};
    TextView sam;


    private AppointmentsViewModel appointmentsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        appointmentsViewModel =
                ViewModelProviders.of(this).get(AppointmentsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_appointments, container, false);
        //final TextView textView = root.findViewById(R.id.text_slideshow);

       /* card1 = root.findViewById(R.id.card1);
        LinearLayout1 = root.findViewById(R.id.LinearCard);
        myText = root.findViewById(R.id.myText);

        for(int i=1;i<=30;++i) {
            CardView card1 = new CardView(getActivity());
            //card1.addView(card);
            TextView textView = new TextView(getActivity());
            //textView.setTextSize(getResources().getDimension(R.dimen.textsize));
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25f);
            textView.setText("TextView");
            //textView.setText(x);
            //LinearLayout LinearLayout1 = new LinearLayout(getActivity());
            //LinearLayout1.addView(linearLayout1);
            LinearLayout1.addView(card1);
            card1.addView(textView);
        }*/
        Spinner spinner = (Spinner) root.findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
                x = pos;
                sam(x);
                // An item was selected. You can retrieve the selected item using
                // parent.getItemAtPosition(pos)
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        for(int i = 0;i<n;++i){
            array[i] = Integer.toString(i);
        }

        sam = root.findViewById(R.id.sam);

        //
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,array);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        return root;
    }


    public  void  sam(int y){
        Log.w("hello: ",array[y]);
        sam.setText(array[y]);

    }
}