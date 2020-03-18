package alibaba.inclass.demo7;

@MyAnnotation03(ClassName = "alibaba.inclass.demo7.Person", MethodName ="eat")
public class Annotation04 {
    public static void main(String[] args) {
        Class<Annotation04> myAnnotation03Class = Annotation04.class;
        MyAnnotation03 annotation = myAnnotation03Class.getAnnotation(MyAnnotation03.class);
        String s = annotation.ClassName();
        String s1 = annotation.MethodName();
        System.out.println(s+":"+s1);
    }
}
