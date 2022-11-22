package com.snake.io.slither.w.gaaaaamy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import com.snake.io.slither.w.databinding.FragmentThatsAllBinding

class ThatsAllFragment : Fragment() {
    private var gyhyhyjuuj5: FragmentThatsAllBinding? = null
    private val gyhyhy3 get() = gyhyhyjuuj5 ?: throw RuntimeException("FragmentStartBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gyhyhyjuuj5 = FragmentThatsAllBinding.inflate(inflater, container, false)
        return gyhyhy3.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            gyhyhy3.btnExitfgtghy.setOnClickListener {
                hyjujikki()
            }
            gyhyhy3.btnTryAgainfrtghy.setOnClickListener {
                requireActivity().onBackPressed()
            }

        } catch (e: Exception) {
            gtgtg()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        gyhyhyjuuj5 = null
        super.onDestroy()
    }

    private fun gtgtg() {
        Snackbar.make(
            gyhyhy3.root,
            "There is error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private fun hyjujikki() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("The current data don`t saved, EXIT?")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("Deny") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }
}