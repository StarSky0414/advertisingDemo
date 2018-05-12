package manage;

import bean.AdvertisingVersionBean;
import bean.ImageInfoBean;

import java.io.InputStream;

public class Upload {
    public static void uploadImage(InputStream inputStream, ImageInfoBean imageInfoBean, AdvertisingVersionBean advertisingVersionBean){
        MysqlCommit mysqlCommit = new MysqlCommit();
        OSSUpload.ossUploadImage(inputStream,imageInfoBean);
        mysqlCommit.advertisingCommit(imageInfoBean,advertisingVersionBean);
    }
}
