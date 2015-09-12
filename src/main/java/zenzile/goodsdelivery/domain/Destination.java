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
public class Destination implements Serializable, Address{
    
    private String recipient;
    private String street;
    private String suburb;
    private String code;
    private String town;
    
    private Destination() {
    }

    public Destination(Builder builder) {
        street=builder.street;
        recipient =builder.recipient;
        suburb = builder.suburb;
        code = builder.code;
        town = builder.town;
    }
    public static class Builder{
        String recipient;
        String street;
        String suburb;
        String code;
        String town;
        
        public Builder(String recipient) {
            this.recipient = recipient;
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
        public Builder copy(Destination value){
            this.street=value.street;
            this.recipient=value.recipient;
            this.suburb=value.suburb;
            this.code=value.code;
            this.town = value.town;
            return this;
        }

        public Destination build(){
            return new Destination(this);
        }
    }
    

    public String getRecipient() {
        return recipient;
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
