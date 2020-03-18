package alibaba.inclass.demo7;

public @interface MyAnnotation {
/*    *//**
     * @return args
     *//*
    int age() default 18;

    *//**
     * @return 姓名
     *//*
    String name() default "Typhoon";

    *//**
     * @return 这是一个枚举
     *//*
    Student stu();

    MyAnnotation01 anno();

    String [] arr();*/

    int value();
}
