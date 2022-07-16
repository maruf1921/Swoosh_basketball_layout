package com.example.swoosh_basketball_layout.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh_basketball_layout.EXTRA_LEAGUE
import com.example.swoosh_basketball_layout.EXTRA_SKILL
import com.example.swoosh_basketball_layout.R
import kotlinx.android.synthetic.main.activity_skill.*

class skill_activity : AppCompatActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
    league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)
    }
    fun onBallerClick(view: View){
        beginnerSkillBtn.isChecked = false
        skill = "baller"
    }

    fun onBeginnerClick(view: View){
        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }

    fun onSkillFinishClicked(view: View){
        if (skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this, "please select a skilll", Toast.LENGTH_SHORT).show()
        }


    }

}