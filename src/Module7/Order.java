package Module7;

import java.util.*;
import java.util.Currency;

/**
 * Created by aleks_000 on 16.01.2017.
 */
public class Order {
    long id;
    int price;
    Currency currency;
    String itemName;
    String shopIdentificator;
    User user;

    public Order (long id, int price, java.util.Currency currency, String itemName, String shopIdentificator, User user){
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    public Order(int id, int price, Module7.Currency currency, String item1, String indificator1, User user1) {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
