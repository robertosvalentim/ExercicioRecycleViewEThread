package com.r2solution.exerciciorecycleviewethread.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.r2solution.exerciciorecycleviewethread.R;
import com.r2solution.exerciciorecycleviewethread.adapter.Adapter;
import com.r2solution.exerciciorecycleviewethread.model.Arquivo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Arquivo> arquivos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        Adapter adapter = new Adapter(arquivos);

        criarArquivos();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

    public void criarArquivos(){
        Arquivo arquivo1 = new Arquivo("Vídeo - Homen Aranha",500000.00);
        Arquivo arquivo2 = new Arquivo("AtubeCatch",15000.00);
        Arquivo arquivo3 = new Arquivo("AtubeCatch",20500.00);

        arquivos.add(arquivo1);
        arquivos.add(arquivo2);
        arquivos.add(arquivo3);
    }
}