package alibaba.inclass.demo5;

/**
 * @program: Java workspace
 * @description: 练习mvc的设计模式
 * @author: Typhoon
 * @create: 2020-03-01 09:33
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class TestMvc {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();

        StudentController studentController = new StudentController(model,view);

        studentController.updateView();

        studentController.setStudentName("tom");

        studentController.updateView();
    }

    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollname("10");
        return student;
    }
}
