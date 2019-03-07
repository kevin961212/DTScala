package com.kevin.scala.function

/**
  * 函数：递归函数，递归函数意味着函数可以调用它本身
  * @author kevin
  */
object Function6Demo {

    def main(args:Array[String]): Unit = {
        for(i <- 1 to 10)
            println(i + " 的阶乘为: = " + factorial(i))
    }

    // 用来做递归
    def factorial(n:BigInt) : BigInt = {
        if(n <= 1)
            1
        else
            n * factorial(n-1)  // 在n不小于等于1时会调用本身
    }
}
