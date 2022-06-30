package com.example.fragmentcomunicacion.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import com.example.fragmentcomunicacion.R
import com.example.fragmentcomunicacion.databinding.FragmentTwoBinding


class TwoFragment : Fragment() {
    private var _binding : FragmentTwoBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setFragmentResultListener("Paquete1") {paquete, datos ->
            binding.tvHello2.text = datos.getString("PrimerDato")
        }

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTwoBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

}