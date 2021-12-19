package kr.co.ki.collectionmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 일반적인 반복문 10까지
        for (i in 1..10) {
            Log.d("For", "현재 숫자는 ${i}")
        }
        // 2. until로 마지막 숫자 제거
        var array = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
        for (i in 0 until array.size) {
            Log.d("For", "현재 요일은 ${array.get(i)} 입니다.")
        }
        // 3. step을 이용한 건너뛰기
        for (i in 1..10 step 2) {
            Log.d("For", "현재 숫자는 ${i}")
        }
        // 4. down to을 이용한 감소
        for (i in 10 downTo 0) {
            Log.d("For", "현재 숫자는 ${i}")
        }
        // 5. 배열, 컬렉션 사용
        for (day in array) {
            Log.d("For", "현재 요일은 ${day} 입니다.")
        }
    }
}
