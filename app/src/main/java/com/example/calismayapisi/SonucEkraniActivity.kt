package com.example.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calismayapisi.databinding.ActivitySonucEkraniBinding
import com.google.android.material.snackbar.Snackbar

class SonucEkraniActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivitySonucEkraniBinding//mülakatta gelir
    override fun onCreate(savedInstanceState: Bundle?) {
        tasarim = ActivitySonucEkraniBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(tasarim.root)

    }

    override fun onBackPressed() {
        //
        Snackbar.make(tasarim.textView3,"Geri Dönmek İstiyor musunuz",Snackbar.LENGTH_LONG)
            .setAction("Evet"){
                super.onBackPressed()
            }.show()
    }
}