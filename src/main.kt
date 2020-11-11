fun main() {
    println("This is a calculator. Type two numbers and then specify what function you want to have happen to them.")
    print("Number One: ")
    val numberOne: Double = readLine()!!.toDouble()
    print("Number Two: ")
    val numberTwo: Double = readLine()!!.toDouble()
    println("1 Add\n2 Subtract\n3 Multiply\n4 Divide")
    var choice: Int = readLine()!!.toInt()
    var numberThree = 0.0
    if (choice == 1) {
        numberThree = add(numberOne, numberTwo)
    }
    else if (choice == 2) {
        numberThree = subtract(numberOne, numberTwo)
    }
    else if (choice == 3) {
        numberThree = multiply(numberOne, numberTwo)
    }
    else if (choice == 4) {
        numberThree = divide(numberOne, numberTwo)
    }
    else {
        println("Incorrect option. Number Three is now 10")
        numberThree = 10.0
    }

    println("The number you got is $numberThree")
    println("Type a new number")
    val numberFour: Double = readLine()!!.toDouble()
    println("Your two numbers are $numberThree and $numberFour")
    println("What will you do to these numbers?")
    println("1 Add\n2 Subtract\n3 Multiply\n4 Divide")
    choice = readLine()!!.toInt()
    val numberFive: Double
    if (choice == 1) {
        numberFive = add(numberThree, numberFour)
    }
    else if (choice == 2) {
        numberFive = subtract(numberThree, numberFour)
    }
    else if (choice == 3) {
        numberFive = multiply(numberThree, numberFour)
    }
    else if (choice == 4) {
        numberFive = divide(numberThree, numberFour)
    }
    else {
        println("Incorrect option. Number Five is now 10")
        numberFive = 10.0
    }
    println("Your final number is $numberFive")
}

fun add(x: Double, y: Double): Double {
    return x + y
}

fun subtract(x: Double, y: Double): Double {
    return x - y
}

fun multiply(x: Double, y: Double): Double {
    return x * y
}

fun divide(x: Double, y: Double): Double {
    return x / y
}