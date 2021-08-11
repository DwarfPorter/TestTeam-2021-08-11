package ru.geekbrains.testteam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    
    val tv: TextView?
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        tv = findViewById<TextView>(R.id.text_view)
        textView.text = "MY String"
    }
}
