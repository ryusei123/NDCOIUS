package com.example.kyky.indc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Bogor extends AppCompatActivity {
    ListView listView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bogor);
        listView = (ListView) findViewById(R.id.listv);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 2:
                        Intent mk = new Intent(Bogor.this, Laksabogor.class);
                        startActivity(mk);
                        Toast.makeText(getApplicationContext(),"Laksa Bogor", Toast.LENGTH_SHORT).show();

                        break;


                }
            }
        });

    }

}
