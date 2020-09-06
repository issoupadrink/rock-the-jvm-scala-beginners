package lectures.part1basics


object ValuesVariablesTypes extends App {

    val aString: String = "Hello, world!"
    val aChar: Char = 'a'

    val anInt: Int = 2
    val aDouble: Double = 2.0
    val aFloat: Float = 2.0f
    val aLong: Long = 11234567890L

    val aBool: Boolean = true

    var aVar: Int = 4
    aVar += 1
    println(aVar) // 5
}
