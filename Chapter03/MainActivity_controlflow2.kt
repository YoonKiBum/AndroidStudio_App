package kr.co.kibeom.controlflow1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = "abc"
        var b = "abcde"
        var c = "abcdefg"

        // if 문 두번 사용
        if (a.length < b.length) {
            Log.d("ControlFlow", "1: a는 b보다 길이가 작습니다.")
        }
        if (a.length < c.length) {
            Log.d("ControlFlow", "1: a는 c보다 길이가 작습니다.")
        }

        // else if문 사용
        if (a.length < b.length) {
            Log.d("ControlFlow", "2: a는 b보다 길이가 작습니다.")
        } else if (a.length < c.length) {
            Log.d("ControlFlow", "2: a는 c보다 길이가 작습니다.")
        }
    }
}
