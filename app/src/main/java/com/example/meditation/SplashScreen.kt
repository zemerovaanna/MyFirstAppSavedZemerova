package com.example.meditation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val timer = object: CountDownTimer(3000,1000)
        {
            override fun onTick(millisecondsUntilFinished: Long){

            }
            override fun onFinish()
            {
                val intent = Intent(this@SplashScreen,Onboarding::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}