package com.kevin.demo

/**
  * 类的定义
  * 1.scala中定义在object中的变量，方法都是静态的。object叫对象，相当于java的单例对象。object不可以传参，Trait也不可以传参
  * 2.scala中一行代码后可以写;也可以不写;存在分号推断机制。但是多行代码写在一行则需要分号隔开
  * 3.定义变量用var，定义常量用val，var a : Int = 100;，Int是变量的类型，可以写也可以不写，不写则会自动推断变量类型
  * 4.scala中变量，类，对象，方法定义建议符合驼峰命名法。
  * 5.class是scala中的类，但与java中类的不同的是，scala的类可以传参，传参就有了默认的构造函数，
  * 6.类中的属性默认就有getter，setter方法。重写构造函数，第一行就要调用默认的构造函数
  * 7.当new一个class时，类中除了方法和构造器不执行，其他都执行。同个包下，class的名称不能相同
  * 8.scala中如果有一个class名称和object的名称一致，那么这个class叫做这个object的伴生类，这个object叫做这个class的伴生对象，他们之间可以互相访问私有变量
  *
  */
class Card{}

class Person(xname : String, xage: Int) {
    val name = xname;
    var age = xage;
    var gender = 'm'
    println("当new一个class时，类中除了方法和构造器不执行，其他都执行...")

    // 重写构造函数，默认的构造函数中的参数是根据创建类时的参数
    def this(yname:String, yage:Int, ygerder:Char){
        this(yname,yage)
        this.gender = ygerder
    }

    def showHello() = {
        // score是静态数据，可以直接调用，不需要new
        println("hello world" + Lesson_ObjAndClass.score)
    }
}

// 类和Object可以重名
object Lesson_ObjAndClass {

    println("先执行该输出...")

    val score = 200

    // scala的中主函数入口，args：参数名称，Array[String]：参数类型，String数组，Unit：没有返回值，类似java的void
    def main(args : Array[String]): Unit = {

        val p1 = new Person("kevin",23);
        p1.age = 25;
        println(p1.name + p1.age);

        val p2 = new Person("cao",22,'a');
        println(p2.gender);
        p2.showHello()

        // create_VarVal();
    }

    // 创建一个方法，类似java的public void create_VarVal(){}
    def create_VarVal(): Unit = {
        // 变量
        var a = 100;    // 等同var a : Int = 100;
        a = 900;
        // 常量
        val b = 50;
        // b = 40; // b是常量则不用重新赋值
        println(a);
        println(b);
    }

}
