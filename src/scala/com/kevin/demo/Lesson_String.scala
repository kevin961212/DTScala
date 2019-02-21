package com.kevin.demo

object Lesson_String {

    def main(args:Array[String]) : Unit = {

        val builder = new StringBuilder
        builder.+('a')
        builder.++=("helloe")
        builder.append(true)
        println(builder)

    }

}
