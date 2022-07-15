package com.example.swoosh_basketball_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class skill_activity : AppCompatActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
    league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)
    }
}