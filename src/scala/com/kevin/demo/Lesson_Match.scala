package com.kevin.demo

object Lesson_Match {
    def main(args:Array[String]) : Unit = {
        val tuple = (1,"hello",'c',1.0,true)
        val iter = tuple.productIterator
        while(iter.hasNext){
            val one = iter.next()
           // Matchtest(one)
        }
    }

   /* def Matchtest(o: Any) = {
        o match {
            case 1=>println("value is 1")
            case i:Int => pritln("type" )
        }
    }*/

}
