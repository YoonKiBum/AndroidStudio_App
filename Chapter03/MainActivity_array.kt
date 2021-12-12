package kr.co.kibeom.array

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 기본 타입 배열 선언
        var IntegerArray = IntArray(5)
        var LongArray = LongArray(5)
        var CharArray = CharArray(5)
        var FloatArray = FloatArray(5)
        var DoubleArray = DoubleArray(5)

        // arrayOf 함수를 사용하여 선언과 동시에 값 입력
        var intArray = intArrayOf(1, 2, 3, 4, 5, 6)

        // 2. String형 배열 선언
        var stringArray = Array(10, {item->""})
        // arrayOf 함수를 사용하여 값의 직접 입력을 통한 배열 생성
        var dayArray = arrayOf("SUN", "MON", "TUE", "WED", "THU", "SAT")

        // 3. 앞에서 선언한 배열 IntegerArray 변수에 값 넣기
        // 인덱스를 통해 사용하는 방법
        IntegerArray[0] = 10
        IntegerArray[1] = 20
        IntegerArray[2] = 30
        // set 함수를 사용하는 방법
        IntegerArray.set(3, 40)
        IntegerArray.set(4, 50)

        // 4. 값 변경해보기
        intArray[2] = 30
        intArray.set(3, 40)

        // 5. 배열 값 사용해보기
        var thirdValue = intArray[2] // 인덱스의 시작이 0 이므로
        Log.d("Array", "세번째 intArray의 값은 ${thirdValue} 입니다.")
        var fourthValue = intArray.get(3) // 인덱스의 시작이 0 이므로
        Log.d("Array", "네번째 intArray의 값은 ${fourthValue} 입니다.")

        // 6. 변수에 담지 않고 바로 출력
        Log.d("Array", "첫번째 intArray의 값은 ${intArray[0]} 입니다.")
        Log.d("Array", "두번째 intArray의 값은 ${intArray[1]} 입니다.")
    }
}
