package com.kevin.demo

// trait不能在类直接传参
trait Speak{
    def speak(name:String) = {
        println(name + "is speaking...")
    }
}
trait Listen{
    def listen(name:String) = {
        println(name + "is listening...")
    }
}

// 只能使用一个extends集成Trait，如果要多个继承，在extends之后使用with，比如extends...with...with...
class Person1() extends Speak with Listen {

}

object Lesson_Trait01 {
    def main(args:Array[String]):Unit={
        val p = new Person1()
        p.speak("zhangsan")
        p.listen("lisi")
    }
}
