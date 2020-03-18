package alibaba.preview.demo1;

import alibaba.inclass.demo6.Emp;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: Java workspace
 * @description: 复习Java高并发
 * @author: Typhoon
 * @create: 2020-03-05 16:15
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Preview03 {
    public static void main(String[] args) {
        SAXReader saxReader = new SAXReader();
        // 创建xml的读取对象
        try {
            Document document = saxReader.read(new File("02.xml"));
            // 读取xml文件，并返回对象
            Element element = document.getRootElement();
            // 获取xml的根节点
            List<Element> list = element.elements();
            // 获取节点树，返回以一个list集合
            int id ;
            // 设置获取到的ID的值
            String name;
            // 设置获取到的name值
            int age;
            // 设置获取到的姓名的值
            String gender;
            // 设置获取到的性别值
            double salary;
            // 设置获取到的工资
            List<Emp> empList = new ArrayList<>();
            // 创建集合，用于存储获取到的大量信息数据
            for(Element e:list){
                // 遍历目录树
                id = Integer.parseInt(e.attribute("id").getValue());
                // 解析属性值，转化为int类型
                name = e.elementText("name");
                // 解析元素文本
                age = Integer.parseInt(e.elementText("age"));
                // 解析元素值，转化为指定类型
                gender =e.elementText("gender");
                // 解析元素文本
                salary = Double.parseDouble(e.elementText("salary"));
                // 解析元素，转化为浮点数
                Emp emp = new Emp(id,name,age,gender,salary);
                // 创建实体类对象，用于存储对象信息
                empList.add(emp);
                // 添加对象到集合中
            }
            System.out.println("获取后的元素值为："+empList);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
