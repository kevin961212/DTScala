package com.kevin.scala

/**
  * 函数中的可变参数，指定函数的最后一个参数是可以重复的，即不需要指定函数参数的个数，可以向函数传入可变长度参数列表
  * @author kevin
  */
object Function1Demo {
    def main(args:Array[String]):Unit={
        printlnStrings("Scala","Java","Python")
    }

    // 函数中参数可变，用星号代表是可变参数
    def printlnStrings(args: String*) = {
        var i : Int = 0
        for(arg <- args){
            println("Arg Value[" + i + "] = " + arg)
            i = i + 1
        }
    }
}
