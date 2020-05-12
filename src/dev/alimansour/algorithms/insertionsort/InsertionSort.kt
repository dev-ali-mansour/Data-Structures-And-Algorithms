package dev.alimansour.algorithms.insertionsort

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
// Stability       : stable sort algorithm

fun main() {
    val intArray = arrayOf(20, 35, -15, 7, 55, 1, -22)
    intArray.insertionSort()
    for (e in intArray) {
        print("$e ")
    }
}

private fun Array<Int>.insertionSort() {
    var firstUnsortedIndex = 1
    while (firstUnsortedIndex < size) {
        val newElement = this[firstUnsortedIndex]
        var i = firstUnsortedIndex
        while (i > 0 && this[i - 1] > newElement) {
            this[i] = this[i - 1]
            i--
        }
        this[i] = newElement
        firstUnsortedIndex++
    }
}