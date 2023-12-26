package softbyhumans.test_spring.controller;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import softbyhumans.test_spring.entity.Game;
import softbyhumans.test_spring.dto.GameDTO;
import softbyhumans.test_spring.repository.GameRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/games/")
@RequiredArgsConstructor
public class GameController {
    private final GameRepository gameRepository;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("list", gameRepository.findAll());
        return "games";
    }

    @PostMapping("add")
    public String add(@Valid GameDTO request, BindingResult result, Model model) {
        System.out.println("sassasasasas");
        log.info("add artist request {}, binding result = {}", request, result.hasErrors());
        if (!result.hasErrors()) {
            gameRepository.save(request.toEntity());
            return "redirect:/games/";
        } else {
            log.info("has errors: {}", result.getFieldErrors()
                    .stream()
                    .map(FieldError::getField)
                    .collect(Collectors.toList()));
        }
        return index(model);
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Optional<Game> game = gameRepository.findById(id);
        game.ifPresent(value -> {
            model.addAttribute("gameDTO", value);
        });

        return "edit-game";
    }

    @PostMapping("edit")
    public String edit(@Valid GameDTO request, HttpServletRequest servletRequest, BindingResult result) {
        log.info("edit artist request {}, binding result = {}", request, result.hasErrors());
        if (!result.hasErrors()) {
            var artist = request.toEntity();
            gameRepository.save(artist);
            return "redirect:/games/";
        } else {
            log.info("has errors: {}", result.getFieldErrors()
                    .stream()
                    .map(FieldError::getField)
                    .collect(Collectors.toList()));
        }
        return "edit-game";
    }

    @PostMapping("remove")
    public String remove(@Positive Long id) {
        gameRepository.deleteById(id);
        return "redirect:/games/";
    }
}
