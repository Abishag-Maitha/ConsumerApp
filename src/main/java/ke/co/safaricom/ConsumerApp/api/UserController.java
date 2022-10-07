package ke.co.safaricom.ConsumerApp.api;

import ke.co.safaricom.ConsumerApp.dto.CreateAccountRequest;
import ke.co.safaricom.ConsumerApp.dto.CreateUserRequest;
import ke.co.safaricom.ConsumerApp.entities.Account;
import ke.co.safaricom.ConsumerApp.entities.User;
import ke.co.safaricom.ConsumerApp.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
