package com.kevin.scala.function

/**
  * 传名调用，将未计算的参数表达式直接引用到函数内部
  * @author kevin
  */
object CallByNameDemo {

    def main(args:Array[String]):Unit={
        delayed(time())
    }

    def time()={
        println("获取时间，单位为纳秒")
        System.nanoTime()
    }

    def delayed(t: => Long)={
        println("在delayed方法内")
        println("参数: " + t)
        t
    }

}
