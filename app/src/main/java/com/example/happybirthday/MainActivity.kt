package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createcard(view: View) {
        val name=name_input.editableText.toString()

        val intent=Intent(this,happybirthdayactivity2::class.java)
        intent.putExtra(happybirthdayactivity2.name_extra,name)
        startActivity(intent)
    }


}