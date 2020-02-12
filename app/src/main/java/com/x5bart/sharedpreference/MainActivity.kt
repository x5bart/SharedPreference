package com.x5bart.sharedpreference

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        count()
    }

    private fun count() {
        val myPreference = MyPreference(this)
        var loginCount = myPreference.getLoginCount()
        loginCount++
        myPreference.setLoginCount(loginCount)
        tv_count.text = loginCount.toString()

    }
}
