package com.kevin.demo

// 类和Object可以重名
object Lesson_Fun {

    // scala的中主函数入口，args：参数名称，Array[String]：参数类型，String数组，Unit：没有返回值，类似java的void
    def main(args : Array[String]): Unit = {

        /*val a = 100
        if(a<50){
            println("a小于50")
        } else if(a >= 50 && a <= 100) {
            println("50 < a < 100")
        } else {
            println("a > 100")
        }*/

        // 1 to 10 是一个Range数组，从1到10（操作符操作）
        //println(1 to 10)
        // 1 to (10,2)，2是步长
        //println(1 to (10,2))
        // 1 until 10 是一个Range数组，从1到9，不包含10（操作符操作）
        //println(1 until 10)

        // 遍历1 到 10，双层for循环，1 有1到10， 2 有1到10,直到10
        /*for(i <- 1 to 10) {
            for (j <- 1 to 10) {
                println("i = " + i + " j = " + j)
            }
        }*/

        // 99乘法
        /*for(i <- 1 to 9; j <- 1 to 10) {
            if(i >= j){
                print(i + "*" + j + " = " + j*j + "\t")
            }
            if(i ==j ) {
                println()
            }
        }*/

        // 1到100，打印偶数
        /*for (i <- 1 to 100 if(i%2==0)) {
            println(i)
        }*/

        // yield i 是将数据放到一个数组
        //val result = for(i <- 1 to 100 if(i % 10 == 0)) yield i
        //result 等同于java中的int[] result

        //println(result)
        // 方式一：遍历数据
        /*for(a <- result){
            println(a)
        }*/
        // 方式二：遍历数据
        /*result.foreach(a =>  {
            println(a)
        })*/
        // 方式三：遍历数据
        //result.foreach(println(_))
        // 方式四：遍历数据
        //result.foreach(println)

        /*
        以上四种遍历数据的方式等同于java的foreach
        for(int s : result) {
            System.out.println(s);
        }
        */

        /**
          * 方法定义
          *     1.return可以省略，省略之后，方法体中最后一行计算的结果当做返回值返回，return如果写，方法的返回值类型不能省略
          *     2.方法的返回值类型可以省略，会自动推断
          *     3.定义方法用"def"，给方法传参不能省略参数的类型
          *     4.如果方法可以一行搞定，那么方法的方法体{...}可以省略不写
          *     5.定义方法"="可以省略，省略之后，无论方法体最后一行计算的结果是什么都会被丢弃，返回Unit
          */

        // 方式一：定义方法，省略方法的返回值
        /*def max(a : Int, b : Int) = {
            if(a > b) {
                a
            } else {
                b
            }
        }*/

        // 方式二：定义方法，可以一行代码搞定，所以可以省略方法体
        //def max(a : Int, b : Int) = if(a > b) a else b

        //println(max(100,2))

        // 递归函数，递归函数要显示声明函数的返回值类型
       /* def fun(num : Int) : Int = {
            if(num == 1) {
                1
            } else {
                num * fun(num - 1)
            }
        }

        println(fun(5))*/

        // 参数有默认值的函数
        /*def fun(a : Int = 2, b : Int = 3) = {
            a * b
        }
        // 调用使用默认的参数
        println(fun())
        // 调用替换默认的参数，如果只传入一个参数，默认是第一个参数，也可以指定传入的参数的名称
        //println(fun(20))
        println(fun(b=30))*/

        // 可变长参数的函数，=> 的意思是传入一个匿名函数
        //def fun(elems : String*) = {
            //elems.foreach(println)
            /*elems.foreach(s=> {
                println(s)
            })*/
            /*for(elem <- elems){
                println(elem)
            }*/
        //}

        //fun("a","b","c")

        // 匿名函数
        /*val fun = (a:Int,b:Int) => {
            a+b
        }
        val fun1 = (s : String) =>{
            println(s)
        }
        println(fun(1,2))
        fun1("aaa")*/


        /**
          *     嵌套函数
          *
          * 一个函数中嵌套别的函数
          */
        /*def fun(a : Int) = {
            def fun1(num : Int) : Int = {
                if(num == 1) {
                    1
                } else {
                    num * fun1(num - 1)
                }
            }
            fun1(a)
        }
        println(fun(5))*/

        /**
          *     偏应用函数
          * 偏应用函数是一个表达式，将方法中不变的参数写上，变化的参数使用"_"表示，下次直接调用这个偏应用表达式直接传入变化的参数就可以
          */
        /*def showLog(date : Date, log : String) ={
            println("date is " + date + " ,log is " + log)
        }
        val date = new Date()
        /*showLog(date, "a");
        showLog(date, "b");
        showLog(date, "c");*/

        val fun = showLog(date : Date, _ : String)
        fun("aaa")
        fun("ccc")
        fun("ccc")*/

        /**
          * 高阶函数
          *     1.函数的函数是函数
          *     2.函数的返回是函数      --函数的返回是函数时，要显示声明函数的返回类型
          *     3.函数参数和返回都是函数
          */

        // 函数的参数是函数
        // 方式一
        /*def fun(a : Int,b : Int) : Int = {
            a+b
        }

        // f:(Int,Int) => Int等同于f(a:Int,b:Int):Int
        def fun1(s : String, f:(Int,Int) => Int) = {
            val result = f(100,200) // 返回一个Int类型
            s+"~"+result    // 返回一个String类型
        }
        println(fun1("hello",fun))*/


        /*def fun1(s : String, f:(Int,Int) => Int): String = {
            val result = f(100,200) // 返回一个Int类型
            s+"~"+result    // 返回一个String类型
        }

        // 方式二:直接在函数中写匿名函数
        val result = fun1("hello",(a:Int,b:Int) => {a*b})
        println(result)*/


        // 函数的返回是函数
        // fun函数是需要两个Int参数，返回值是一个函数，为返回值传入两个String类型的参数，那么调用的时候回fun(10,20)("hello","world")
        /*def fun(a:Int,b:Int):(String,String) => String = {
            val result = a*b
            // 返回的函数需要传入2个String参数，返回最终再返回一个String
            def fun1(s:String,s1:String):String = {
                s + "@" + s1 + "#" + result
            }
            // 返回的函数
            fun1
        }

        val result = fun(10,20)("hello","world")     // hello@world#200
        println(result)*/

        // 函数的参数和返回值都是函数
        // fun函数传入的参数是函数，返回值是函数，调用方式fun((a:Int,b:Int)=>{a-b})("hello","world")
        /*def fun(f:(Int,Int) => Int):(String,String) => String = {

            val result = f(8,9)

            def fun1(s1:String,s2:String):String = {
                s1 + "@" + s2 + "$" + result
            }
            fun1
        }

        val result = fun((a:Int,b:Int)=>{a-b})("hello","world")
        println(result)*/


        // 柯里化函数        --柯里化函数就是高阶函数的简化版
        def fun(a:Int,b:Int)(c:Int,d:Int) = {
            a+b+c+d
        }
        println(fun(1,2)(3,4))


    }

}