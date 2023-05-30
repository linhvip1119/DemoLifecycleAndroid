package com.example.myapplication2

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication2.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.i(TAG, "onCreateView: 1")
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG, "onDetach: 1")
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.i(TAG, "onAttach: 1")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate: 1")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: 1")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: 1")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: 1")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: 1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: 1")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG, "onDestroyView: 1")
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, "onViewCreated: 1")
        binding.buttonFirst.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
           context?.showDialogConfirmOrCancelData()
        }
    }

    fun Context.showDialogConfirmOrCancelData(
    ): Dialog {
        val dialog = Dialog(this)
        dialog.apply {
            setContentView(R.layout.dialog_confirm_data)
            window?.setBackgroundDrawableResource(android.R.color.transparent)
            show()
        }
        return dialog
    }

    companion object {
        const val TAG = "TAGG"
    }
}