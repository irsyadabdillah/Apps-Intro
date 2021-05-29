package com.irzstudio.apps_intro_onboarding.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.irzstudio.apps_intro_onboarding.Helper.Constant
import com.irzstudio.apps_intro_onboarding.Helper.PreferencesHelper
import com.irzstudio.apps_intro_onboarding.R

class SplashActivity : AppCompatActivity() {

    private val splash_time_out:Long = 3000
    lateinit var sharedPref: PreferencesHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        sharedPref = PreferencesHelper(this)

        Handler().postDelayed({
            if (sharedPref.getBoolean(Constant.PREF_IS_STARTED) == true){
                startActivity(Intent(applicationContext, HomeActivity::class.java))
                finish()
            }else {
                startActivity(Intent(applicationContext, OnboardingActivity::class.java))
                finish()
            }
        }, splash_time_out)
    }
}