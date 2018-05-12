package bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AdvertisingVersionBean {
    private String version;
    private String createTime;

    public AdvertisingVersionBean(String version) {
        this.version = version;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd");
        String nowDate = dateFormat.format(new Date());
        this.createTime = nowDate;
    }

    public String getVersion() {
        return version;
    }

    public String getCreateTime() {
        return createTime;
    }

}
