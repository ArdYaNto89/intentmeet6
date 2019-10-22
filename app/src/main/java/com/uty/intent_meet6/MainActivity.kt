package com.uty.intent_meet6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

 //  val id:Int=10
 //   val language:String="kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button untuk mengirimkan data ke activitykedua.kt
        btn_klik.setOnClickListener() {
            intent = Intent(this, activitykedua::class.java)
           //intent.putExtra("id_value",id)
      //  intent.putExtra("language_value",language)
            startActivity(intent)
        }

    }
}
