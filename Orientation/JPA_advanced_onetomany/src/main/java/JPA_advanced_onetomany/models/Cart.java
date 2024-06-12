package JPA_advanced_onetomany.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Cart {
    @Id
    @GeneratedValue
    private Long id;
    private Integer amount;
    private Integer price;


    @ManyToOne
    private User buyer;

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Cart() {
    }


    public Cart(Long id, Integer amount, Integer price) {
        this.id = id;
        this.amount = amount;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
