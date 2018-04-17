package com.example.kyky.indc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class Bandung extends AppCompatActivity {
    ListView listView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandung);


        listView = (ListView) findViewById(R.id.listv);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selected_item = String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(Bandung.this,selected_item,Toast.LENGTH_SHORT).show();
                Intent miekocok = new Intent(Bandung.this, MieKocok.class);
                startActivity(miekocok);
            }
        });

    }

}

