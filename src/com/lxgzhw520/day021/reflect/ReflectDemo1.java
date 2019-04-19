package com.lxgzhw520.day021.reflect;


import com.lxgzhw520.day021.domain.Person;
import com.lxgzhw520.day021.domain.Student;

class ReflectDemo1 {


    /**
     * 获取Class对象的方式：
     * 1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
     * 2. 类名.class：通过类名的属性class获取
     * 3. 对象.getClass()：getClass()方法在Object类中定义着。
     */
    public static void main(String[] args) throws Exception {

        //1.Class.forName("全类名")
        //多用于配置文件
        Class cls1 = Class.forName("com.lxgzhw520.day021.domain.Person");
        System.out.println(cls1);
        //2.类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);
        //3.对象.getClass()
        Person p = new Person();
        //多用于参数的传递
        Class cls3 = p.getClass();
        System.out.println(cls3);

        //== 比较三个对象
        System.out.println(cls1 == cls2);//true
        System.out.println(cls1 == cls3);//true

        //实例.class能够得到实例对应的类
        Class c = Student.class;
        System.out.println(c == cls1);


    }
}
