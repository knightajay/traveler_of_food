package com.example.wavesoffood

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wavesoffood.databinding.FragmentConcarateBottomShheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class ConcarateBottomShheet : BottomSheetDialogFragment() {
    private lateinit var binding:FragmentConcarateBottomShheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
binding=FragmentConcarateBottomShheetBinding.inflate(layoutInflater,container,false)
        binding.gohome.setOnClickListener{
            val intent=Intent(requireContext(),MainActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }

    companion object {

    }
}