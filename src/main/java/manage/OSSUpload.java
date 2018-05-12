package manage;

import bean.ImageInfoBean;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.event.ProgressEvent;
import com.aliyun.oss.event.ProgressListener;
import com.aliyun.oss.model.PutObjectResult;
import config.OSSConfig;
import connection.OSSConnection;

import java.io.File;
import java.io.InputStream;

public class OSSUpload {
    private static OSSClient ossClient;
    public static void ossUploadImage(final InputStream inputStream, final ImageInfoBean imageInfoBean){
        OSSUpload.ossClient = OSSConnection.getOSSConnect();
        new Thread(){
            @Override
            public void run() {
                String filePath=imageInfoBean.getImageLoadePath()+"."
                        +imageInfoBean.getImageType();
                System.out.println(filePath);
                OSSUpload.ossClient.putObject(OSSConfig.BUCKETNAME, filePath, inputStream);
                OSSUpload.ossClient.shutdown();
                OSSUpload.ossClient=null;
            }
        }.start();
    }

}
