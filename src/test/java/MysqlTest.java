import bean.AdvertisingVersionBean;
import bean.ImageInfoBean;
import manage.MysqlCommit;
import op.AdvertisingEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.sql.*;

public class MysqlTest {

    @Test
    public void insertAdvertising(){

        ImageInfoBean imageInfoBean = new ImageInfoBean("image/aaa",ImageInfoBean.ImageTypeEnum.JPG,ImageInfoBean.DisplayTypeEnum.SETTING_BACKGROUND
                ,"180311","180312",30);
        AdvertisingVersionBean advertisingVersionBean = new AdvertisingVersionBean("1.2");
        MysqlCommit mysqlCommit = new MysqlCommit();
        mysqlCommit.advertisingCommit(imageInfoBean,advertisingVersionBean);
    }


    @Test
    public void test(){
        System.out.println("test....");
        ImageInfoBean imageInfoBean = new ImageInfoBean("image/aaa",ImageInfoBean.ImageTypeEnum.JPG,ImageInfoBean.DisplayTypeEnum.SETTING_BACKGROUND
                ,"180311","180312",30);

        //1. 创建配置对象
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        //4. 会话对象
        Session session = sessionFactory.openSession();
        //5. 开启事务
        Transaction transaction = session.beginTransaction();

        String ossFileName=imageInfoBean.getImageLoadePath()+"."+imageInfoBean.getImageType().getTypeName();
        AdvertisingEntity advertisingEntity = new AdvertisingEntity(
                imageInfoBean.getDisplayType().getServerNumber(),
                ossFileName,
                imageInfoBean.getImageType().getServerNumber(),
                imageInfoBean.getBeginTime(),
                imageInfoBean.getEndTime(),
                imageInfoBean.getDisplayTime());
        session.save(advertisingEntity);



        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
