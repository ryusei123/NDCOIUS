package com.example.kyky.indc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    CustomAdapter adapter;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lv = (ListView) findViewById(R.id.lv);
        adapter = new CustomAdapter(this, getData());
        lv.setAdapter(adapter);

lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        switch (position){
            case 0:
                Intent kebdg = new Intent(Home.this,Bandung.class);
                startActivity(kebdg);
                Toast.makeText(getApplicationContext(),"Bandung", Toast.LENGTH_SHORT).show();

                break;

            case 1:
                Intent kebali = new Intent(Home.this,Bali.class);
                startActivity(kebali);
                Toast.makeText(getApplicationContext(),"Bali", Toast.LENGTH_SHORT).show();

                break;

            case 2:
                Intent kepdg = new Intent(Home.this,Padang.class);
                startActivity(kepdg);
                Toast.makeText(getApplicationContext(),"Padang", Toast.LENGTH_SHORT).show();

                break;
            case 3:
                Intent kesby = new Intent(Home.this,surabaya.class);
                startActivity(kesby);
                Toast.makeText(getApplicationContext(),"Surabaya", Toast.LENGTH_SHORT).show();

                break;
            case 4:
                Intent kebgr = new Intent(Home.this,Bogor.class);
                startActivity(kebgr);
                Toast.makeText(getApplicationContext(),"Bogor", Toast.LENGTH_SHORT).show();

                break;
        }

    }
});

    }

    private ArrayList getData() {
        ArrayList<Spacecraft> spacecrafts = new ArrayList<>();

        Spacecraft s = new Spacecraft();
        s.setName("Bandung");
        s.setPropellant("Jawa Barat");
        s.setImage(R.drawable.bandug);
        spacecrafts.add(s);

        s = new Spacecraft();
        s.setName("Bali");
        s.setPropellant("Pulau Bali");
        s.setImage(R.drawable.bali);
        spacecrafts.add(s);

        s = new Spacecraft();
        s.setName("Padang");
        s.setPropellant("Sumatera Barat");
        s.setImage(R.drawable.padang);
        spacecrafts.add(s);

        s = new Spacecraft();
        s.setName("Surabaya");
        s.setPropellant("Jawa Barat");
        s.setImage(R.drawable.surabaya);
        spacecrafts.add(s);

        s = new Spacecraft();
        s.setName("Bogor");
        s.setPropellant("Jawa Timur");
        s.setImage(R.drawable.bogorkbn);
        spacecrafts.add(s);

        return spacecrafts;
    }

}

