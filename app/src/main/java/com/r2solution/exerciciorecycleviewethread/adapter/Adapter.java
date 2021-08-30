package com.r2solution.exerciciorecycleviewethread.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.r2solution.exerciciorecycleviewethread.R;
import com.r2solution.exerciciorecycleviewethread.model.Pedido;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    List<Pedido> listaPedidos;

    public Adapter(List<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pedido pedido = listaPedidos.get(position);
        holder.numero.setText(pedido.getNumero());
        holder.valor.setText(pedido.getValor().toString());
    }

    @Override
    public int getItemCount() {
        return listaPedidos.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView numero;
        TextView valor;

        public MyViewHolder(View itemView) {

            super(itemView);

            numero = itemView.findViewById(R.id.tv_arquivo);
            valor = itemView.findViewById(R.id.tv_tamanho);
        }
    }

}
