/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Kien Ninh
 */

   ;


import controllers.FileController;
import java.util.ArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class OrderDetail {
   
    private Integer orderID;
    private Integer productID;
    
    private Integer quantity;

    public OrderDetail(Integer orderID, Integer productID, Integer quantity) {
        this.orderID = orderID;
        this.productID = productID;
        this.quantity = quantity;
    }
    

    public OrderDetail() {
       
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    
    public  Float money(){
        List<product> products =new ArrayList<>();
        products=FileController.readProductFromFile("product.txt");
        float tong=0;
        for(product item :products){
            System.out.println("\nProduct"+item);
        }
        for(product item:products){
           
            if(item.getmaSP().equals(getProductID())){
                System.out.println("bang nhau" + getOrderID()+" o"+item.getmaSP());
                tong=getQuantity()*item.getGiaBan()-(getQuantity()*item.getGiaBan())*item.getGiamGia()/100f;
            }}
        return tong;
    }

       @Override
    public String toString() {
        return "OrderDetail{" + "orderID=" + orderID + ", productID=" + productID + ", quantity=" + quantity + ", money=" + money() + '}';
    }

    
}
