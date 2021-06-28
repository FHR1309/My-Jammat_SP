package com.example.myjamaat_sp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.View;
import android.widget.TextView;

import static com.example.myjamaat_sp.MainActivity.*;


public class show_masjids_Fragment extends Fragment {


    public show_masjids_Fragment() { super(R.layout.example_fragment); }
    @Override
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvFazr = view.findViewById(R.id.tvFazr);
        TextView tvZuhr = view.findViewById(R.id.tvZuhr);
        TextView tvAsr = view.findViewById(R.id.tvAsr);
        TextView tvMaghrib = view.findViewById(R.id.tvMaghrib);
        TextView tvEsha = view.findViewById(R.id.tvEsha);
        int positionInt = requireArguments().getInt("position");
        tvName.setText(masjidList.get(positionInt).getName());
        tvFazr.setText(masjidList.get(positionInt).getFazr());
        tvZuhr.setText(masjidList.get(positionInt).getZuhr());
        tvAsr.setText(masjidList.get(positionInt).getAsr());
        tvMaghrib.setText(masjidList.get(positionInt).getMaghrib());
        tvEsha.setText(masjidList.get(positionInt).getEsha());




    }

}