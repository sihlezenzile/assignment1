/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zenzile.goodsdelivery.domain;

import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sihle
 */
@Entity
public class Driver implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String empno;
    private String firstName;
    private String lastName;
    @Embedded
    private Contact contact;
    
    private Driver(){
        
    }

    public Contact getContact(){
        return contact;
    }
    public Long getId() {
        return id;
    }

    public String getEmpno() {
        return empno;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public Driver(Builder builder){
        id = builder.id;
        empno = builder.empno;
        firstName=builder.firstName;
        lastName=builder.lastName;
        contact=builder.contact;
        
    }
    
    public static class Builder{
        Long id;
        String empno;
        String firstName;
        String lastName;
        Contact contact;
    
        public Builder(String lastName) {
            this.lastName = lastName;
        }

        public Builder copy(Driver value){
            this.id=value.id;
            this.firstName=value.firstName;
            this.lastName=value.lastName;
            this.empno = value.empno;
            this.contact = value.contact;
            return this;
        }
        public Builder empno(String value){
            this.empno = value;
            return this;
        }
        public Builder firstName(String value){
            this.firstName=value;
            return this;
        }
        
        public Builder contact(Contact value){
            this.contact = value;
            return this;
        }
        public Builder id(Long value){
            this.id=value;
            return this;
        }
        
        public Driver build(){
            return new Driver(this);
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        return id.equals(driver.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "lastName='" + lastName + '\'' +
                ", empno='" + empno + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
    
}
