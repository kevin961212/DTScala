package com.kevin.scala

/**
  * 私有成员，仅在包含了成员定义的类或对象内部可见，同样的规则也适用于内部类
  * @author kevin
  */
object OuterDemo {

    class Inner{
        private def f(){println("f")}
        class InnerMost{
            f()     // 这样调用正确
        }
    }
    // (new Inner).f()  // 错误，无法调用

}