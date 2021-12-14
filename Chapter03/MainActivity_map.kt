 package kr.co.kibeom.collection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 맵 생성하기
        var map = mutableMapOf<String, String>()
        // 값 추가
        map.put("key1", "MON")
        map.put("key2", "TUE")
        map.put("key3", "WED")

        // 값 사용
        var variable = map.get("key2")
        Log.d("Collection", "key2의 값은 ${variable} 입니다.")

        // 값 수정
        map.put("key2", "FRI")
        Log.d("Collection", "key2의 값은 ${map.get("key2")} 입니다.")

        // 값 삭제
        map.remove("key2")

        // 삭제한뒤 key2  없으므로 null 출력
        Log.d("Collection", "key2의 값은 ${map.get("key2")} 입니다.")

    }
}
