package JPA_advanced_onetomany.models;

import jakarta.persistence.*;

import java.util.Set;


@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    // @OneToOne  // THIS RENAMES USER_ID to new name
    //    @JoinColumn(name = "Purchase_chart_reference_id")
    //    private Cart cart;


  //list can be used as well here
   @OneToMany
   private Set<Cart> carts;

    public Set<Cart> getCarts() {
        return carts;
    }

    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }

    public User() {
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
