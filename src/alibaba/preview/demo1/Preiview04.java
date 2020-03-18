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
 * @description: 实现写入xml文件
 * @author: Typhoon
 * @create: 2020-03-05 16:59
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class Preiview04 {
    public static void main(String[] args) {
        List<Emp> emplist = new ArrayList<Emp>();
        emplist.add(new Emp(1,"zhangsan",18,"男",15962));
        emplist.add(new Emp(2,"lisi",20,"女",16262));
        emplist.add(new Emp(3,"wangwu",14,"男",59262));
        emplist.add(new Emp(4,"qianqi",16,"女",19962));
        Document document = DocumentHelper.createDocument();
        // 创建目录树的根目录
        Element rootElement =  document.addElement("users");
        // 创建起始的根节点
        for (Emp e:emplist){
            // 遍历集合
            Element element = rootElement.addElement("user");
            // 添加节点元素
            element.addAttribute("id",e.getId()+"");
            // 添加子节点的属性元素及其值
            element.addElement("name").addText(e.getName());
            // 添加子节点的节点元素设置元素名，并添加文本
            element.addElement("age").addText(e.getAge()+"");
            // 添加年龄节点，设置元素值
            element.addElement("gender").addText(e.getGender()+"");
            // 添加性别的节点，设置元素值
            element.addElement("salary").addText(e.getSalary()+"");
            // 添加工资的节点，设置属性值
        }
        try {
            XMLWriter xmlWriter = new XMLWriter();
            // 创建xml写入对象
            FileOutputStream fileOutputStream = new FileOutputStream("04.xml");
            // 创建文件输出流
            xmlWriter.setOutputStream(fileOutputStream);
            // 设置xml输出流的流对象
            xmlWriter.write(document);
            // 设置写入的对象，也就是xml的根节点
            System.out.println("数据写出成功，请查看");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
