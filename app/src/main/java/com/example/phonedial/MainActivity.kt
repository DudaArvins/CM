package com.example.phonedial

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input: EditText = findViewById(R.id.editText)

        val btnOne: Button = findViewById(R.id.buttonOne)
        btnOne.setOnClickListener {
            onButtonClick(btnOne, input, "1")
        }
        val btnTwo: Button = findViewById(R.id.buttonTwo)
        btnTwo.setOnClickListener {
            onButtonClick(btnTwo, input, "2")
        }

        val btnThree: Button = findViewById(R.id.buttonThree)
        btnThree.setOnClickListener {
            onButtonClick(btnThree, input, "3")
        }

        val btnFour: Button = findViewById(R.id.buttonFour)
        btnFour.setOnClickListener {
            onButtonClick(btnFour, input, "4")
        }

        val btnFive: Button = findViewById(R.id.buttonFive)
        btnFive.setOnClickListener {
            onButtonClick(btnFive, input, "5")
        }

        val btnSix: Button = findViewById(R.id.buttonSix)
        btnSix.setOnClickListener {
            onButtonClick(btnSix, input, "6")
        }

        val btnSeven: Button = findViewById(R.id.buttonSeven)
        btnSeven.setOnClickListener {
            onButtonClick(btnSeven, input, "7")
        }

        val btnEight: Button = findViewById(R.id.buttonEight)
        btnEight.setOnClickListener {
            onButtonClick(btnEight, input, "8")
        }

        val btnNine: Button = findViewById(R.id.buttonNine)
        btnNine.setOnClickListener {
            onButtonClick(btnNine, input, "9")
        }

        val btnStar: Button = findViewById(R.id.buttonStar)
        btnStar.setOnClickListener {
            onButtonClick(btnStar, input, "*")
        }

        val btnZero: Button = findViewById(R.id.buttonZero)
        btnZero.setOnClickListener {
            onButtonClick(btnZero, input, "0")
        }

        val btnHash: Button = findViewById(R.id.buttonHashTag)
        btnHash.setOnClickListener {
            onButtonClick(btnHash, input, "#")
        }

        val btnDelete: Button = findViewById(R.id.buttonDelete)
        btnDelete.setOnClickListener {
            input.setText("") // setting the text to an empty string
        }

        val btnDial: Button = findViewById(R.id.buttonDial)
        btnDial.setOnClickListener {
            var hash: String = input.getText().toString()
            if (hash.contains("#)")) {
                hash.replace("#", "%23")
            }

            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$hash")
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }


    }



    //method that will be implemented in each one of the on click methods for the buttons
    fun onButtonClick(button: Button, inputNumber: EditText, number: String) {
        val input: EditText = findViewById(R.id.editText)
        var cash = input.getText().toString() //input é o nome dado á caixa de texto
        inputNumber.setText(cash + number)

    }
}