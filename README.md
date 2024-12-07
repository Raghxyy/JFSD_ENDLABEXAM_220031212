# Hibernate Inheritance Mapping: Table per Concrete Class with Unions

This Maven project demonstrates inheritance mapping in Hibernate using the **Table per Concrete Class with Unions** strategy. It implements a hierarchy where `Vehicle` is the base class, and `Car` and `Truck` are subclasses with unique properties.

---

## Project Structure

**Package:**  
`com.klef.jfsd.exam`

### Entities
1. **Vehicle**: Base class with properties:
   - `id`: Unique identifier (auto-generated).
   - `name`: Name of the vehicle.
   - `type`: Type of the vehicle.
   - `maxSpeed`: Maximum speed of the vehicle.
   - `color`: Color of the vehicle.

2. **Car**: Subclass of `Vehicle` with an additional property:
   - `numDoors`: Number of doors.

3. **Truck**: Subclass of `Vehicle` with an additional property:
   - `loadCapacity`: Load capacity.

### Operations
- Insert records for `Vehicle`, `Car`, and `Truck` using persistent objects.
- Demonstrate inheritance mapping using the Table per Concrete Class with Unions strategy.

---

## Prerequisites

1. **JDK**: 8 or higher
2. **Apache Maven**: 3.6 or higher
3. **MySQL Database**: Installed and configured
   - Database name: `labexam`
   - Table creation will be handled by Hibernate.
4. **Hibernate Dependencies**: Included in the `pom.xml`.

---

## Technologies Used

- **Java**
- **Hibernate ORM**
- **MySQL**
- **Maven**

---

## Installation and Execution

1. **Clone or Download** the repository.

2. **Database Setup**:
   - Create a database in MySQL:
     ```sql
     CREATE DATABASE labexam;
     ```

3. **Configure `hibernate.cfg.xml`**:
   - Update the file with your MySQL connection details:
     ```xml
     <hibernate-configuration>
         <session-factory>
             <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/labexam</property>
             <property name="hibernate.connection.username">your_username</property>
             <property name="hibernate.connection.password">your_password</property>
             <property name="hibernate.dialect">org.hibernate.dialect.MySQL8Dialect</property>
             <property name="hibernate.hbm2ddl.auto">update</property>
         </session-factory>
     </hibernate-configuration>
     ```

4. **Build the Project**:
   ```bash
   mvn clean install
