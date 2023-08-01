package type_data

fun main() {
    val names : Array<String> = arrayOf("Akbar","Lukman","Belluk")
    println(names[0])
    names.set(0,"Rudi")
    println("======")
    println(names[0])
    names[0] = "Ahmad"
    println("======")
    println(names[0])
    // operasi array
    /*
    * size mendapatkan panjang array
    * get(index) mendapatkan data
    * [index] mendapatkan data
    * set(index,value) mengubah data
    * [index] = value mengubah data*/

    // array nullable
    val fruits : Array<String?> = arrayOfNulls(4)
    fruits[0] = "Manggo"
    fruits[1] = "Orange"
    fruits[2] = "Leci"
    fruits[3] = "Apple"
    println("======")
    println(fruits[2])
    println(fruits.size)
}