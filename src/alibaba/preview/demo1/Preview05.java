package alibaba.preview.demo1;

import alibaba.inclass.demo6.Emp;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: Java workspace
 * @description: 写入xml文件
 * @author: Typhoon
 * @create: 2020-03-06 16:02
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Preview05 {
    public static void main(String[] args) {
        List<Emp> empList = new ArrayList<>();
        // 创建数据集合对象
        empList.add(new Emp(1,"张三",15,"男",1500));
        empList.add(new Emp(2,"李四",25,"女",1900));
        empList.add(new Emp(3,"王麻子",18,"男",2500));
        empList.add(new Emp(4,"王五",17,"女",4500));
        empList.add(new Emp(5,"赵六",26,"男",3500));
        // 添加数据元素
        Document document = DocumentHelper.createDocument();
        // 创建xml的根节点
        Element root = document.addElement("users");
        // 创建起始节点
        for(Emp e:empList){
            // 遍历数据集合
            Element element = root.addElement("user");
            // 遍历数据的根元素
            element.addAttribute("id",e.getId()+"");
            // 添加节点元素的属性值
            element.addElement("name").addText(e.getName());
            // 添加name节点及其元素值
            element.addElement("age").addText(e.getAge()+"");
            // 添加age的节点及其元素值
            element.addElement("gender").addText(e.getGender());
            // 添加gender的节点及其元素值
            element.addElement("salary").addText(e.getSalary()+"");
            // 添加salary的节点及其元素值
        }

        try {
            XMLWriter xmlWriter = new XMLWriter();
            // 创建xml的文件写入对象
            FileOutputStream fileOutputStream = new FileOutputStream("05.xml");
            // 创建输出的文件流对象
            xmlWriter.setOutputStream(fileOutputStream);
            // 创建文件输出的流对象
            xmlWriter.write(document);
            // 写入xml的节点树
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
