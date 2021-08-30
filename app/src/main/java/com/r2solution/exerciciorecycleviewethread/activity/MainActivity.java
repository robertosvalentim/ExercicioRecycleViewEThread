package com.r2solution.exerciciorecycleviewethread.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.r2solution.exerciciorecycleviewethread.R;
import com.r2solution.exerciciorecycleviewethread.adapter.Adapter;
import com.r2solution.exerciciorecycleviewethread.model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Pedido> pedidos = new ArrayList<>();
    private ArrayList<Pedido> pedidosAuxiliar = new ArrayList<>();
    private Button btAtualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        btAtualizar = findViewById(R.id.button_atualizar);
        criarPedidos();

        btAtualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Teste","Entrando na função dentro do botão");
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Log.i("Teste","Dentro da Thread");

                            for (int i = 0; i < pedidos.size(); i++) {
                                Log.i("Teste","Dentro do laço for "+i);
                                Thread.sleep(1000);

                                pedidosAuxiliar.add(pedidos.get(i));
                                Adapter adapter = new Adapter(pedidos);
                                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
                                recyclerView.post(new Runnable() {
                                    @Override
                                    public void run() {
                                        recyclerView.setLayoutManager(layoutManager);
                                        recyclerView.setHasFixedSize(true);
                                        recyclerView.setAdapter(adapter);
                                    }
                                });
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });
    }

    public void criarPedidos() {
        Pedido pedido1 = new Pedido(1, 350.0);
        Pedido pedido2 = new Pedido(2, 15.30);
        Pedido pedido3 = new Pedido(3, 10.00);
        Pedido pedido4 = new Pedido(4, 350.0);
        Pedido pedido5 = new Pedido(5, 15.30);
        Pedido pedido6 = new Pedido(6, 10.00);
        Pedido pedido7 = new Pedido(7, 350.0);
        Pedido pedido8 = new Pedido(8, 15.30);
        Pedido pedido9 = new Pedido(9, 10.00);
        Pedido pedido10 = new Pedido(10, 350.0);
        Pedido pedido11 = new Pedido(11, 15.30);

        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido4);
        pedidos.add(pedido5);
        pedidos.add(pedido6);
        pedidos.add(pedido7);
        pedidos.add(pedido8);
        pedidos.add(pedido9);
        pedidos.add(pedido10);
    }


}