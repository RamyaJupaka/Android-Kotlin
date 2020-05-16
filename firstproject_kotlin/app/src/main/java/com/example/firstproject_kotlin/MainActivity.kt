package com.example.firstproject_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(),View.OnClickListener {
    // declaring
    lateinit var editTextName: EditText  // lateinit used to declare later
    lateinit var clickButton: Button
    lateinit var textViewMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName);
        clickButton = findViewById(R.id.clickButton);
        textViewMessage = findViewById(R.id.textViewMessage);

        clickButton.setOnClickListener(this);
    }

    override fun onClick(v: View?) {
        val name = editTextName.text
        textViewMessage.text = "hello $name"

    }
}
