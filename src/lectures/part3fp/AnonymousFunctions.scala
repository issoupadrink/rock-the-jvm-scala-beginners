package lectures.part3fp

object AnonymousFunctions extends App {
    val doubler: (Int => Int) = {
        x => x * 2
    }

    val adder: ((Int, Int) => Int) = {
        (x, y) => x + y
    }
}
