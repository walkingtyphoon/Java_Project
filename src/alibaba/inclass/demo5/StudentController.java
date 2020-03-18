package alibaba.inclass.demo5;

/**
 * @program: Java workspace
 * @description: 创建学生的控制类
 * @author: Typhoon
 * @create: 2020-03-01 09:31
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class StudentController {
    private Student model;
    private StudentView View;

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollname(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollname();
    }

    public StudentController(Student model, StudentView view) {
        this.model = model;
        View = view;
    }


    public void updateView(){
        View.show(model.getName(),model.getRollname());
    }
}
