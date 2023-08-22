package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String[] places = {"Bengaluru","Mysore","Nanjanagudu","Jog Falls","Agumbe", "Dharmastala",
            "Badami","Hampi", "Bagali", "Manasa Sarovara", "Mantralaya", "Chamundi Hills", "Sirsi",
            "Mahadeswara Hills", "Nandi Hills","Bijapura", "Daroji Karadi Dhama" , "SiddaroodaMatt", "Horanadu",
            "Sringeri","Udupi", "Madikeri", "Talakadu", "Mekedatu", "Yediyur",
            "Adichunchanagiri", "Chitradurga","Kottur","Sangama"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.places);
        Adapter adapter = new ArrayAdapter<String> (this,R.layout.activity_listview, places);
        listView.setAdapter((ListAdapter) adapter);
    }
}