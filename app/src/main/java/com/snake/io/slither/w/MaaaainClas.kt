package com.snake.io.slither.w

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class MaaaainClas : Application() {

    companion object {
        const val dedeedeeedfrr = "45fafd6e-7959-4b4c-8012-3e96cb49b69c"
        var appsCheckfrfrrffgt = "appsChecker"
        var MAIN_IDdrfrrfdfrgt: String? = ""
        var DEEPLfrfrrf66: String? = "d11"
        var C1ftgtgttgfrgtKgf: String? = "c11"
        var linkfrfrrfFjrjgtj = "link"

    }

    override fun onCreate() {
        super.onCreate()

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(dedeedeeedfrr)

        Hawk.init(this).build()


    }

}
