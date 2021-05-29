package com.irzstudio.apps_intro_onboarding.UI

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.irzstudio.apps_intro_onboarding.Helper.PreferencesHelper
import com.irzstudio.apps_intro_onboarding.R
import com.irzstudio.apps_intro_onboarding.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnboardingActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        viewpager.adapter = ViewPagerAdapter(supportFragmentManager)
        indicator_page.setViewPager(viewpager)

    }
}