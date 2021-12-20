package kr.co.ki.function

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 반환값과 입력값이 있는 함수
        var result = square(10)
        Log.d("fun", "10의 제곱은 ${result}입니다.")

        // 반환값이 없는 함수
        printMinus(5, 3)

        // 매개변수 없이 반환값만 있는 함수
        val PI = getPi()
        Log.d("fun", "지름이 10인 원의 넓이는 ${10 * 10 * PI} 입니다.")
    }

    // 반환값과 입력값이 있는 함수
    fun square(n: Int): Int {
        return n*n
    }

    // 반환값이 없는 함수
    fun printMinus(n1: Int, n2: Int) {
        Log.d("fun", "n1 - n2 = ${n1 - n2}")
    }

    // 매개변수 없이 반환값만 있는 함수
    fun getPi(): Double {
        return 3.14
    }
}
