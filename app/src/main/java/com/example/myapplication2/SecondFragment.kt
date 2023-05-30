package com.example.myapplication2

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication2.FirstFragment.Companion.TAG
import com.example.myapplication2.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    private val binding get() = _binding!!

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.i(TAG, "onAttach: 2")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate: 2")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.i(TAG, "onCreateView: 2")
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, "onViewCreated: 2")
        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: 2")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: 2")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: 2")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: 2")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG, "onDestroyView: 2")
        _binding = null
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: 2")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG, "onDetach: 2")
    }
}