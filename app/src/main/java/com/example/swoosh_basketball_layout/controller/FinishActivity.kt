package com.example.swoosh_basketball_layout.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh_basketball_layout.EXTRA_LEAGUE
import com.example.swoosh_basketball_layout.EXTRA_SKILL
import com.example.swoosh_basketball_layout.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueText.text = "Looking for $league $skill league near you..."
    }
}