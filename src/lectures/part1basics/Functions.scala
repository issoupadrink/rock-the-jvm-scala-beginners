package lectures.part1basics

import scala.annotation.tailrec

object Functions extends App {

    def aFunction(a: String, b: Int): String =
        a + " " + b

    println(aFunction("Hello", 3))

    def aParameterlessFunction: Int = 42
    println(aParameterlessFunction)

    def aRepeatedFunction(aString: String, n: Int): String = {
        if (n == 1) aString
        else aString + aRepeatedFunction(aString, n-1)
    }

    println(aRepeatedFunction("Hello", 3))

    def aFunctionWithSideEffects(aString: String): Unit = println(aString)

    def aBigFunction(x: Int): Int = {
        def aSmallerFunction(y: Int, z: Int): Int = {
            y + z
        }
        aSmallerFunction(x, 3)
    }

    println(aBigFunction(5)) // 8

    def factorial(x: Int): Int = {
        require(x >= 0, "Argument must be a positive integer.")

        def loop(y: Int): Int = {
            if (y == 0) 1
            else if (y == 1) y
            else y * loop(y - 1)
        }

        loop(x)
    }

    println(factorial(5))

    def fib(n: Int): Int = {
        if (n <= 1) 1
        else fib(n - 1) + fib (n - 2)
    }

    // 1 1 2 3 5 8 13 ...
    println(fib(6)) // 13
}
