package com.padcx.mmz.kotlinassignmentmmz

import java.util.*

/**
 * Created by Myint Myint Zaw on 8/29/2020.
 */
fun main() {
    fun requestInput(): String {
       var scanner = Scanner(System.`in`)
        print("Please enter input => ")
        return scanner.next()
    }
    fun isBalanced(input: String) {
        var firstPair: Int = 0
        var secondPair: Int = 0
        var thirdPair: Int = 0
        var stack = Stack<Char>()
        input.forEach {
            if (it == '{' || it == '[' || it == '(') {
                stack.push(it)
            }
        }
        for (i in input) {
            if (stack.isEmpty()) {
                println("It’s not balanced.")
                break
            }
            when (i) {
                '}' -> {
                    stack.pop()
                    firstPair += 1
                };
                ']' -> {
                    stack.pop()
                    secondPair += 1
                };
                ')' -> {
                    stack.pop()
                    thirdPair += 1
                };
            }
        }
        println(
            "It’s balanced. pair of { = $firstPair," +
                    " pair of [ = $secondPair , pair of ( = $thirdPair"
        )
    }
    var flag = false
    var inputValue = requestInput()
    for (data in inputValue) {
        if (data == '{' || data == '[' || data == '(' ||
            data == '}' || data == ']' || data == ')'
        ) {
            flag = true
        } else {
            flag = false
            break
        }
    }
    if (flag) {
        isBalanced(inputValue)
    } else {
        println("Need to fill correct input!!")
    }
}