package com.kevin.scala

/**
  *     闭包：闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量
  *     闭包通常来讲可以简单的认为是可以访问一个函数里面局部变量的另外一个函数
  * @author kevin
  */
object MultiplierTest {

    def main(args:Array[String]):Unit={
        println(multiplier(1))

        println(multiplier1(2))
    }

    val multiplier = (i:Int) => i*10

    // 引入一个自由变量factor，这个变量定义在函数外面，这样定义的函数变量multiplier成为一个闭包，
    // 因为它引用到函数外面定义的变量，定义这个函数的过程是将这个自由变量捕获而构成一个封闭的函数。
    var factor = 3
    val multiplier1 = (i:Int) => i * factor

}
