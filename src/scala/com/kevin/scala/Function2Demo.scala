package com.kevin.scala

/**
  * 函数---默认参数值
  * 可以为函数参数指定默认参数值，使用了默认参数，你在调用函数的过程中可以不需要传递参数，
  * 这时函数就会调用它的默认参数值，如果传递了参数，则传递值会取代默认值。
  * @author kevin
  */
object Function2Demo {

    def main(args: Array[String])
    {
        println( "返回值 : " + defaultaddInt(6, 7, 8) );    }

    // 含有默认参数，在调用的时候如果不指定参数值，则使用默认的，指定了参数值将默认的覆盖
    def defaultaddInt(c:Int, a:Int=5, b:Int=7 ) : Int =
    {
        var sum:Int = 0
        sum = a + b + c

        return sum
    }
}
