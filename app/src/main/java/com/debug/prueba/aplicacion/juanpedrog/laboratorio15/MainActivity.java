package com.debug.prueba.aplicacion.juanpedrog.laboratorio15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    String datos[][]={{"Juan Pedro Gil Llanos","14400941","ISC"},
            {"Juan Pedro Gil Llanos","14400941","ISC"},
            {"Juan Pedro Gil Llanos","14400941","ISC"},
            {"Juan Pedro Gil Llanos","14400941","ISC"},
            {"Juan Pedro Gil Llanos","14400941","ISC"},
            {"Juan Pedro Gil Llanos","14400941","ISC"},
            {"Juan Pedro Gil Llanos","14400941","ISC"},
            {"Juan Pedro Gil Llanos","14400941","ISC"}};
    Adapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.lista);
        adapter=new Adapter(datos);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
    }
}
