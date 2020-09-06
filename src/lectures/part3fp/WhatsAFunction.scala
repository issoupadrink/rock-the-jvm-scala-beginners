package lectures.part3fp

object WhatsAFunction extends App {
    val concat:(String, String) => String = (str1: String, str2: String) => str1 + str2

    println(concat("one", "two"))

    val specialFunction: (Int) => ((Int) => Int) = (x: Int) => (y: Int) => x + y
}
