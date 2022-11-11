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
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random


class PlayFragment : Fragment() {
    var counterAlpha = 0.8f
    var diffAlpha = 0.05f

    private var _biiiiiiinding: FragmentPlayBinding? = null
    private val binding
        get() = _biiiiiiinding ?: throw RuntimeException("FragmentStartBinding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _biiiiiiinding = FragmentPlayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.btnImgLove.setOnClickListener {
                Snackbar.make(binding.root, "I love you too ♥♥♥", Snackbar.LENGTH_LONG).show()
            }
            binding.btnImgExit.setOnClickListener {
                initAlertDialogfgthyu()

            }
            lifecycleScope.launch {
                var insideCounter = counterAlpha
                var isideDiff = diffAlpha
                while (true) {
                    binding.btnElem1.alpha = insideCounter
                    if (insideCounter >= 1f) {
                        isideDiff = -0.05f
                    }
                    if (insideCounter <= 0.1f) {
                        isideDiff = 0.05f
                    }
                    delay(30)
                    insideCounter += isideDiff
                }
            }
            lifecycleScope.launch {
                var insideCounter = counterAlpha
                var isideDiff = diffAlpha
                while (true) {
                    binding.btnElem2.alpha = insideCounter
                    if (insideCounter >= 1f) {
                        isideDiff = -0.05f
                    }
                    if (insideCounter <= 0.1f) {
                        isideDiff = 0.05f
                    }
                    delay(30)
                    insideCounter += isideDiff
                }
            }
            lifecycleScope.launch {
                var insideCounter = counterAlpha
                var isideDiff = diffAlpha
                while (true) {

                    binding.btnElem3.alpha = insideCounter
                    if (insideCounter >= 1f) {
                        isideDiff = -0.05f
                    }
                    if (insideCounter <= 0.1f) {
                        isideDiff = 0.05f
                    }
                    delay(30)
                    insideCounter += isideDiff
                }
            }
            lifecycleScope.launch {
                var insideCounter = counterAlpha
                var isideDiff = diffAlpha
                while (true) {

                    binding.btnElem4.alpha = insideCounter
                    if (insideCounter >= 1f) {
                        isideDiff = -0.05f
                    }
                    if (insideCounter <= 0.1f) {
                        isideDiff = 0.05f
                    }
                    delay(30)
                    insideCounter += isideDiff
                }
            }
            lifecycleScope.launch {
                var insideCounter = counterAlpha
                var isideDiff = diffAlpha
                while (true) {

                    binding.btnElem5.alpha = insideCounter
                    if (insideCounter >= 1f) {
                        isideDiff = -0.05f
                    }
                    if (insideCounter <= 0.1f) {
                        isideDiff = 0.05f
                    }
                    delay(30)
                    insideCounter += isideDiff
                }
            }
            lifecycleScope.launch {
                var insideCounter = counterAlpha
                var isideDiff = diffAlpha
                while (true) {

                    binding.btnElem6.alpha = insideCounter
                    if (insideCounter >= 1f) {
                        isideDiff = -0.05f
                    }
                    if (insideCounter <= 0.1f) {
                        isideDiff = 0.05f
                    }
                    delay(30)
                    insideCounter += isideDiff
                }
            }
            lifecycleScope.launch {
                var insideCounter = counterAlpha
                var isideDiff = diffAlpha
                while (true) {

                    binding.btnElem7.alpha = insideCounter
                    if (insideCounter >= 1f) {
                        isideDiff = -0.05f
                    }
                    if (insideCounter <= 0.1f) {
                        isideDiff = 0.05f
                    }
                    delay(30)
                    insideCounter += isideDiff
                }
            }
            lifecycleScope.launch {
                var insideCounter = counterAlpha
                var isideDiff = diffAlpha
                while (true) {

                    binding.btnElem8.alpha = insideCounter
                    if (insideCounter >= 1f) {
                        isideDiff = -0.05f
                    }
                    if (insideCounter <= 0.1f) {
                        isideDiff = 0.05f
                    }
                    delay(30)
                    insideCounter += isideDiff
                }
            }


            binding.btnElem1.setOnClickListener {
                it.visibility = View.GONE
                checkerMake()
            }
            binding.btnElem2.setOnClickListener {
                it.visibility = View.GONE
                checkerMake()
            }
            binding.btnElem3.setOnClickListener {
                it.visibility = View.GONE
                checkerMake()
            }
            binding.btnElem4.setOnClickListener {
                it.visibility = View.GONE
                checkerMake()
            }
            binding.btnElem5.setOnClickListener {
                it.visibility = View.GONE
                checkerMake()
            }
            binding.btnElem6.setOnClickListener {
                it.visibility = View.GONE
                checkerMake()
            }
            binding.btnElem7.setOnClickListener {
                it.visibility = View.GONE
                checkerMake()
            }
            binding.btnElem8.setOnClickListener {
                it.visibility = View.GONE
                checkerMake()
            }


        } catch (e: Exception) {
            makeError()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun checkerMake() {
        if (isVisibleImg(binding.btnElem1) && isVisibleImg(binding.btnElem2) && isVisibleImg(
                binding.btnElem3
            ) && isVisibleImg(binding.btnElem4) && isVisibleImg(binding.btnElem5) && isVisibleImg(
                binding.btnElem6
            ) && isVisibleImg(binding.btnElem7) && isVisibleImg(binding.btnElem8)
        ) {
            findNavController().navigate(R.id.action_playFragment_to_thatsAllFragment)
        }
    }

    override fun onDestroy() {
        _biiiiiiinding = null
        super.onDestroy()
    }

    private fun makeError() {
        Snackbar.make(
            binding.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }


    private fun makeCycleUpAndDovnAlpha(imageView: ImageView) {
        lifecycleScope.launch {
            while (true) {
                var insideCounter = counterAlpha
                var isideDiff = diffAlpha
                imageView.alpha = insideCounter
                if (insideCounter >= 1f) {
                    isideDiff = -0.05f
                }
                if (insideCounter <= 0.1f) {
                    isideDiff = 0.05f
                }
                delay(30)
                insideCounter += isideDiff
            }
        }
    }

    private fun isVisibleImg(imageView: ImageView): Boolean {
        if (imageView.visibility == View.GONE) {
            return true
        }
        return false
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