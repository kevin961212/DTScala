package com.kevin.demo

object Lesson_Collections {

    def main(args:Array[String]):Unit = {

        /**
          * Array
          */
        // 可以混合写不指定类型
        // val arr = Array(1,2,3,4,"hello",'c')

        /* 添加数据数据，方式一
        val arr = Array[Int](1,2,3,4)
        arr.foreach(println)
        for(elem<-arr){
            println(elem)
        }*/

        /* 添加数据数据，方式二
        val arr = new Array[String](3)
        arr(0) = "a"
        arr(1) = "b"
        arr(2) = "c"
        arr.foreach(println)*/

        /**
          * List        --有序
          */
       /* val list = List[Int](1,2,3,4)
        list.foreach(println)*/

        // 该遍历等同java的for(int elem : list){System.out.println(elem)}
        /*for(elem <- list){
            println(elem)
        }*/

        //val list = List("hello world","hello java","hello scala")
        // map拿到一条数据切分放在数组中返回List，一对一
        /* val result : List[Array[String]] = list.map(s=>{
            s.split(" ")
        })
        result.foreach(array=>{
            println("**********")
            array.foreach(println)
        })*/

        // flatMap拿到一条数据切分返回两条数据返回List，一对多
        /*val result1 : List[String] = list.flatMap(s=>{
            s.split(" ")
        })
        result1.foreach(println)*/

        // filter过滤数据，true则返回，false过滤
        /*val result = list.filter(line => {
            !line.equals("hello world")
        })
        result.foreach(println)*/


        /**
          * set     --无序不重复
          */
        /*val set = Set[Int](1,2,3,4,5)
        set.foreach(println)*/


        /**
          * map
          *    相同的值会被覆盖，map中可以算是一个二元组
          */
        // Map(1->"a",2->"b")等同Map((1,"a"),(2,"b"))等同java的new HashMap(Integer,String)(){{put(1,"a"); put(2,"b");}};
        /*val map = Map(1->"a",2->"b",(3,"c"),(3,"d"))
        map.foreach(println)        //直接遍历输出所有的数据*/
        // 取值
        /*val value : String = map.get(2).get
        println("取值："+value)*/

        // 取值，如果值不存在则返回传入的值
        /*val value : String = map.get(20).getOrElse("bucunzai")
        println("如果取的key不存在，则返回输入的值："+value)*/

        /*val values = map.values
        println("取到所有的值："+values)*/

        /*val keys : Iterable[Int] = map.keys
        keys.foreach(s=>{
            println("遍历所有值："+s)
        })*/


        /**
          * tuple
          *     元组,Tuple几就传多少个值，最多支持22个元素，关键字new可以省略，也可以直接省略Tuple几直接传元素
          */
        val tuple1 = new Tuple1("hello")
        val tuple2 = new Tuple2("hello",10)
        val tuple3 = new Tuple3(1,2,3)
        val tuple5 = new Tuple5(1,'c',3,4,"a")
        val tuple4 = (1,2,3,4)  //等同val tuple4 = new Tuple4(1,2,3,4),也等同于val tuple4 = Tuple4(1,2,3,4)

        println(tuple3+"，获取第二个元素："+tuple3._2)

        val iter: Iterator[Any] = tuple2.productIterator
        while(iter.hasNext) {
            println(iter.next())
        }






    }

}
