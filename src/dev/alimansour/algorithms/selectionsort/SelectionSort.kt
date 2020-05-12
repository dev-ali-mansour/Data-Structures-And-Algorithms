package dev.alimansour.algorithms.selectionsort

/**
 * Data Structures And Algorithms Using Kotlin
 * This file was created for training purpose only By Ali Mansour Mohamed.
 * To help students learn and practise Data Structures and Algorithms using
 * Kotlin language. Notice that this topic is not tied with a specific programming language
 * So you can read and practise the examples in this project using your preferred language
 * ----------------------- CONTACT ME ------------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */

// Time Complexity : O(n2)
// Space Complexity: O(1)
// Stability       : unstable sort algorithm

fun main() {
    val intArray = arrayOf(20, 35, -15, 7, 55, 1, -22)
    intArray.selectionSort()
    for (e in intArray) {
        print("$e ")
    }
}

private fun Array<Int>.selectionSort() {
    var lastUnsortedIndex = this.size - 1
    while (lastUnsortedIndex > 0) {
        var largest = 0
        for (i in 1..lastUnsortedIndex) {
            if (this[i] > this[largest]) largest = i
        }
        swap(largest, lastUnsortedIndex)
        lastUnsortedIndex--
    }
}

private fun Array<Int>.swap(first: Int, last: Int) {
    val temp = this[first]
    this[first] = this[last]
    this[last] = temp
}
