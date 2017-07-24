/*
package com.aditya.moviegame

import android.os.AsyncTask
import android.support.design.widget.TextInputEditText
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject

import java.io.BufferedInputStream
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private var clues: TextView? = null
    private var submit: Button? = null
    private var answer: TextInputEditText? = null
    private var next: TextView? = null
    private var prev: TextView? = null
    private var hint: TextView? = null
    private var cscore: TextView? = null
    private val movies: ArrayList<Movies>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit = findViewById(R.id.submit) as Button
        answer = findViewById(R.id.answer) as TextInputEditText
        clues = findViewById(R.id.clue) as TextView
        next = findViewById(R.id.next) as TextView
        prev = findViewById(R.id.prev) as TextView
        cscore = findViewById(R.id.cscore) as TextView
        hint = findViewById(R.id.hint) as TextView
        submit!!.setOnClickListener { v -> onSubmitClicked(v) }
        hint!!.setOnClickListener { v -> onHintClicked(v) }
        next!!.setOnClickListener { v -> onNextClicked(v) }
        prev!!.setOnClickListener { v -> onPrevClicked(v) }
    }


    fun onHintClicked(view: View) {
        prev!!.text = "0"
    }

    fun onPrevClicked(view: View) {

    }

    fun onNextClicked(view: View) {

    }

    fun onSubmitClicked(v: View) {
        val ans = answer!!.text.toString()

    }

}

*/
