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
public class Destination extends Address implements Serializable{

    @Override
    public String getStreet() {
        return "";
    }

    @Override
    public String gettSuburb() {
        return "";
    }

    @Override
    public String getTown() {
        return "";
    }

    @Override
    public String getCode() {
        return "";
    }

}
