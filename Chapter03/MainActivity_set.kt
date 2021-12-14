package kr.co.kibeom.collection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 셋 생성하고 값 추가하기
        var set = mutableSetOf<String>()
        set.add("MON")
        set.add("TUE")
        set.add("WED")
        set.add("MON") // 중복된 값 add 불가

        // 2. 전체 데이터 룰력
        Log.d("Collection", "Set 전체 출력 = ${set}")

        // 3. 특정 값 삭제하기
        set.remove("MON")
        Log.d("Collection", "Set 전체 출력 = ${set}")
    }
}
