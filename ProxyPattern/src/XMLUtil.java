import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
public class XMLUtil {
    //该方法用于从xml配置文件中提取具体类类名，并返回一个实体对象
    public static Object getBean() {
        try {
            //创建DOM文件对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("config.xml"));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("classname");
            Node classNode =nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class c= Class.forName(cName);
            Object obj =c.newInstance();
            return obj;
        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("xmlutil错了");
            return null;
        }
    }
}
