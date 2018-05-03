package com.example.kacperopyrchal.toastoverlapping

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomMessages = listOf("Random message", "Bla Bla", "LoL", "123", "AAAAAAAAAAA", "LSLKDK")

        button.setOnClickListener({
            val randomIndex = Random().nextInt(randomMessages.size)
            showToast(randomMessages[randomIndex])
        })
    }

    private fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }
}
