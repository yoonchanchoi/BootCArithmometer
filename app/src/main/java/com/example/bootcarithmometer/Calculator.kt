package com.example.bootcarithmometer

import java.lang.NumberFormatException


fun main() {
    Calculator().runCount()
}

class Calculator {

    private var input1 = 0.0
    private var input2 = 0.0
    private var op = ""

    fun runCount() {
        try {
            println("값을 입력해주세용")
            input1 = readln().toDouble()
        }catch (e: NumberFormatException){
            println("올바른 값을 입력해주세용 종료됩니다.")
            return
        }
        while (true) {
            println("부호를 입력해주세용")
            op = readln()
            try {
                println("값을 입력해주세용")
                input2 = readln().toDouble()
            }catch (e: NumberFormatException){
                println("올바른 값을 입력해주세용 종료됩니다.")
                return
            }
            val tempOp = when (op) {
                "+" -> AddOperation()
                "-" -> SubstractOperation()
                "*" -> MultiplyOperation()
                "/" -> DivideOperation()
                else -> {
                    println("입력된 연산자가 옳바르지 않습니다.(EX: +, -, *, /) 종료됩니다.")
                    break
                }
            }
            input1 = tempOp.calculation(input1, input2)
            println("결과 값은: ${input1}입니다.")
        }
    }

//    fun addOp(input1: Double, input2: Double): Double {
//
//    }
//
//    fun substractOp(input1: Double, input2: Double): Double {
//
//    }
//
//    fun multiplyOp(input1: Double, input2: Double): Double {
//
//    }
//
//    fun divideOp(input1: Double, input2: Double): Double {
//
//    }
//
//    fun remainOp(input1: Double, input2: Double): Double {
//
//    }

}