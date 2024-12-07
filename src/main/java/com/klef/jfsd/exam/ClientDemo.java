package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Vehicle.class)
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(Truck.class)
                .buildSessionFactory();

        Session session = factory.openSession(); // Use openSession()

        try {
            // Start a transaction
            session.beginTransaction();

            // Create instances
            Car car = new Car();
            car.setName("Sedan");
            car.setType("Car");
            car.setMaxSpeed(200);
            car.setColor("Blue");
            car.setNumberOfDoors(4);

            Truck truck = new Truck();
            truck.setName("Cargo Truck");
            truck.setType("Truck");
            truck.setMaxSpeed(100);
            truck.setColor("Red");
            truck.setPayloadCapacity(5000);

            // Save the objects
            session.persist(car);
            session.persist(truck);

            // Commit the transaction
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close(); // Always close session
            factory.close(); // Close factory
        }
    }
}
