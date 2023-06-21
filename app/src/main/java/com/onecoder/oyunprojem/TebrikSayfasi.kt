package com.onecoder.oyunprojem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TebrikSayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tebrik_sayfasi)
    }

    fun seviyeAtla(view: View){
        val intent=Intent(this@TebrikSayfasi,SeviyeIki::class.java)
        intent.putExtra("Sonuc", true)
        finish()
        startActivity(intent)
    }
}