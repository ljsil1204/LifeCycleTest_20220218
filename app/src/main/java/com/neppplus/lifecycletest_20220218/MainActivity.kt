package com.neppplus.lifecycletest_20220218

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpEvent()
        setValues()

        Log.d("메인화면", "메인화면 onCreate 실행됨")

    }

    override fun onResume() {
        super.onResume()

        Log.d("메인화면", "메인화면의 onResume 실행")
    }

    override fun onPause() {
        super.onPause()
        Log.d("메인화면", "메인화면의 onPause 실행")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("메인화면", "메인화면의 onDestory 실행")
    }


    fun setUpEvent() {

//        이벤트 처리에 관한 코드를 모아두는 함수
        btnMove.setOnClickListener {

            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }

    }



    fun setValues() {

//        화면에 값을 띄워주기 위한 코드를 모으는 함수
        btnMove.text = "CLICK"

    }
}