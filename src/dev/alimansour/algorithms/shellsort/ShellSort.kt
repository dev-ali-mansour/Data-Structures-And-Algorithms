package dev.alimansour.algorithms.shellsort

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
// Note that Shell sort is better than insertion sort

fun main() {
    val intArray = arrayOf(20, 35, -15, 7, 55, 1, -22)
    intArray.shellSort()
    for (e in intArray) {
        print("$e ")
    }
}

private fun Array<Int>.shellSort() {
    var gap = size / 2
    while (gap > 0) {
        var i = gap
        while (i < size) {
            val newElement = this[i]
            var j = i
            while (j >= gap && this[j - gap] > newElement) {
                this[j] = this[j - gap]
                j -= gap
            }
            this[j] = newElement
            i++
        }
        gap /= 2
    }
}