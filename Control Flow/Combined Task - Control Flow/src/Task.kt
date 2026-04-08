fun fizzBuzz(n: Int): String {
    var result = ""
    for (i in 1..n) {
        when {
            i % 15 == 0 -> result += "FizzBuzz "
            i % 3 == 0 -> result += "Fizz "
            i % 5 == 0 -> result += "Buzz "
            else -> result += "$i "
        }
    }
    return result
}