package d_exercicios_logica
// Tabuada

fun main(){
    Ex01(5)
}
fun Ex01(num: Int) {
    for (index in 1..10) {
        println("$index * $num = " + index * num)
    }
}

