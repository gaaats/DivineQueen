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
import com.orhanobut.hawk.Hawk
import com.snake.io.slither.w.MaaaainClas.Companion.C1ftgtgttgfrgtKgf
import com.snake.io.slither.w.MaaaainClas.Companion.DEEPLfrfrrf66
import com.snake.io.slither.w.MaaaainClas.Companion.MAIN_IDdrfrrfdfrgt
import com.snake.io.slither.w.MaaaainClas.Companion.linkfrfrrfFjrjgtj
import com.snake.io.slither.w.databinding.ActivityStrangeWebBinding
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class StrangeWebActivity : AppCompatActivity() {
    private val frfrgtgt = 1
    var kiloolool: String? = null
    var frrffrrf: ValueCallback<Array<Uri>>? = null

    lateinit var gtgtgtgt: WebView
    lateinit var ikikiikiki: ActivityStrangeWebBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ikikiikiki = ActivityStrangeWebBinding.inflate(layoutInflater)
        setContentView(ikikiikiki.root)

        gtgtgtgt = ikikiikiki.frgthyhyviewWeb
        Snackbar.make(
            ikikiikiki.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val jujujuujujuj5 = CookieManager.getInstance()
        jujujuujujuj5.setAcceptCookie(true)
        jujujuujujuj5.setAcceptThirdPartyCookies(gtgtgtgt, true)
        jikikiki5()
        val tgtgtgtg5: Activity = this
        gtgtgtgt.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (hyohjyhoy(url)) {

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
                hhojyjjhyjyjihy(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(tgtgtgtg5, description, Toast.LENGTH_SHORT).show()
            }


        }
        gtgtgtgt.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                frrffrrf?.onReceiveValue(null)
                frrffrrf = filePathCallback
                var frgttakePictureIntent: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (frgttakePictureIntent!!.resolveActivity(packageManager) != null) {

                    var photoFiledefrfr: File? = null
                    try {
                        photoFiledefrfr = frgfgtgtg()
                        frgttakePictureIntent.putExtra("PhotoPath", kiloolool)
                    } catch (ex: IOException) {
                    }

                    if (photoFiledefrfr != null) {
                        kiloolool = "file:" + photoFiledefrfr.absolutePath
                        frgttakePictureIntent.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(photoFiledefrfr)
                        )
                    } else {
                        frgttakePictureIntent = null
                    }
                }
                val ccvcvcvcv = Intent(Intent.ACTION_GET_CONTENT)
                ccvcvcvcv.addCategory(Intent.CATEGORY_OPENABLE)
                ccvcvcvcv.type = "image/*"
                val gtgthyhyyh: Array<Intent?> =
                    frgttakePictureIntent?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val tftgtgtgt = Intent(Intent.ACTION_CHOOSER)
                tftgtgtgt.putExtra(Intent.EXTRA_INTENT, ccvcvcvcv)
                tftgtgtgt.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_pic_choose))
                tftgtgtgt.putExtra(Intent.EXTRA_INITIAL_INTENTS, gtgthyhyyh)
                startActivityForResult(
                    tftgtgtgt, frfrgtgt
                )
                return true
            }

            @Throws(IOException::class)
            private fun frgfgtgtg(): File {
                var gtghyokykhky = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!gtghyokykhky.exists()) {
                    gtghyokykhky.mkdirs()
                }

                gtghyokykhky =
                    File(gtghyokykhky.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return gtghyokykhky
            }

        }

        gtgtgtgt.loadUrl(kokokok())
    }


    private fun frfrfrffrijyijhy(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val frrrfrfrfr = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $frrrfrfrfr"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val frrfrfrrfdd =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $frrfrfrrfdd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val frfrfr = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $frfrfr"
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

    private fun jikikiki5() {
        val frfgthy6 = gtgtgtgt.settings
        frfgthy6.javaScriptEnabled = true

        frfgthy6.useWideViewPort = true

        frfgthy6.loadWithOverviewMode = true
        frfgthy6.allowFileAccess = true
        frfgthy6.domStorageEnabled = true
        frfgthy6.userAgentString = frfgthy6.userAgentString.replace("; wv", "")

        frfgthy6.javaScriptCanOpenWindowsAutomatically = true
        frfgthy6.setSupportMultipleWindows(false)

        frfgthy6.displayZoomControls = false
        frfgthy6.builtInZoomControls = true
        frfgthy6.setSupportZoom(true)

        frfgthy6.pluginState = WebSettings.PluginState.ON
        frfgthy6.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        frfgthy6.setAppCacheEnabled(true)

        frfgthy6.allowContentAccess = true
    }

    private fun kokokok(): String {

        val thkykkhyko = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val hgyjyj = "com.snake.io.slither.w"

        val kli: String? = Hawk.get(C1ftgtgttgfrgtKgf, "null")
        val hyhkykhkykyk: String? = Hawk.get(MAIN_IDdrfrrfdfrgt, "null")
        val kokok: String? = Hawk.get(DEEPLfrfrrf66, "null")

        val julpjpuuu = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)


        val gt5tgt = "deviceID="
        val gyhyhyLKfktt = "sub_id_4="
        val OKkftgt = "sub_id_5="
        val ykhokyh = "sub_id_6="
        val hykohyk = "sub_id_1="
        val hykhykoy5 = "ad_id="


        val gtoyhjyyhy = "naming"
        val gtgyhyhy5 = "deeporg"


        val hyhoyykhky5 = Build.VERSION.RELEASE

        val gytohyyy5 = Hawk.get(linkfrfrrfFjrjgtj, "null")

        var gtthyhyyh5 = ""
        if (kli != "null") {
            gtthyhyyh5 =
                "$gytohyyy5$hykohyk$kli&$gt5tgt$julpjpuuu&$hykhykoy5$hyhkykhkykyk&$gyhyhyLKfktt$hgyjyj&$OKkftgt$hyhoyykhky5&$ykhokyh$gtoyhjyyhy"
            frfrfrffrijyijhy(julpjpuuu.toString())
        } else {
            gtthyhyyh5 =
                "$gytohyyy5$hykohyk$kokok&$gt5tgt$julpjpuuu&$hykhykoy5$hyhkykhkykyk&$gyhyhyLKfktt$hgyjyj&$OKkftgt$hyhoyykhky5&$ykhokyh$gtgyhyhy5"
            frfrfrffrijyijhy(julpjpuuu.toString())
        }


        return thkykkhyko.getString("SAVED_URL", gtthyhyyh5).toString()
    }

    override fun onBackPressed() {


        if (gtgtgtgt.canGoBack()) {
            if (ftgtgttgt5) {
                gtgtgtgt.stopLoading()
                gtgtgtgt.loadUrl(ghyhyyhy5)
            }
            this.ftgtgttgt5 = true
            gtgtgtgt.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                ftgtgttgt5 = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }


    private fun hyohjyhoy(uri: String): Boolean {

        val tgtgttgttg = packageManager
        try {

            tgtgttgttg.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)


            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != frfrgtgt || frrffrrf == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var results: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                results = arrayOf(Uri.parse(kiloolool))
            } else {
                val ddtdtdtd = data.dataString
                if (ddtdtdtd != null) {
                    results = arrayOf(Uri.parse(ddtdtdtd))
                }
            }
        }
        frrffrrf?.onReceiveValue(results)
        frrffrrf = null
    }


    private var ftgtgttgt5 = false


    var ghyhyyhy5 = ""
    fun hhojyjjhyjyjihy(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (ghyhyyhy5 == "") {
                ghyhyyhy5 = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val rfrrfrfr =
                    getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val yhyhyhhyhy = rfrrfrfr.edit()
                yhyhyhhyhy.putString("SAVED_URL", lurlurlurlurlur)
                yhyhyhhyhy.apply()
            }
        }
    }


}