package com.example.sprintfinal5zapatos

import android.content.Context
import android.content.SharedPreferences
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.sprintfinal5zapatos.databinding.ItemCarritoBinding
import com.example.sprintfinal5zapatos.databinding.ItemLayoutBinding
import kotlin.coroutines.coroutineContext

class AdapterCarrito: RecyclerView.Adapter <AdapterCarrito.ViewHolder>() {

    var zapatosCarro = mutableListOf<Zapato>()
    private lateinit var mSharedPreferences: SharedPreferences

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCarritoBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        mSharedPreferences = parent.context.getSharedPreferences("llave", Context.MODE_PRIVATE)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return zapatosCarro.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = zapatosCarro[position]
        holder.bind(item)
    }


    fun setData(zapatosList: MutableList<Zapato>){
        this.zapatosCarro = zapatosList.toMutableList()
        notifyDataSetChanged()
    }

    fun removeItem(position: Int){
        zapatosCarro.removeAt(position)
        notifyItemRemoved(position)
    }

    inner class ViewHolder(val binding: ItemCarritoBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(zapato: Zapato){
            binding.txtNombreCarrito.text = zapato.nombre
            binding.txtPrecioCarrito.text = "$ " + zapato.precio.toString()
            binding.imgCarrito.load(zapato.imgUrl)
            binding.imgDelete.setOnClickListener {
                val position = adapterPosition
                val itemRemove = zapatosCarro[position]
                mSharedPreferences.edit().remove(itemRemove.nombre).apply()
                removeItem(position)
                Toast.makeText(binding.root.context,"Item eliminado", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
