package com.example.sprintfinal5zapatos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.sprintfinal5zapatos.databinding.FragmentListaZapatosBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragListaZapatos.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragListaZapatos : Fragment(), Adapter.ZapatosCallBack {

    lateinit var binding: FragmentListaZapatosBinding
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
        binding = FragmentListaZapatosBinding.inflate(LayoutInflater.from(activity))
        initAdapter()
        return (binding.root)
    }

    private fun initAdapter() {
        val adapter = Adapter()
        val listaZapatos = ZapatosList.getZapatos()
        adapter.setData(listaZapatos)
        adapter.callback = this
        binding.RecyclerViewZapatos.adapter = adapter
    }

    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragListaZapatos().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun showInforFragment(zapato: Zapato) {
        val bundle = Bundle()
        bundle.putString("nombre", zapato.nombre)
        bundle.putString("url", zapato.imgUrl)
        bundle.putString("precio", zapato.precio.toString())

    }
}