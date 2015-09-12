/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zenzile.goodsdelivery.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author SIHLE
 */
@Embeddable
public class Contact implements Serializable{
    
    private String email;
    private String cellnumber;

    private Contact() {
    }

    public Contact(Builder builder) {
        email=builder.email;
        cellnumber =builder.cellnumber;
    }

    public String getEmail() {
        return email;
    }

    public String getcellnumer() {
        return cellnumber;
    }

    public static class Builder{
        private String email;
        private String cellnumber;

        public Builder(String email) {
            this.email = email;
        }

        public Builder cellnumber(String value){
            this.cellnumber=value;
            return this;
        }

        public Builder copy(Contact value){
            this.cellnumber=value.cellnumber;
            this.email=value.email;
            return this;
        }

        public Contact build(){
            return new Contact(this);
        }
    } 
}
