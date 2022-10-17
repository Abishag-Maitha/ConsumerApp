package ke.co.safaricom.ConsumerApp.api;

import ke.co.safaricom.ConsumerApp.dto.CreateAccountRequest;
import ke.co.safaricom.ConsumerApp.dto.CreateUserRequest;
import ke.co.safaricom.ConsumerApp.dto.UserUpdateRequest;
import ke.co.safaricom.ConsumerApp.entities.Account;
import ke.co.safaricom.ConsumerApp.entities.User;
import ke.co.safaricom.ConsumerApp.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
   public User createUser(@RequestBody CreateUserRequest user){
        return this.userService.create(user);
    }
    @PutMapping ("/{id}")
    public ResponseEntity<User> updateUser(Long id, UserUpdateRequest user){
        var updatedUser=userService.updateUser(id, user);
        return ResponseEntity.of(updatedUser);
    }
}
