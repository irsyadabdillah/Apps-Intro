package com.irzstudio.apps_intro_onboarding.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.irzstudio.apps_intro_onboarding.Helper.PreferencesHelper
import com.irzstudio.apps_intro_onboarding.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private val sharedPref: PreferencesHelper by lazy {
        PreferencesHelper(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_restart.setOnClickListener {
            sharedPref.clearAll()
            startActivity(Intent(applicationContext, OnboardingActivity::class.java))
            finish()
        }
    }
}