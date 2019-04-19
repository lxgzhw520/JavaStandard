package com.lxgzhw520.day021.annotation;



@MyAnno(value=12,per = Person.P1,anno2 = @MyAnno2,strs="bbb")
@MyAnno3
class Worker {
    @MyAnno3
    public String name = "aaa";
    @MyAnno3
    public void show(){


    }
}
