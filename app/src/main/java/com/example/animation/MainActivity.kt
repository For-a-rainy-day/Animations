package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val animation = AnimationUtils.loadAnimation(this, R.anim.alpha)
        txt.startAnimation(animation)
        btn.setOnClickListener {
            txt.startAnimation(animation)

        }

        val animation2 = AnimationUtils.loadAnimation(this, R.anim.scale)
        txt2.startAnimation(animation2)
        btn2.setOnClickListener {
            txt2.startAnimation(animation2)

        }

        val animation3 = AnimationUtils.loadAnimation(this, R.anim.translate)
        txt3.startAnimation(animation3)
        btn3.setOnClickListener {
            txt3.startAnimation(animation3)

        }

        val animation4 = AnimationUtils.loadAnimation(this, R.anim.rotate)
        txt4.startAnimation(animation4)
        btn4.setOnClickListener {
            txt4.startAnimation(animation4)

        }

        val animation5 = AnimationUtils.loadAnimation(this, R.anim.set)
        txt5.startAnimation(animation5)
        btn5.setOnClickListener {
            txt5.startAnimation(animation5)

        }

        animation.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {
              Log.e("animation","Start")
            }

            override fun onAnimationEnd(animation: Animation?) {
               val animation31=AnimationUtils.loadAnimation(this@MainActivity,R.anim.translate2)
                    txt3.startAnimation(animation31)



            }

            override fun onAnimationRepeat(animation: Animation?) {


            }

        })



    }
}