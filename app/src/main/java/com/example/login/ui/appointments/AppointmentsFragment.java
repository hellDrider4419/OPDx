package com.example.login.ui.appointments;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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


    private AppointmentsViewModel appointmentsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        appointmentsViewModel =
                ViewModelProviders.of(this).get(AppointmentsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_appointments, container, false);
        //final TextView textView = root.findViewById(R.id.text_slideshow);

        card1 = root.findViewById(R.id.card1);
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
        }

        return root;
    }
}