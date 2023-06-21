package com.onecoder.oyunprojem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.onecoder.oyunprojem.databinding.ActivitySeviyeIkiBinding
import kotlin.random.Random

class SeviyeIki : AppCompatActivity() {
    lateinit var randomNumbers:List<Int>

    lateinit var binding:ActivitySeviyeIkiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_seviye_iki)
        binding=ActivitySeviyeIkiBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        randomNumbers=List<Int>(4){
            Random.nextInt(21,50)
        }

        binding.button5.text=randomNumbers[0].toString()
        binding.button6.text=randomNumbers[1].toString()
        binding.button7.text=randomNumbers[2].toString()
        binding.button8.text=randomNumbers[3].toString()

        var sayac=0
        while(sayac<randomNumbers.size){
            for (i in 0..3){
               for(j in 0..3){
                   if(i!=j){
                       if(randomNumbers[i]==randomNumbers[j]){
                           randomNumbers=List<Int>(4){
                               Random.nextInt(21,50)
                           }
                           binding.button5.text=randomNumbers[0].toString()
                           binding.button6.text=randomNumbers[1].toString()
                           binding.button7.text=randomNumbers[2].toString()
                           binding.button8.text=randomNumbers[3].toString()
                       }
                   }
               }
            }
            sayac++
        }


    }

    fun tiklaBes(view: View){
        if(randomNumbers[0]==randomNumbers.maxOrNull()){
            val intent= Intent(this@SeviyeIki,TebrikSayfasi::class.java)
            intent.putExtra("Sonuc",true)
            finish()
            startActivity(intent)
        }else{
            intent=Intent(this@SeviyeIki,OlumsuzSonuc::class.java)
            intent.putExtra("Sonuc",false)
            finish()
            startActivity(intent)
        }
    }

    fun tiklaAlti(view: View){
        if(randomNumbers[1]==randomNumbers.maxOrNull()){
            val intent= Intent(this@SeviyeIki,TebrikSayfasi::class.java)
            intent.putExtra("Sonuc",true)
            finish()
            startActivity(intent)
        }else{
            intent=Intent(this@SeviyeIki,OlumsuzSonuc::class.java)
            intent.putExtra("Sonuc",false)
            finish()
            startActivity(intent)
        }
    }

    fun tiklaYedi(view: View){
        if(randomNumbers[2]==randomNumbers.maxOrNull()){
            val intent= Intent(this@SeviyeIki,TebrikSayfasi::class.java)
            intent.putExtra("Sonuc",true)
            finish()
            startActivity(intent)
        }else{
            intent=Intent(this@SeviyeIki,OlumsuzSonuc::class.java)
            intent.putExtra("Sonuc",false)
            finish()
            startActivity(intent)
        }
    }

    fun tiklaSekiz(view: View){
        if(randomNumbers[3]==randomNumbers.maxOrNull()){
            val intent= Intent(this@SeviyeIki,TebrikSayfasi::class.java)
            intent.putExtra("Sonuc",true)
            finish()
            startActivity(intent)
        }else{
            intent=Intent(this@SeviyeIki,OlumsuzSonuc::class.java)
            intent.putExtra("Sonuc",false)
            finish()
            startActivity(intent)
        }
    }






}