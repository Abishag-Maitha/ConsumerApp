package ke.co.safaricom.ConsumerApp.services;

import ke.co.safaricom.ConsumerApp.dto.CreateProductRequest;
import ke.co.safaricom.ConsumerApp.dto.CreateUserRequest;
import ke.co.safaricom.ConsumerApp.entities.Product;
import ke.co.safaricom.ConsumerApp.entities.User;
import ke.co.safaricom.ConsumerApp.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
   public User create(CreateUserRequest createUserRequest){
        User user= new User();
        user.setUsername(createUserRequest.getUsername());
        user.setPassword(createUserRequest.getPassword());
        userRepository.save(user);
        return user;
    }
}
