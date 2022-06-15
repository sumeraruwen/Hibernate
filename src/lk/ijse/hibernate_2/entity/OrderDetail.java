package lk.ijse.hibernate_2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetail {

    @Id
    private String orderDetailsId;
    private int orderQty;
    @ManyToOne
    private Item item;
    @ManyToOne
    private Orders order;

    public OrderDetail() {
    }

    public OrderDetail(String orderDetailsId, int orderQty, Item item, Orders order) {
        this.orderDetailsId = orderDetailsId;
        this.orderQty = orderQty;
        this.item = item;
        this.order = order;
    }

    public String getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(String orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderDetailsId='" + orderDetailsId + '\'' +
                ", orderQty=" + orderQty +
                ", item=" + item +
                ", order=" + order +
                '}';
    }
}
