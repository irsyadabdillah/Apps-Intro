package com.irzstudio.apps_intro_onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rd.PageIndicatorView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager.adapter = ViewPagerAdapter(supportFragmentManager)

        indicator_page.setViewPager(viewpager)


    }
}