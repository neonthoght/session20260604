package my.sandbox.session20260604.controller;
import my.sandbox.session20260604.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/backapi")
public class BackApiController {
    
    @PostMapping("/sum")
    public ResponseEntity<Integer> sum(@RequestBody User user) {


        return ResponseEntity.ok().body(user.a + user.b);
    }
}
