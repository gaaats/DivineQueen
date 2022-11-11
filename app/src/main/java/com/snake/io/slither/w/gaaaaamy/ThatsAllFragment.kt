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
    private var frgtyy: FragmentThatsAllBinding? = null
    private val fgybinding get() = frgtyy ?: throw RuntimeException("FragmentStartBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        frgtyy = FragmentThatsAllBinding.inflate(inflater, container, false)
        return fgybinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            fgybinding.btnExitfgtghy.setOnClickListener {
                initAlertDialogfgthyu()
            }
            fgybinding.btnTryAgainfrtghy.setOnClickListener {
                requireActivity().onBackPressed()
            }

        } catch (e: Exception) {
            frgthyhyhyErrrrror()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        frgtyy = null
        super.onDestroy()
    }

    private fun frgthyhyhyErrrrror() {
        Snackbar.make(
            fgybinding.root,
            "There is error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private fun initAlertDialogfgthyu() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Do you want to exit, the current data don`t saved?")
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