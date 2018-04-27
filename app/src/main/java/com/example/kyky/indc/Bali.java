package com.example.kyky.indc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Bali extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bali);
        listView = (ListView) findViewById(R.id.listv);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent mk = new Intent(Bali.this, ayambetutu.class);
                        startActivity(mk);
                        Toast.makeText(getApplicationContext(),"Ayam Betutu", Toast.LENGTH_SHORT).show();

                        break;

                    case 1:
                        Intent gp = new Intent(Bali.this, satelilit.class);
                        startActivity(gp);
                        Toast.makeText(getApplicationContext(),"Sate lilit", Toast.LENGTH_SHORT).show();

                        break;
                }
            }
        });

    }

}
