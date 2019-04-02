package me.gilo.wc.models;

import com.google.gson.annotations.SerializedName;
import me.gilo.woodroid.models.Metum;

import java.util.ArrayList;
import java.util.List;


public class CartLineItem extends Model{

    String id;
    public float price;
    public int quantity;
    public int productId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
