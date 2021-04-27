package com.aks.testingfcm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.firebase.iid.FirebaseInstanceId

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = intent
        val message = intent.getStringExtra("message")
        print(message)
        if (!message.isNullOrEmpty()) {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Androidly Alert")
            builder.setMessage(message)
//builder.setPositiveButton("OK", DialogInterface.OnClickListener(function = x))

            builder.setPositiveButton(android.R.string.yes) { dialog, which ->
                Toast.makeText(
                    applicationContext,
                    android.R.string.yes, Toast.LENGTH_SHORT
                ).show()
            }

            builder.setNegativeButton(android.R.string.no) { dialog, which ->
                Toast.makeText(
                    applicationContext,
                    android.R.string.no, Toast.LENGTH_SHORT
                ).show()
            }

            builder.setNeutralButton("Maybe") { dialog, which ->
                Toast.makeText(
                    applicationContext,
                    "Maybe", Toast.LENGTH_SHORT
                ).show()
            }
            builder.show()
        }

        var strTocken = FirebaseInstanceId.getInstance().getToken();
        Log.i("TAG", "onCreate: " + strTocken)
        print(strTocken)
    }
// aading line
    // add Seconf in FirtTry
}