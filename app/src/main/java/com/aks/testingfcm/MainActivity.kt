package com.aks.testingfcm

import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.firebase.client.Firebase
import com.google.firebase.iid.FirebaseInstanceId
import org.json.JSONException
import org.json.JSONObject


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
        Firebase.setAndroidContext(this);
        var edName = findViewById<EditText>(R.id.edNAme)
        var edPAss= findViewById<EditText>(R.id.edPass)
        var edRegName = findViewById<EditText>(R.id.edRegNAme)
        var edRegPas = findViewById<EditText>(R.id.edRegPass)

        findViewById<Button>(R.id.btnLogin).setOnClickListener(){
            var name=edName.text
            var pass=edPAss.text
            doLogin(name, pass)
        }
        findViewById<Button>(R.id.btnRegis).setOnClickListener(){
            var name=edRegName.text
            var pass=edRegPas.text
            doRegister(name, pass)
        }
    }

    private fun doLogin(name: Editable?, pass: Editable?) {



    }

    private fun doRegister(name: Editable?, pass: Editable?) {

    }


}