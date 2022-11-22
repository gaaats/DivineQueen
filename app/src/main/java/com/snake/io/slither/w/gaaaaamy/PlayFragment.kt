package com.snake.io.slither.w.gaaaaamy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.snake.io.slither.w.R
import com.snake.io.slither.w.databinding.FragmentPlayBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class PlayFragment : Fragment() {
    var gtgt = 0.8f
    var plfr = 0.05f

    private var gtu: FragmentPlayBinding? = null
    private val pola
        get() = gtu ?: throw RuntimeException("FragmentStartBinding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gtu = FragmentPlayBinding.inflate(inflater, container, false)
        return pola.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            pola.root.background.alpha = 190

            pola.btnImgHelp.setOnClickListener {
                findNavController().navigate(R.id.action_playFragment_to_innnnfffoooFragment)
            }
            pola.btnImgExit.setOnClickListener {
                alalalet()

            }



            pola.btnElem1.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            pola.btnElem2.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            pola.btnElem3.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            pola.btnElem4.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            pola.btnElem5.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            pola.btnElem6.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            pola.btnElem7.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            pola.btnElem8.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            pola.btnElem9.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            pola.btnElem10.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            pola.btnElem11.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }
            pola.btnElem12.setOnClickListener {
                it.visibility = View.GONE
                polskks()
            }


        } catch (e: Exception) {
            afrhgthUygt()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun polskks() {
        if (isisKfjr(pola.btnElem1) && isisKfjr(pola.btnElem2) && isisKfjr(
                pola.btnElem3
            ) && isisKfjr(pola.btnElem4) && isisKfjr(pola.btnElem5) && isisKfjr(
                pola.btnElem6
            ) && isisKfjr(pola.btnElem7) && isisKfjr(pola.btnElem8) && isisKfjr(
                pola.btnElem9
            ) && isisKfjr(pola.btnElem10) && isisKfjr(pola.btnElem11) && isisKfjr(
                pola.btnElem12
            )
        ) {
            findNavController().navigate(R.id.action_playFragment_to_thatsAllFragment)
        }
    }

    override fun onDestroy() {
        gtu = null
        super.onDestroy()
    }

    private fun afrhgthUygt() {
        Snackbar.make(
            pola.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }


    private fun slonny(imageView: ImageView) {
        lifecycleScope.launch {
            while (true) {
                var ismsms = gtgt
                var gtjitji = plfr
                imageView.alpha = ismsms
                if (ismsms >= 1f) {
                    gtjitji = -0.05f
                }
                if (ismsms <= 0.1f) {
                    gtjitji = 0.05f
                }
                delay(30)
                ismsms += gtjitji
            }
        }
    }

    private fun isisKfjr(imageView: ImageView): Boolean {
        if (imageView.visibility == View.GONE) {
            return true
        }
        return false
    }

    private fun alalalet() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Exit, realy?")
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