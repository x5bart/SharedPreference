package com.x5bart.sharedpreference

import android.content.Context

class MyPreference(context: Context) {

    private val PREFERENCE_NAME = "SharedPreferenceExample"
    private val PREFERENCE_LOGIN_COUNT = "LoginCount"

    private val preference = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    fun getLoginCount(): Int {
        return preference.getInt(PREFERENCE_LOGIN_COUNT, 0)
    }

    fun setLoginCount(count: Int) {
        val editor = preference.edit()
        editor.putInt(PREFERENCE_LOGIN_COUNT, count)
        editor.apply()
    }

}