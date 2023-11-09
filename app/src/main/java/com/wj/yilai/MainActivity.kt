package com.wj.yilai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wj.mylibrary.TestUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestUtil.test()
    }
}