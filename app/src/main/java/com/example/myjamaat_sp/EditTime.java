package com.example.myjamaat_sp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.io.IOException;
import java.io.Serializable;

import static com.example.myjamaat_sp.MainActivity.arrayAdapter;
import static com.example.myjamaat_sp.MainActivity.masjidList;

public class EditTime extends AppCompatActivity {


    EditText etName, ettFazr, ettZuhr, ettAsr, ettMaghrib, ettEsha;
    Switch swIsActive;
    String sqlValues;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_time);
        etName = findViewById(R.id.etName);
        ettFazr = findViewById(R.id.ettFazr);
        ettZuhr = findViewById(R.id.ettZuhr);
        ettAsr = findViewById(R.id.ettAsr);
        ettMaghrib = findViewById(R.id.ettMaghrib);
        ettEsha = findViewById(R.id.ettEsha);
        swIsActive = findViewById(R.id.swIsActive);
        TextView tvHead = findViewById(R.id.tvHead);



    }

    public void addMasjid(View view) throws IOException {

        ModelMasjid newMasjid = new ModelMasjid((masjidList.size()-1), etName.getText().toString()
                                    , swIsActive.isChecked(), ettFazr.getText().toString(),
                ettZuhr.getText().toString(), ettAsr.getText().toString(), ettMaghrib.getText().toString()
                , ettEsha.getText().toString());
        masjidList.add(newMasjid);
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.myjamaat_sp", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("masjidListStorable", Storable.encode(masjidList)).apply();
        arrayAdapter.notifyDataSetChanged();
        finish();
    }
    public void cancel(View view){
        finish();
    }
}
