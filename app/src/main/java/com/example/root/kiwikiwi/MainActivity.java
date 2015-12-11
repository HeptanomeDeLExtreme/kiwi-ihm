package com.example.root.kiwikiwi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.root.kiwikiwi.model.Resto;
import com.example.root.kiwikiwi.model.RestoAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.listView);

        List<Resto> restos = genererRestos();

        RestoAdapter adapter = new RestoAdapter(MainActivity.this, restos);
        mListView.setAdapter(adapter);
    }

    private List<Resto> genererRestos() {
        List<Resto> restos = new ArrayList<>();
        restos.add(new Resto("", "C 'n P", "Ouvert..."));
        restos.add(new Resto("", "Snoop", "Ouvert !"));
        restos.add(new Resto("", "RU", "Ouvert."));
        restos.add(new Resto("", "Chez Cédric", "Fermé"));
        return restos;
    }
}