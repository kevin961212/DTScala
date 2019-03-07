package com.kevin.scala.function

/**
  *     函数：匿名函数，箭头左边是参数列表，右边是函数体
  *     参数列表 => 函数体
  * @author kevin
  */
object Function8Demo {

    def main(args:Array[String]):Unit={

        val i = inc(7)
        println(i)

        println(mul(3,4))

        println(userDir())
    }

    // 匿名函数写法，inc是返回的值，(x:Int)是参数列表，x+1是函数体
    var inc = (x:Int) => x+1

    // 上面定义的匿名函数，其实就是这种写法的简写
    def add2 = new Function1[Int,Int]{
        def apply(x:Int):Int = x+1;
    }

    // 匿名函数，定义多个参数
    var mul = (x:Int,y:Int) => x*y

    // 匿名函数，不设置参数
    var userDir = ()=>{System.getProperty("user.dir")}



}



