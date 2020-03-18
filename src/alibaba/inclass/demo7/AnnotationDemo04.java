package alibaba.inclass.demo7;

@MyAnnotation03(ClassName = "alibaba.inclass.demo7.Person", MethodName ="eat")
public class AnnotationDemo04 {
    public static void main(String[] args) {
        Class<AnnotationDemo04> myAnnotation03Class = AnnotationDemo04.class;
        // 加载当前类
        MyAnnotation03 annotation = myAnnotation03Class.getAnnotation(MyAnnotation03.class);
        // 使用当前类获取注解
        String s = annotation.ClassName();
        // 获取注解中的属性
        String s1 = annotation.MethodName();
        System.out.println(s+":"+s1);
    }
}
