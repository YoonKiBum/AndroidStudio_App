package kr.co.kibeom.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() { // 새로운 블록의 시작
    override fun onCreate(savedInstanceState: Bundle?) { // 4 칸 공백
        super.onCreate(savedInstanceState) // 이전 4칸의 공백에 추가로 4칸의 공백 즉 8칸 공백
        setContentView(R.layout.activity_main)

        var mySubject = "안드로이드"
        var myHeight: Int
        myHeight = 180
        myHeight += 1
        Log.d("BasicSyntax", "mySubject = $mySubject, myHeight = $myHeight")
    }
}
