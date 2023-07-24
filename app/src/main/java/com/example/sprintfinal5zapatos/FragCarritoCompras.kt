package com.example.sprintfinal5zapatos

import android.content.Context
import android.content.SharedPreferences
import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sprintfinal5zapatos.databinding.FragmentCarritoComprasBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class FragCarritoCompras : Fragment() {

    private lateinit var mSharedPreferences: SharedPreferences
    private lateinit var binding: FragmentCarritoComprasBinding

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCarritoComprasBinding.inflate(LayoutInflater.from(activity))
        mSharedPreferences = requireActivity().applicationContext.getSharedPreferences("llave",Context.MODE_PRIVATE)
        initAdapterCarrito()
        return (binding.root)
    }

    private fun initAdapterCarrito() {
        val adapter = AdapterCarrito()
        val listaZapatos = listaCarrito()
        adapter.setData(listaZapatos)

        binding.RecycleCarrito.adapter = adapter
    }

    private fun listaCarrito(): MutableList<Zapato> {
        val zapatos = ZapatosList.getZapatos()
        val carro = mutableListOf<Zapato>()
        val nombre = mSharedPreferences.all

        for (z in zapatos)
        {
            if (nombre.containsKey(z.nombre))carro.add(z)
        }

        return carro
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragCarritoCompras().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}