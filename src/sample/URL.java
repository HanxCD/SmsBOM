package sample;

import java.util.ArrayList;
import java.util.List;

public class URL {

    private List<SMSDao> list = new ArrayList<SMSDao>();
    public List<SMSDao> URL(){

        setSMSDao();
        return list;
    }

    public void setSMSDao(){

        list.add(new SMSDao("https://www.renrenche.com/?fr=1463&tg_aid=10050114",
                "phone","verify-btn"));

    }
}
