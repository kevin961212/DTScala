package com.kevin.scala

/**
  * 变量和常量的定义
  * @author kevin
  */
object VarValDemo {

    def main(args:Array[String]):Unit={

        // 声明变量或常量必须要以var或val开头不用Int，可以在变量名之后等号之前声明，比如：var 变量名 : 变量类型 = 值
        var variableName : Int = 10
        val valiableName : Int = 20

        // scala具有类型推断的功能，可以不指定变量或常量的类型，但一定要指定初始值，比如：var 变量名 = 值
        var variaName = 10
        val valiaNane = 20
    }

}
