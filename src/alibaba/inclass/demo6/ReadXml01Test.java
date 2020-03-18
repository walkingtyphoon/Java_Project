package alibaba.inclass.demo6;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: Java workspace
 * @description: 学习读取xml
 * @author: Typhoon
 * @create: 2020-03-04 08:56
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class ReadXml01Test {
    @Test
    public void readXmlTest(){
        // 创建解析对象
        SAXReader reader = new SAXReader();
        // 读取xml文件
        try {
            Document document = reader.read(new File("02.xml"));
            Element element = document.getRootElement();
            List<Element> list = element.elements();
            int id;
            String name;
            int age;
            String gender;
            double salary;
            List<Emp> list1 = new ArrayList<>();
            for (Element e:list){
                id = Integer.parseInt(e.attribute("id").getValue());
                name = e.elementText("name");
                age = Integer.parseInt(e.elementText("age"));
                gender = e.elementText("gender");
                salary = Double.parseDouble(e.elementText("salary"));
                Emp emp = new Emp(id,name,age,gender,salary);
                // 创建emp用于存储数据
                list1.add(emp);
                // 添加信息到集合
            }
            System.out.println("数据解析完成");
            System.out.println("数据:"+list1);
            // 此处需要重写toString方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void writeXmlTest(){
        List<Emp> emps = new ArrayList<>();
        emps.add(new Emp(1,"韩红",40,"女",20000));
        emps.add(new Emp(2,"周杰伦",35,"男",21000));
        emps.add(new Emp(3,"蔡徐坤",20,"女",15000));
        emps.add(new Emp(4,"刘德华",50,"男",15700));
        try {
            Document document = DocumentHelper.createDocument();
            // 创建文档对象
            Element root = document.addElement("users");
            // 创建根节点
            for (Emp emp:emps) {
                Element element = root.addElement("user");
                // 向根节点添加标签
                element.addAttribute("id",emp.getId()+"");
                //为emp添加属性id
                element.addElement("name").addText(emp.getName());
                element.addElement("age").addText(emp.getAge()+"");
                element.addElement("gender").addText(emp.getGender()+"");
                element.addElement("salary").addText(emp.getSalary()+"");
                // 为emp的子节点添加元素
            }
            XMLWriter writer = new XMLWriter();
            FileOutputStream fileOutputStream = new FileOutputStream("user.xml");
            // 文件输出流
            writer.setOutputStream(fileOutputStream);
            // 设置输出流
            writer.write(document);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
