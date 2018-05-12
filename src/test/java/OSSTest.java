import bean.ImageInfoBean;
import manage.OSSUpload;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OSSTest {
    @Test
    /*
     * 测试oss文件上传
     * 本地测试文件路径"c:/photo.jpg"
     */
    public void OSSUploadImageTest(){
        /*
        该测试代码在main中好用，在test中无效？？？？
         */
        String photoname="photo.jpg";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("c://" + photoname);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ImageInfoBean imageInfoBean = new ImageInfoBean("image/aaa",ImageInfoBean.ImageTypeEnum.JPG,ImageInfoBean.DisplayTypeEnum.SETTING_BACKGROUND
                ,"180311","180312",30);
        OSSUpload.ossUploadImage(fileInputStream,imageInfoBean);
    }
}
