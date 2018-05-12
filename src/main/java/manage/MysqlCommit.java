package manage;

import bean.AdvertisingVersionBean;
import bean.ImageInfoBean;
import op.AdvertisingEntity;
import op.AdvertisingVersionEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MysqlCommit {
    public void advertisingCommit(ImageInfoBean imageInfoBean, AdvertisingVersionBean advertisingVersionBean){
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
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

        AdvertisingVersionEntity advertisingVersionEntity = new AdvertisingVersionEntity(advertisingVersionBean.getVersion(), advertisingVersionBean.getCreateTime());
        session.save(advertisingVersionEntity);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
