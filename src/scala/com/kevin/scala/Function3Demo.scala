package com.kevin.scala

/**
  * 函数，函数嵌套，在函数内定义函数，定义在函数内的函数称为局部函数
  * @author kevin
  */
object Function3Demo {

    def main(args: Array[String]): Unit = {
        println( factorial(0) )
        println( factorial(1) )
        println( factorial(2) )
        println( factorial(3) )
    }

    // 定义函数
    def factorial(i:Int):Int={
        // 定义嵌套函数
        def fact(i:Int,accumulator:Int):Int={
            if(i<=1)
                accumulator
            else
                fact(i-1,i * accumulator)
        }
        // 调用内部函数，函数最后一行的代码可以当做返回值
        fact(i,1)

    }

}
