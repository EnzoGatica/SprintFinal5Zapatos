package com.example.sprintfinal5zapatos

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import coil.load
import com.example.sprintfinal5zapatos.databinding.FragmentVistaZapatosBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragVistaZapatos.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragVistaZapatos : Fragment() {

    private lateinit var binding: FragmentVistaZapatosBinding
    private lateinit var mSharedPreferences: SharedPreferences
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var param3: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString("nombre")
            param2 = it.getString("url")
            param3 = it.getString("precio")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mSharedPreferences = requireActivity().applicationContext.getSharedPreferences("llave", Context.MODE_PRIVATE)
        binding = FragmentVistaZapatosBinding.inflate(LayoutInflater.from(activity))
        initAdapter()
        binding.btnAgregar.setOnClickListener {
            mSharedPreferences.edit().putString(param1,param1).apply()
        }

        return (binding.root)
    }

    private fun initAdapter() {
        binding.txtNombreVista.text = "$param1"
        binding.imageView.load(param2)
        binding.txtPrecioVista.text = "$ $param3"
        binding.btnAgregar.setOnClickListener {

        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragVistaZapatos.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragVistaZapatos().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}