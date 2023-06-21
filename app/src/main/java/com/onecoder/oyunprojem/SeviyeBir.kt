package com.onecoder.oyunprojem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.onecoder.oyunprojem.databinding.ActivitySeviyeBirBinding
import kotlin.math.max
import kotlin.random.Random

class SeviyeBir : AppCompatActivity() {
    lateinit var randomNumbers:List<Int>
    lateinit var binding:ActivitySeviyeBirBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_seviye_bir)
        binding= ActivitySeviyeBirBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        randomNumbers=List<Int>(4){
           Random.nextInt(21)
        }

        binding.button1.text=randomNumbers[0].toString()
        binding.button2.text=randomNumbers[1].toString()
        binding.button3.text=randomNumbers[2].toString()
        binding.button4.text=randomNumbers[3].toString()


        var sayac=0
        while(sayac<randomNumbers.size){
            for (i in 0..3){
                for (j in 0..3){
                    if (i!=j){
                        if(randomNumbers[i]==randomNumbers[j]){
                            randomNumbers=List<Int>(4){
                                Random.nextInt(21)
                            }

                            binding.button1.text=randomNumbers[0].toString()
                            binding.button2.text=randomNumbers[1].toString()
                            binding.button3.text=randomNumbers[2].toString()
                            binding.button4.text=randomNumbers[3].toString()
                        }
                    }
                }
            }
            sayac++
        }


    }

    fun tiklaBir(view: View){
         if(randomNumbers[0]==randomNumbers.maxOrNull()){
             val intent=Intent(this@SeviyeBir,TebrikSayfasi::class.java)
             intent.putExtra("Sonuc",true)
             finish()
             startActivity(intent)
             println(randomNumbers)
         }else{
             intent=Intent(this@SeviyeBir,OlumsuzSonuc::class.java)
             intent.putExtra("Sonuc",false)
             finish()
             startActivity(intent)
             println(randomNumbers)
         }

    }

    fun tiklaIki(view: View){
        if(randomNumbers[1]==randomNumbers.maxOrNull()){
            val intent=Intent(this@SeviyeBir,TebrikSayfasi::class.java)
            intent.putExtra("Sonuc",true)
            finish()
            startActivity(intent)
            println(randomNumbers)
        }else{
            intent=Intent(this@SeviyeBir,OlumsuzSonuc::class.java)
            intent.putExtra("Sonuc",false)
            finish()
            startActivity(intent)
            println(randomNumbers)
        }

    }

    fun tiklaUc(view: View){
        if(randomNumbers[2]==randomNumbers.maxOrNull()){
            val intent=Intent(this@SeviyeBir,TebrikSayfasi::class.java)
            intent.putExtra("Sonuc",true)
            finish()
            startActivity(intent)
            println(randomNumbers)
        }else{
            intent=Intent(this@SeviyeBir,OlumsuzSonuc::class.java)
            intent.putExtra("Sonuc",false)
            finish()
            startActivity(intent)
            println(randomNumbers)
        }

    }

    fun tiklaDort(view: View){
        if(randomNumbers[3]==randomNumbers.maxOrNull()){
            val intent=Intent(this@SeviyeBir,TebrikSayfasi::class.java)
            intent.putExtra("Sonuc",true)
            finish()
            startActivity(intent)
            println(randomNumbers)
        }else{
            intent=Intent(this@SeviyeBir,OlumsuzSonuc::class.java)
            intent.putExtra("Sonuc",false)
            finish()
            startActivity(intent)
            println(randomNumbers)
        }

    }







}