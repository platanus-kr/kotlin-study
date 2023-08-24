package controlstatements.exceptions

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class KotlinFilePrinter {

    fun readFile() { // Kotlin에는 모두 Unchecked Exception 이다.
        val currentFile= File(".")
        val file = File(currentFile.absolutePath + "/file.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    fun readFile(path: String) { // try-with-resource 대신 use()가 사용된다.
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }

    /**
     * (스포)
     *
     * 나중에 람다 할 때 다시 오게 되니 패스
     *
     * .use()를 따라가보면 Closable 구현체에 대한 T의 확장 함수인 것을 알 수 있다.
     * 받는 파라미터가 (T) -> R의 Function 인터페이스 식 람다다.
     * inline 함수다.
     *
     */
}