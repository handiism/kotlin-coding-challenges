package com.igorwojda.codingpuzzle.fizzbuzz

private fun fizzBuzzSolution1(n: Int): List<String> {
    val list = mutableListOf<String>()

    (1..n).forEach {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "fizzbuzz" //also (it % 15 == 0) because 3x5=15
            it % 3 == 0 -> "fizz"
            it % 5 == 0 -> "buzz"
            else -> it.toString()
        }

        list.add(item)
    }

    return list
}