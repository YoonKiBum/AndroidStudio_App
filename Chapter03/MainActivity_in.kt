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
            in 10..19 -> {
                Log.d("when", "당신의 나이는 10대 입니다.")
            }
            !in 10..19 -> {
                Log.d("when", "당신의 나이는 10대가 아닙니다.")
            }
        }
    }
}
