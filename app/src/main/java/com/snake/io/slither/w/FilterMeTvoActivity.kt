package com.snake.io.slither.w

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.snake.io.slither.w.gaaaaamy.GamyyyyyyActivity

class FilterMeTvoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter_me_tvo)

        val sharPrefdfrgttg = getSharedPreferences("SP", MODE_PRIVATE)
        val frgtynameTest: String? = sharPrefdfrgttg.getString(MaaaainClas.C1efgrth, "null")
        val frtgyhyhydeepTest: String? = sharPrefdfrgttg.getString(MaaaainClas.D1efrgt, "null")
        if (frgtynameTest!!.contains("tdb2")){
            Intent(this, StrangeWebActivity::class.java)
                .also { startActivity(it) }
            finish()
        }
        else if(frtgyhyhydeepTest!!.contains("tdb2")){
            Intent(this, StrangeWebActivity::class.java)
                .also { startActivity(it) }
            finish()
        }
        else{
            Intent(this, GamyyyyyyActivity::class.java)
                .also { startActivity(it) }
            finish()
        }

    }
}