package com.onecoder.oyunprojem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.onecoder.oyunprojem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)


    }

    fun baslat(view: View){
        val intent= Intent(this@MainActivity,SeviyeBir::class.java)
        intent.putExtra("Sonuc",false)
        finish()
        startActivity(intent)

    }
}