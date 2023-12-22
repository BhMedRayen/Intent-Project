package com.mohamedrayen.intent

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button2)
        val snack = findViewById<Button>(R.id.snack)
        snack.setOnClickListener {
            val mySnack = Snackbar.make(it,"hello mohamed rayen",Snackbar.LENGTH_SHORT)
            mySnack.setAction("Cancel",View.OnClickListener {
                println("hello marra okhra")
            })
            mySnack.show()
        }
        val dialogue = findViewById<Button>(R.id.dialogue)
        dialogue.setOnClickListener {
            val mydialogue = AlertDialog.Builder(this)
            mydialogue.setMessage("This is a dialogue").setCancelable(false).setPositiveButton("OK",DialogInterface.OnClickListener{
                dialog,id->finish()
            })
                .setNegativeButton("Cancel",DialogInterface.OnClickListener{
                    dialog,id->dialog.cancel()
                })
           val alert = mydialogue.create()
            alert.setTitle("mon premier snack bar")
            alert.show()
        }

        btn.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

    }
}