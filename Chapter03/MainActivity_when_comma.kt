package kr.co.kibeom.controlflow1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var age = 25
        when (age) {
            23, 24 -> {
                Log.d("when", "나이가 23살 또는 24살 입니다.")
            }
            25, 26 -> {
                Log.d("when", "나이가 25살 또는 26살 입니다.")
            }
            26, 27 -> {
                Log.d("when", "나이가 26살 또는 27살 입니다.")
            }
        }
    }
}
