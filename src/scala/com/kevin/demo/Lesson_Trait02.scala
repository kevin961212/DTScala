package com.kevin.demo

trait IsEqule{
    def isEqu(p:Any):Boolean
    def isNotEqu(p:Any):Boolean = {
        !isEqu(p)
    }
}
class Point(xx:Int,xy:Int) extends IsEqule{
    val x = xx;
    val y = xy;
    def isEqu(p:Any):Boolean={
        // 判断p是不是Point的实例,如果是则判断x是否等于自己的x
        p.isInstanceOf[Point] && p.asInstanceOf[Point].x == this.x
    }
}

object Lesson_Trait02 {

    def main(args:Array[String]):Unit={
        val p1 = new Point(1,2)
        val p2 = new Point(1,3)
        println(p1.isEqu(p2))
        println(p1.isNotEqu(p2))
    }
}
