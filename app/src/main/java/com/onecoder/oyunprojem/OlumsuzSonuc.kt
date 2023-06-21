package com.onecoder.oyunprojem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.onecoder.oyunprojem.databinding.ActivityOlumsuzSonucBinding
import com.onecoder.oyunprojem.databinding.ActivitySeviyeBirBinding

class OlumsuzSonuc : AppCompatActivity() {
    lateinit var binding: ActivityOlumsuzSonucBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_olumsuz_sonuc)
        binding= ActivityOlumsuzSonucBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
    }

    fun tekrarDene(view: View){
        val intent= Intent(this@OlumsuzSonuc,SeviyeBir::class.java)
        intent.putExtra("Sonuc",false)
        finish()
        startActivity(intent)
    }
}