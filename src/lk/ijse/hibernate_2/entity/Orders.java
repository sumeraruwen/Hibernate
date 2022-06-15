package lk.ijse.hibernate_2.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "orders")
public class Orders {
    @Id
    private String orderId;
    @CreationTimestamp
    private Date date;
    private double price;
@ManyToOne
    private Customer id;
    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetailList = new ArrayList<>();


    public Orders() {
    }

    public Orders(String orderId, Date date, double price, Customer id, List<OrderDetail> orderDetailList) {
        this.orderId = orderId;
        this.date = date;
        this.price = price;
        this.id = id;
        this.orderDetailList = orderDetailList;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getId() {
        return id;
    }

    public void setId(Customer id) {
        this.id = id;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId='" + orderId + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", id=" + id +
                ", orderDetailList=" + orderDetailList +
                '}';
    }
}
