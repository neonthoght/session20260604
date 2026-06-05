package my.sandbox.session20260604.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import my.sandbox.session20260604.entity.User;


@RestController
@RequestMapping("/userapi/v1")
public class UserApiController {

    @PostMapping("/login")
    public ResponseEntity<String> login (@RequestBody User user) {

        return ResponseEntity.ok().build();
    }
    
}
