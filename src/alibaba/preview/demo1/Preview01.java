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
 * @program: Linux_WorkSpace_Eclipse
 * @description: 测试常用的类
 * @author: Mr.Wang
 * @create: 2020-01-14 12:53
 **/
public class Preview01 {
    public static void main(String[] args) {
        SAXReader saxReader = new SAXReader();
        // 创建xml解析对象
        try {
            Document document = saxReader.read(new File("02.xml"));
            // 读取xml文件，并返回对象
            Element rootElement = document.getRootElement();
            // 通过文件获取根节点
            List<Element> list = rootElement.elements();
            // 获取根节点下的其他节点元素
            int id;
            String name;
            int age;
            String gender;
            double salary;
            List<Emp> emps = new ArrayList<>();
            // 创建对象的集合
            for (Element e:list) {
                // 便利元素集合
                id = Integer.parseInt(e.attributeValue("id"));
                // 解析元素对象，解析属性值为int
                name = e.elementText("name");
                // 直接解析元素的值
                age = Integer.parseInt(e.elementText("age"));
                gender = e.elementText("gender");
                salary = Double.parseDouble(e.elementText("salary"));
                System.out.println("id:"+id+",name:"+name+",age:"+age+",gender:"+gender+",salary:"+salary);
                Emp emp = new Emp(id,name,age,gender,salary);
                // 获取数据放到对象中
                emps.add(emp);
            }
            System.out.println("数据解析完成");
            System.out.println("解析数据如下："+emps);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
