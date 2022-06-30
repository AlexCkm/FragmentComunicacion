package com.example.fragmentcomunicacion.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import com.example.fragmentcomunicacion.R
import com.example.fragmentcomunicacion.databinding.FragmentOneBinding


class oneFragment : Fragment() {
    private var _binding : FragmentOneBinding? = null
    private val binding get() = _binding!!
    private var cont = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOneBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvHello1.setOnClickListener {
            cont++
            binding.tvHello1.text = cont.toString()
            setFragmentResult("Paquete1", bundleOf("PrimerDato" to cont.toString()))
        }

        }
}

