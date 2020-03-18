package alibaba.preview.demo1;

import alibaba.inclass.demo6.Emp;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: Java workspace
 * @description: 学习xml的解析命令
 * @author: Typhoon
 * @create: 2020-03-06 15:35
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Preview04 {
    public static void main(String[] args) {
        SAXReader saxReader = new SAXReader();
        // 创建解析xml的文档对象
        try {
           Document document =  saxReader.read("04.xml");
           // 读取目标xml文件并获取目录树
           Element rootElement = document.getRootElement();
           // 获取xml的根节点
           List<Element> ElementList =  rootElement.elements();
           // 获取根节点下的节点树
           int id;
           // 声明id
           String name;
           // 声明姓名
           int age;
           // 声明年龄
           String gender;
           // 声明性别
           double salay;
           // 声明工资
           List<Emp> empList = new ArrayList<>();
           for (Element e:ElementList){
               // 遍历节点树
               id = Integer.parseInt(e.attribute("id").getValue());
               name = e.elementText("name");
               age = Integer.parseInt(e.elementText("age"));
               gender = e.elementText("gender");
               salay = Double.parseDouble(e.elementText("salary"));
               Emp emp = new Emp(id,name,age,gender,salay);
               empList.add(emp);
           }
        System.out.println("解析后的数据为："+empList);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
