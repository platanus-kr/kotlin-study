package controlstatements

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
}