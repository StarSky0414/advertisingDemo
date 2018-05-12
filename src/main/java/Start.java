import bean.AdvertisingVersionBean;
import bean.ImageInfoBean;
import manage.MysqlCommit;
import manage.Upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Start {
    public static void main(String[] args ) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("c://photo.jpg");
        ImageInfoBean imageInfoBean = new ImageInfoBean("image/aaa",ImageInfoBean.ImageTypeEnum.JPG,ImageInfoBean.DisplayTypeEnum.SETTING_BACKGROUND
                ,"180311","180312",30);
        AdvertisingVersionBean advertisingVersionBean = new AdvertisingVersionBean("1.2");
        Upload.uploadImage(fileInputStream,imageInfoBean,advertisingVersionBean);
    }
}
