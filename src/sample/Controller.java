package sample;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller {

    /**
     *  使用jsoup模拟提交请求
     */
    public void login(String url,String inputId,String sendId,String phone) throws Exception{
        Connection con = Jsoup
                .connect(url);// 获取连接
        con.header("User-Agent",
                "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");// 配置模拟浏览器
        Connection.Response rs = con.execute();// 获取响应
        Document d1 = Jsoup.parse(rs.body());// 转换为Dom树
        List<Element> et = d1.select("phone");// 获取form表单，可以通过查看页面源码代码得知

        System.out.println("DL属性值 --- 》 " + d1.toString());
        // 获取，cooking和表单属性，下面map存放post时的数据
        Map<String, String> datas = new HashMap<>();
        for (Element e : et.get(0).getAllElements()) {
            if (e.attr("name").equals(inputId)) {
                e.attr("value", phone);// 设置用户名
            }
            if (e.attr("name").length() > 0) {// 排除空值表单属性
                datas.put(e.attr("name"), e.attr("value"));
            }
        }
    }
    public void sendMsg(){

    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        List<SMSDao> list = new URL().URL();
        for (SMSDao smsDao: list){
            try {
                controller.login(smsDao.getUrl(),smsDao.getInputId(),smsDao.getSendId(),"15136215129");
            }catch (Exception e ){
                e.printStackTrace();
            }

        }
    }

}
