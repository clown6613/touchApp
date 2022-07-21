package com.example.touchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.touchapp.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        //idを取得
        val tx:TextView = findViewById(id.tv)
        val btn1:Button = findViewById(id.btnDog)
        val btn2:Button = findViewById(id.btnCat)
        val btn3: Button = findViewById(id.btnClear)

        //クリック処理
        btn1.setOnClickListener{
            tx.text = "いぬ"
        }
        btn2.setOnClickListener{
            tx.text = "ねこ"
        }
        btn3.setOnClickListener{
            tx.text = "..."
        }
    }
}