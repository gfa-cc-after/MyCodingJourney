package JPA_advanced_onetomany;

import JPA_advanced_onetomany.models.Cart;
import JPA_advanced_onetomany.models.User;
import JPA_advanced_onetomany.repositories.CartRepository;
import JPA_advanced_onetomany.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication // 1  alt + enter creates @Override public void run below
public class  JpaAdvancedOnetomanyApplication implements CommandLineRunner {

	// 2 userRepo cartRepo alt+enter we create construcot below this.user...
	private final UserRepository userRepository;
	private final CartRepository cartRepository;
	// (2)
    public JpaAdvancedOnetomanyApplication(UserRepository userRepository, CartRepository cartRepository) {
        this.userRepository = userRepository;
        this.cartRepository = cartRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(JpaAdvancedOnetomanyApplication.class, args);
	}

	@Override // (1)
	public void run(String... args) throws Exception {
		// 3 now we should be able to create user by importing
		User newUser = new User();
		newUser.setName("Joseph");

		// one to one relationship from CART SIDE
		Cart newCartForJoseph = new Cart();

		newCartForJoseph.setAmount(5);
		newCartForJoseph.setPrice(50);



		Cart evenNewCartForJoseph = new Cart();
		evenNewCartForJoseph.setAmount(6);
		evenNewCartForJoseph.setPrice(60);

		Cart savedCart1 = cartRepository.save(newCartForJoseph);
		Cart savedCart2 = cartRepository.save(evenNewCartForJoseph);
		Set<Cart> cartsOfJoseph = new HashSet<>();
		cartsOfJoseph.add(savedCart1);
		cartsOfJoseph.add(savedCart2);
		newUser.setCarts(cartsOfJoseph);
		userRepository.save(newUser);






	}
              /// one to many into function to
			// save space make it more logical


	public void applyOneToOneRelationship() {
		// one to one relationship

		// 3 now we should be able to create user by importing
		//		User newUser = new User();
		//		newUser.setName("Joseph");
		//
		//		// one to one relationship from CART SIDE
		//		Cart newCartForJoseph = new Cart();
		//		newCartForJoseph.setAmount(5);
		//		newCartForJoseph.setPrice(50);
		//		cartRepository.save(newCartForJoseph);
		//		newUser.setCart(newCartForJoseph);
		//		userRepository.save(newUser);
		//
		//
		//		// one to one relationship from USER BUYER side
		//		newCartForJoseph.setBuyer(newUser);
		//		userRepository.save(newUser);
	}

}
