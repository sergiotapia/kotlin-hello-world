import java.util.*

fun main(args: Array<String>) {
    val phrase = "i'm testing kotlin cross platform compilation."
    println(titleize(phrase))

}

fun max(a: Int, b: Int) = if (a > b) a else b

fun titleize(phrase: String): String {
    var words = phrase.split(" ")
        .map { it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() } }
        .joinToString(separator = " ")


    return words
}