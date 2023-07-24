package com.example.sprintfinal5zapatos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.sprintfinal5zapatos.databinding.ItemCarritoBinding
import com.example.sprintfinal5zapatos.databinding.ItemLayoutBinding

class AdapterCarrito: RecyclerView.Adapter <AdapterCarrito.ViewHolder>() {

    var zapatosCarro = mutableListOf<Zapato>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCarritoBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return zapatosCarro.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = zapatosCarro[position]
        holder.bind(item)
    }

    inner class ViewHolder(val binding: ItemCarritoBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(zapato: Zapato){
            binding.txtNombreCarrito.text = zapato.nombre
            binding.txtPrecioCarrito.text = "$ " + zapato.precio.toString()
            binding.imgCarrito.load(zapato.imgUrl)
            binding.btnEliminar.setOnClickListener {
                //meter eliminar
            }
        }
    }
}
