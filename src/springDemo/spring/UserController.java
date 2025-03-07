package src.springDemo.spring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // handler
    @PostMapping
    public ResponseEntity<UUID> registerUser(@RequestBody UserCreateDto userCreateDto) {
        return ResponseEntity.ok(userService.registerUser(userCreateDto.name()));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable String userId) {
        UUID id = UUID.fromString(userId);
        return ResponseEntity.ok(userService.getUser(id));
    }
}
