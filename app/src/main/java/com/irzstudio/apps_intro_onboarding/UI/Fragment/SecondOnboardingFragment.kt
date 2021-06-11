package com.irzstudio.apps_intro_onboarding.UI.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.irzstudio.apps_intro_onboarding.Helper.Constant
import com.irzstudio.apps_intro_onboarding.Helper.PreferencesHelper
import com.irzstudio.apps_intro_onboarding.R
import com.irzstudio.apps_intro_onboarding.UI.HomeActivity
import kotlinx.android.synthetic.main.fragment_first_onboarding.*


class SecondOnboardingFragment : Fragment(R.layout.fragment_second_onboarding) {

    private val sharedPref: PreferencesHelper by lazy{
        PreferencesHelper(requireContext())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_started.setOnClickListener {
            sharedPref.put(Constant.PREF_IS_STARTED, true)
            startActivity(Intent(activity, HomeActivity::class.java))
            activity?.finish()
        }
    }

}