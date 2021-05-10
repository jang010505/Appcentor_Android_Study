package com.example.a1week

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.login).setOnClickListener{
            val id = findViewById<EditText>(R.id.id)
            val password = findViewById<EditText>(R.id.password)
            if (id.text.toString().isEmpty()){
                Toast.makeText(this,"아이디 혹은 비밀번호를 입력하세요", Toast.LENGTH_SHORT).show()
                id.requestFocus()
            }
            else if (password.text.toString().isEmpty()){
                Toast.makeText(this,"아이디 혹은 비밀번호를 입력하세요", Toast.LENGTH_SHORT).show()
                password.requestFocus()
            }
            else{
                findViewById<TextView>(R.id.errorMessages).visibility = View.VISIBLE
            }
        }
    }
}