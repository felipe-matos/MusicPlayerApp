package com.example.musicplayerapp

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var mp : MediaPlayer
    private lateinit var btnPlay : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlay = findViewById(R.id.btnPlay)

        mp = MediaPlayer.create(this,R.raw.happyrock)
        mp.start()
        btnPlay.setImageResource(R.drawable.pause)

        btnPlay.setOnClickListener{

            if(mp.isPlaying){

                mp.pause()
                btnPlay.setImageResource(R.drawable.play)
            }else {
                mp.start()
                btnPlay.setImageResource(R.drawable.pause)

            }


        }

    }
}