package com.kevin.scala.function

import java.util.Date

/**
  * 函数，偏应用函数，偏应用函数是一种表达式，不需要提供函数需要的所有参数，只需要提供部分，或不提供所需参数
  *
  * @author kevin
  */
object Function4Demo {

    def main(args: Array[String]): Unit = {

        val date = new Date
        // 使用偏应用函数优化以上方法，绑定第一个 date 参数，第二个参数使用下划线(_)替换缺失的参数列表，
        // 并把这个新的函数值的索引的赋给变量
        val logWithDateBound = log(date,_ : String)

        logWithDateBound("message1")
        Thread.sleep(1000)
        logWithDateBound("message2")
        Thread.sleep(1000)
        logWithDateBound("message3")

    }

    def log(date:Date, message:String)={
        println(date + "---" + message)
    }

}
