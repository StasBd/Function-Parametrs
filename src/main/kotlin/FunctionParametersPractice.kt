fun printSome(item: String, vararg word: Any) {
    print("$item: ")
    word.forEach { el -> print("$el, ") }
    println("")
}
//nevermind just practice)
fun main(args: Array<String>) {
    var names = arrayOf("Bob", "Stas", "Vadym", 1, false)
    println("Hi")
    printSome("Yuriy i wanna hire you for 5 bucks")
    printSome("Hello", "No")
    printSome("Hi", *names)
}