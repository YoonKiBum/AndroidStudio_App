package kr.co.ki.collectionmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var current = 1
        var until = 12
        while (current < until) {
            Log.d("while", "현재 값은 ${current} 입니다.")
            current = current + 1
        }

        var cnt = 1
        do {
            Log.d("while", "현재 값은 ${cnt} 입니다.")
            cnt = cnt + 1
        } while (cnt < 1)
    }
}
