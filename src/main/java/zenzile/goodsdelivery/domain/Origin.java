/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zenzile.goodsdelivery.domain;

import java.io.Serializable;

/**
 *
 * @author SIHLE
 */
public class Origin implements Serializable, Address{
    
    private String sender;
    private String street;
    private String suburb;
    private String code;
    private String town;
    
    private Origin() {
    }

    public Origin(Builder builder) {
        street=builder.street;
        sender =builder.sender;
        suburb = builder.suburb;
        code = builder.code;
        town = builder.town;
    }
    public static class Builder{
        String sender;
        String street;
        String suburb;
        String code;
        String town;
        
        public Builder(String sender) {
            this.sender = sender;
        }
        
        public Builder street(String value) {
            this.suburb = value;
            return this;
        }
        
        public Builder code(String value) {
            this.code = value;
            return this;
        }
        public Builder town(String value) {
            this.town = value;
            return this;
        }
        public Builder suburb(String value) {
            this.street = value;
            return this;
        }
        public Builder copy(Origin value){
            this.street=value.street;
            this.sender=value.sender;
            this.suburb=value.suburb;
            this.code=value.code;
            this.town = value.town;
            return this;
        }

        public Origin build(){
            return new Origin(this);
        }
    }
    

    public String getRecipient() {
        return sender;
    }
    
    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public String getSuburb() {
        return suburb;
    }

    @Override
    public String getTown() {
        return town;
    }

    @Override
    public String getCode() {
        return code;
    }
    
}
