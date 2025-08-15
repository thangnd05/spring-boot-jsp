package springbootjsp.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloControllor {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Xin chào Spring Boot + JSP!");
        return "hello"; // tên file JSP (hello.jsp)
    }


}
