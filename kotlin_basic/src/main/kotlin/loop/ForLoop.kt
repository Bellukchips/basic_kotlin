package loop

fun main() {
    val array = arrayOf("Akbar", "Lukman","Lutfi")
    for (name in array){
        println(name)
    }
    /**Akbar
    Lukman
    Lutfi**/
    for (i in 0..10){
        println(i)
    }
    /**
     * 0
     * 1
     * 2
     * 3
     * 4
     * 5
     * 6
     * 7
     * 8
     * 9
     * 10**/

    for (i in 10 downTo 0 step 2){
        println(i)
    }
    /**
     * 10
     * 8
     * 6
     * 4
     * 2
     * 0**/

    for (i in 0..array.size - 1){
        println("Index $i = ${array.get(i)}")
    }
    /**Index 0 = Akbar
    Index 1 = Lukman
    Index 2 = Lutfi**/
}