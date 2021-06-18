package com.example.myjamaat_sp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<ModelMasjid> masjidList;
    public static ArrayAdapter<ModelMasjid> arrayAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listMasjid);
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.myjamaat_sp", Context.MODE_PRIVATE);
        Log.i("saved String", sharedPreferences.getString("masjidListStorable"," NOT FOUND") );

        try {
            masjidList = Storable.decode(sharedPreferences.getString("masjidListStorable",Storable.encode(new ArrayList<ModelMasjid>())));
            arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, masjidList);
            listView.setAdapter(arrayAdapter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Button btnadd = findViewById(R.id.btnAdd);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                masjidList.remove(position);
                arrayAdapter.notifyDataSetChanged();
                sharedPreferences.edit().putString("masjidListStorable", Storable.encode(masjidList)).apply();
            }
        });

    }


    public void  Add(View view){
        Intent intent = new Intent(this, EditTime.class);
        startActivity(intent);
    }
}