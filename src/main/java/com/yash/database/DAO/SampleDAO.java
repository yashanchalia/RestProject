package com.yash.database.DAO;

import com.yash.database.models.MaxCounts;
import com.yash.database.models.QuesAnswr;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;

import javax.persistence.criteria.JoinType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yash on 9/6/2015.
 */
public class SampleDAO {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        List<QuesAnswr> quesAnswrList = new ArrayList<>();
        Session session =sessionFactory.openSession();

        DetachedCriteria subCriteria = DetachedCriteria.forClass
                (QuesAnswr.class, "innersb");
        subCriteria.add(Restrictions.eqProperty("innersb.question","q1.question"));
        subCriteria.add(Restrictions.eq("innersb.sessionIdTxt","126"));
        subCriteria.setProjection(Projections.projectionList().
                        add(Projections.max("innersb.retryCount")));

        Criteria criteria = session.createCriteria(QuesAnswr.class,"q1");
        String[] strings = {"q1.retryCount"};
        criteria.add(Restrictions.eq("q1.sessionIdTxt","126"));
        criteria.add(Subqueries.propertiesEq(strings, subCriteria));

        quesAnswrList = (List<QuesAnswr>)criteria.list();

       /* DetachedCriteria subCriteria = DetachedCriteria.forClass
                (QuesAnswr.class);
        subCriteria.setProjection(Projections.projectionList().
                add(Projections.max("retryCount"))
                .add(Projections.groupProperty("question")));

        Criteria criteria = session.createCriteria(QuesAnswr.class);
        String[] strings = {"retryCount","question"};
        criteria.add(Subqueries.propertiesEq(strings,subCriteria));

        quesAnswrList = (List<QuesAnswr>)criteria.list();
*/
        session.close();
        System.out.println();
        System.out.println();
        for(QuesAnswr quesAnswr : quesAnswrList){
            System.out.println(quesAnswr.getSessionId() +"||"+quesAnswr.getAllFields()+"||"+quesAnswr.getQuestion()+"||"
                    +quesAnswr.getAnswer()+"||"+quesAnswr.getRetryCount()+"||");
        }

    }
}
