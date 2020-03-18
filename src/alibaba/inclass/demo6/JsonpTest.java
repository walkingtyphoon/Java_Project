package alibaba.inclass.demo6;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import java.io.File;
import java.io.IOException;

/**
 * @program: Java workspace
 * @description: 测试jsoup解析
 * @author: Typhoon
 * @create: 2020-03-04 11:46
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public class JsonpTest {

    @Test
    public void parseXmlAll(){
        try {
            Document doc = Jsoup.parse(new File("你的xml文件"),"UTF-8");
            // 创建解析对象
            Elements name = doc.getElementsByTag("user");
            // 通过属性获取元素集
            String value;
            for (Element element : name) {
                value = element.text();
                // 获取其中的指定索引的值
                System.out.println("获取全部数据：" + value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void resolveTheSpecifiedXml(){
        try {
            Document document = Jsoup.parse(new File("user.xml"),"UTF-8");
            // 创建jsoup解析xml文件对象，并设置字符集
            Elements elements = document.getElementsByAttribute("id");
            // 通过标签获取指定内容，返回元素集,此处的标签可以是文档中的任意标签
            String text = elements.get(0).text();
            // 此处可以获取指定索引的值，并获取文本
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
