package lectures.part2oop

object OOBasics extends App {

    val person = new Person("Edd", 26)
    println(person.greet("Soph"))

    val jkRowling = new Author("J", "Rowling", 1990)
    val harryPotter = new Novel("Harry Potter", 2003, jkRowling)
    val harryPotter2 = new Novel("Harry Potter 2", 2004, jkRowling)
}

class Person(name: String, val age: Int) {
    def greet(name: String): Unit = println(s"${this.name} says: Hey $name!")
}

class Author(val firstName: String, val lastName: String, val year: Int) {
    def fullName = s"$firstName $lastName"
}
class Novel(val title: String, val releaseYear: Int, val author: Author) {
    def isWrittenBy(): Author = {this.author}
}

class Counter(val i: Int = 0) {

    def increase(): Unit = {
        new Counter(this.i + 1)
    }

    def increase(increaseAmount: Int) {
        new Counter(this.i + increaseAmount)
    }

    def decrease(): Unit = {
        new Counter(this.i - 1)
    }

    def decrease(decreaseAmount: Int): Unit = {
        new Counter(this.i - decreaseAmount)
    }

    def get(): Int = {
        this.i
    }
}
