package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_happybirthdayactivity2.*

class happybirthdayactivity2 : AppCompatActivity() {
    companion object{
        const val name_extra="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_happybirthdayactivity2)
        val name:String?=intent.getStringExtra(name_extra)
        if (name == null) {
            Toast.makeText(this,"Please Enter the Name",Toast.LENGTH_LONG).show()
        }
        else{
            getmessage.setText("Happy Birthday \n $name")
        }
    }
}