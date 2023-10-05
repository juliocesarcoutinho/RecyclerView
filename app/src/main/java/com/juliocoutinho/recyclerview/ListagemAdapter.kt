package com.juliocoutinho.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ListagemAdapter(
    val listagem: List<ListaNomes>
) : Adapter<ListagemAdapter.ListagemViewHolder>() {
    
    inner class ListagemViewHolder(
        val itemView: View
    ) : ViewHolder(itemView){
        
        val textNome : TextView = itemView.findViewById(R.id.text_nome)
        val textPostagens : TextView = itemView.findViewById(R.id.text_postagem)
        val texthorario : TextView = itemView.findViewById(R.id.text_horario)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListagemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.listagem, parent, false)
        
        return ListagemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listagem.size
    }

    override fun onBindViewHolder(holder: ListagemViewHolder, position: Int) {
        
        val listagem = listagem[position]
        holder.textNome.text = listagem.nome
        holder.textPostagens.text = listagem.postagem
        holder.texthorario.text = listagem.horario
        
    }
}