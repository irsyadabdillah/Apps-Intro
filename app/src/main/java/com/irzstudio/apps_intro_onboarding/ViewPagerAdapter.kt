package com.irzstudio.apps_intro_onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.irzstudio.apps_intro_onboarding.UI.Fragment.FirstOnboardingFragment
import com.irzstudio.apps_intro_onboarding.UI.Fragment.SecondOnboardingFragment
import com.irzstudio.apps_intro_onboarding.UI.Fragment.ThirdOnboardingFragment

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    private val fragment = listOf(
        FirstOnboardingFragment(),
        SecondOnboardingFragment(),
        ThirdOnboardingFragment()
    )

    override fun getCount(): Int {
        return fragment.size
    }

    override fun getItem(position: Int): Fragment {
        return fragment[position]
    }
}