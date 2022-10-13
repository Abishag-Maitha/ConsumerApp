package ke.co.safaricom.ConsumerApp.services;

import ke.co.safaricom.ConsumerApp.dto.CreateProductRequest;
import ke.co.safaricom.ConsumerApp.dto.CreateUserRequest;
import ke.co.safaricom.ConsumerApp.entities.Product;
import ke.co.safaricom.ConsumerApp.entities.User;
import ke.co.safaricom.ConsumerApp.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<User> getUserById(Long userId){
        return userRepository.findById(userId);
    }
    public List<User> findAllById(){
        return  userRepository.findAll();
    }
    public User findAllByName(String userName){
        return userRepository.findByName(userName);
    }
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}
