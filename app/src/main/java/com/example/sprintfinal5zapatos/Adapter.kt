package com.example.sprintfinal5zapatos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.sprintfinal5zapatos.databinding.ItemLayoutBinding

class Adapter : RecyclerView.Adapter <Adapter.ViewHolder>() {

    var zapatos = mutableListOf<Zapatos>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return zapatos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = zapatos[position]
        holder.bind(item)
    }

    fun setData(zapatosList: List<Zapatos>){
        this.zapatos = zapatosList.toMutableList()
    }

    class ViewHolder(val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(zapatos: Zapatos){
            binding.txtNombre.text = zapatos.nombre
            binding.txtPrecio.text = zapatos.precio.toString()
            binding.imgZapatos.load(zapatos.imgUrl)

        }
    }
}