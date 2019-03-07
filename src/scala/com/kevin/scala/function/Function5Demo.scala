package com.kevin.scala.function

/**
  * 函数，指定函数参数名，通过指定函数参数名，并且不需要按照顺序向函数传递参数
  * @author kevin
  */
object Function5Demo {

    def main(args: Array[String]): Unit = {
        printInt(b=5,a=7)
    }

    def printInt(a:Int, b:Int) = {
        println("Value of a : " + a)
        println("Value of b : " + b)
    }

}
