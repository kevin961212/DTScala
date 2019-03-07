package com.kevin.scala.function

/**
  *     函数：柯里化，是指将原来接受两个参数的函数变成新的接受一个参数的函数的过程，
  *     新的函数返回一个以原有第二个参数为参数的函数
  * @author kevin
  */
object Function9Demo {

    def main(args:Array[String]):Unit={
        var i:Int = 3
        var j:Int = 4
        println(add(i,j))

        println(add1(i)(j))

    }

    // 该函数使用方式为add(1,2)
    def add(x:Int,y:Int) = x+y

    // 柯里化后该函数的使用方式add1(1)(2)       柯里化时最先演化为def add1(x:Int)=(y:Int)=>x+y
    def add1(x:Int)(y:Int) = x+y

}
