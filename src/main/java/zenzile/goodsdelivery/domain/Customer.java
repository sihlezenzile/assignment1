/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zenzile.goodsdelivery.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author SIHLE
 */
@Entity
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String firstName;
    private String lastName;
    @Embedded
    private Contact contact;

    private Customer(){

    }

    public Customer (Builder builder){
        this.id=builder.id;
        this.code=builder.code;
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        contact=builder.contact;
    }

    public Contact getContact(){
        return contact;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static class Builder{
        private Long id;
        private String code;
        private String firstName;
        private String lastName;
        Contact contact;

        public Builder(String code){
            this.code=code;
        }

        public Builder id(Long value){
            this.id=value;
            return this;
        }

        public Builder firstName(String value){
            this.firstName=value;
            return this;
        }

        public Builder lastName(String value){
            this.lastName=value;
            return this;
        }

        public Builder copy(Customer value){
            this.code = value.getCode();
            this.id = value.getId();
            this.firstName = value.getFirstName();
            this.lastName = value.getLastName();
            this.contact = value.contact;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Builder builder = (Builder) o;

            if (id != null ? !id.equals(builder.id) : builder.id != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            return id != null ? id.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "code='" + code + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
}