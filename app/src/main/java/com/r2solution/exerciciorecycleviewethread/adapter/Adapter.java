package com.r2solution.exerciciorecycleviewethread.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.r2solution.exerciciorecycleviewethread.R;
import com.r2solution.exerciciorecycleviewethread.model.Arquivo;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    List<Arquivo> listaArquivos;

    public Adapter(List<Arquivo> listaArquivos) {
        this.listaArquivos = listaArquivos;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Arquivo arquivo = listaArquivos.get(position);
        holder.arquivo.setText(arquivo.getNome());
        holder.tamanho.setText(arquivo.getTamanho() + "Kb");
    }

    @Override
    public int getItemCount() {
        return listaArquivos.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView arquivo;
        TextView tamanho;

        public MyViewHolder(View itemView) {

            super(itemView);

            arquivo = itemView.findViewById(R.id.tv_arquivo);
            tamanho = itemView.findViewById(R.id.tv_tamanho);
        }
    }

}
