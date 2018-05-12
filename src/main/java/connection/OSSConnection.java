package connection;

import com.aliyun.oss.OSSClient;
import config.OSSConfig;

public class OSSConnection {
    private static OSSClient  ossClient;
    private OSSConnection(){

    }

    public static OSSClient getOSSConnect(){
        if (OSSConnection.ossClient==null){
            OSSConnection.ossClient = new OSSClient(OSSConfig.ENDPOINT, OSSConfig.ACCESSKEYID, OSSConfig.ACCESSKEYSECRET);
        }
        return  OSSConnection.ossClient;
    }
}
