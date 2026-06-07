package my.sandbox.session20260604.services;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;


@Service
public class UserApiService {




    public void login(String username, HttpSession session) {
        session.setAttribute("username", username);
        
        System.out.println("sid: " + session.getId() + session.getAttributeNames().nextElement());
    }
}
