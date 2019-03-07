package com.kevin.scala.function

/**
  *     函数：高阶函数，可以使用其他函数作为参数，或者使用函数作为输出结果
  * @author kevin
  */
object Function7Demo {

    def main(args:Array[String]):Unit = {
        println(apply(layout,10))
    }

    // 函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
    def apply(f:Int => String, v : Int) = f(v)

    def layout[A](x:A) = "[" + x.toString() + "]"

}
