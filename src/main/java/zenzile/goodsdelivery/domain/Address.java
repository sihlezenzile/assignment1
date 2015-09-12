/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zenzile.goodsdelivery.domain;

/**
 *
 * @author SIHLE
 */
public interface Address {
    public String getStreet();
    public String getSuburb();
    public String getTown();
    public String getCode();
}
