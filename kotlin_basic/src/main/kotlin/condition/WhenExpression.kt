package condition

fun main() {
    val finalExam = 'C'

    when(finalExam){
        'A' -> println("Wowwwww")
        'B' -> {
            println("Not Bad")
        }
        'C' -> println("Never give up")
        'D' -> println("Try Again")
    }

    val score = 'A'
    when(score){
        'A','B','C' ->{
            println("Good Job")
        }
        else ->{
            println("Try Again")
        }
    }

    val passValues = arrayOf('A','B','C')
    when(score){
        in passValues -> println("Lulus")
        !in passValues -> println("Tidak lulus")
    }

    val name = "A"
    when(name){
        is String -> println("Ini adalah string")
        !is String -> println("Bukan string")
    }

    val scoreExam = 1001
    when{
        scoreExam > 80 && scoreExam <=100 -> println("Niceee")
        scoreExam > 70 && scoreExam < 80 -> println("Good")
        else -> println("Opps sorry")
    }
}