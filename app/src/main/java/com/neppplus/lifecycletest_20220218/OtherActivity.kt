package com.neppplus.lifecycletest_20220218

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        Log.d("다른 화면", "다른화면의 onCreate 실행")
    }
}