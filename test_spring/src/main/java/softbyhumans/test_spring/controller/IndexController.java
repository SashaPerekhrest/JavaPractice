package softbyhumans.test_spring.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import softbyhumans.test_spring.entity.User;
import softbyhumans.test_spring.repository.UserRepository;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    @GetMapping()
    public String index(Model model) {
        model.addAttribute("links", Map.of(
                "Исполнители", "artists/",
                "Альбомы", "albums/",
                "Жанры", "genres/"
        ));
        return "index";
    }
}