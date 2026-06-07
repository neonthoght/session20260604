package my.sandbox.session20260604.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpSession;
import my.sandbox.session20260604.entity.User;
import my.sandbox.session20260604.services.UserApiService;



@RestController
@RequestMapping("/auth")
public class UserApiController {
    UserApiService userApiService = new UserApiService();
    
    public UserApiController() {}
    public UserApiController(UserApiService userApiService) {
        this.userApiService = userApiService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login (@RequestBody User user, HttpSession session) {

        userApiService.login(user.username, session);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/getsessionattr")
    public ResponseEntity<String> getSessionAttr(HttpSession session) {
        System.out.println("sid: " + session.getId());
        
        return ResponseEntity.ok().body(session.getAttribute("username").toString());
    }
    
}
