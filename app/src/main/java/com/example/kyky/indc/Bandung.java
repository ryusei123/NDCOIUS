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
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent mk = new Intent(Bandung.this, MieKocok.class);
                        startActivity(mk);
                        Toast.makeText(getApplicationContext(),"Mie Kocok", Toast.LENGTH_SHORT).show();

                        break;

                    case 1:
                        Intent gp = new Intent(Bandung.this, Gepuk.class);
                        startActivity(gp);
                        Toast.makeText(getApplicationContext(),"Gepuk", Toast.LENGTH_SHORT).show();

                        break;
                }
            }
        });

    }

}

//String selected_item = String.valueOf(adapterView.getItemAtPosition(i));
//Toast.makeText(Bandung.this,selected_item,Toast.LENGTH_SHORT).show();