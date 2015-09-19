
package com.yash.database.DAO;

import com.yash.database.models.Address;
import com.yash.database.models.UserDetails;
import com.yash.database.models.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by Yash on 9/6/2015.
 */
public class DatabaseDao {

    public static void main(String[] args) {
        DatabaseDao databaseDao = new DatabaseDao();
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        databaseDao.createInsertTable(sessionFactory);

        databaseDao.getTableData(sessionFactory);
/*

        /**
         * PRIMARY KEY :: UNIQUE KEY WITH BUSINESS SINGNIFICANCE
         * SURROGATE KEY :: UNIQUE KEY WITH NO BUSINESS SINGNIFICANCE
         *
         * for UserId is primary key we can use generator for id
         */

        //databaseDao.createInsertTableWithAutoGenId(sessionFactory);

       // databaseDao.createGetVehicle(sessionFactory);
    }

    private void createGetVehicle(SessionFactory sessionFactory1) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        UserDetails userDetails = new UserDetails();
        userDetails.setUname("Yash");

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("v1");
        //vehicle.setUser(userDetails);

        Vehicle vehicle1 = new Vehicle();
        vehicle.setVehicleName("v2");
        //vehicle1.setUser(userDetails);

       /* userDetails.getVehicles().add(vehicle);
        userDetails.getVehicles().add(vehicle1);*/

        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(userDetails);
        session.save(vehicle);
        session.save(vehicle1);
        session.getTransaction().commit();
        session.close();
    }

    private void createInsertTableWithAutoGenId(SessionFactory sessionFactory) {
        UserDetails userDetails = new UserDetails();
        //userDetails.setUserId(1);
        userDetails.setUname("yash");

        /**
         * TO CREATE AND INSERT TO DB
         */

        createInsertTable(sessionFactory);
    }

    private void getTableData(SessionFactory sessionFactory) {
        UserDetails userDetails = new UserDetails();
        Session session;

        /**
         * TO RETRIVE DATA
         */

        session=sessionFactory.openSession();
        session.beginTransaction();
        userDetails=(UserDetails)session.get(UserDetails.class,1);
       /* System.out.println(userDetails.getAddresses().size());
        session.close();
        System.out.println(userDetails.getAddresses().size());
*/
        //System.out.println("USER DETAILS :: "+userDetails.getUname()+" || "+userDetails.getUserId());

    }

    private void createInsertTable(SessionFactory sessionFactory) {
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(1);
        userDetails.setUname("yash");

        Address address = new Address();
        address.setCity("pune");
        address.setCountry("India");

        Address address1 = new Address();
        address1.setCity("pune1");
        address1.setCountry("India1");

        /*userDetails.getAddresses().add(address);
        userDetails.getAddresses().add(address1);*/

        //userDetails.setAddress(address);

        /**
         * TO CREATE AND INSERT TO DB
         */
        sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(userDetails);
        session.getTransaction().commit();
        session.close();
    }


}
