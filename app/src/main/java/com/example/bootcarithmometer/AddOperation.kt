package com.example.bootcarithmometer

class AddOperation: Operation  {
    override fun calculation(input1: Double, input2: Double): Double {
        return input1 + input2
    }
}