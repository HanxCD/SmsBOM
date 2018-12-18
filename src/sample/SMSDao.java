package sample;

public class SMSDao {
    private String url;
    private String inputId;
    private String sendId;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    public SMSDao(String url, String inputId, String sendId) {
        this.url = url;
        this.inputId = inputId;
        this.sendId = sendId;
    }
}
