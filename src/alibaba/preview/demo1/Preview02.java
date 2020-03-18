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
 * @description: 复习Java高并发
 * @author: Typhoon
 * @create: 2020-03-04 19:26
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Preview02 {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        list.add(new Emp(1,"张三",15,"男",1500));
        list.add(new Emp(2,"李四",25,"女",1900));
        list.add(new Emp(3,"王麻子",18,"男",2500));
        list.add(new Emp(4,"王五",17,"女",4500));
        list.add(new Emp(5,"赵六",26,"男",3500));
        Document document = DocumentHelper.createDocument();
        // 获取创建的对象
        Element root = document.addElement("users");
        // 创建根节点
        for (Emp e:list) {
            // 遍历存储的数据集合
            Element element = root.addElement("user");
            // 循环添加根节点
            element.addAttribute("id",e.getId()+"");
            // 添加节点的属性值
            element.addElement("name").addText(e.getName());
            // 先添加标签，再添加属性值
            element.addElement("age").addText(e.getAge()+"");
            element.addElement("gender").addText(e.getGender());
            element.addElement("salary").addText(e.getSalary()+"");
        }
        XMLWriter xmlWriter = new XMLWriter();
        // 创建xml的写入对象
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("03.xml");
            // 创建文件输出流，以及输出的目标对象
            xmlWriter.setOutputStream(fileOutputStream);
            // 设置输出流的对象
            xmlWriter.write(document);
            // 设置需要的写入的对象，此处我们写入文档对象
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
