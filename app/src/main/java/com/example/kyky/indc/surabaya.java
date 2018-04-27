package com.example.kyky.indc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class surabaya extends AppCompatActivity {
    ListView listView;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surabaya);
        listView = (ListView) findViewById(R.id.listv);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent mk = new Intent(surabaya.this, rujakcingur.class);
                        startActivity(mk);
                        Toast.makeText(getApplicationContext(),"Rujak Cingur", Toast.LENGTH_SHORT).show();

                        break;


                }
            }
        });

    }

}