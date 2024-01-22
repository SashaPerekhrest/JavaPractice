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
import softbyhumans.test_spring.dto.DeveloperDTO;
import softbyhumans.test_spring.entity.GameDeveloper;
import softbyhumans.test_spring.repository.GameDeveloperRepository;

import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/gameDevelopers/")
@RequiredArgsConstructor
public class GameDeveloperController {
    private final GameDeveloperRepository gameDeveloperRepository;

    @GetMapping
    public String index(Model model) {
        //model.addAttribute("developerDTO", new DeveloperDTO());
        model.addAttribute("list", gameDeveloperRepository.findAll());
        return "gameDevelopers";
    }

    @PostMapping("add")
    public String add(@Valid DeveloperDTO request, BindingResult result, Model model) {
        System.out.println("sassasasasas");
        log.info("add gameDeveloper request {}, binding result = {}", request, result.hasErrors());
        if (!result.hasErrors()) {
            gameDeveloperRepository.save(request.toEntity());
            return "redirect:/gameDevelopers/";
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
        Optional<GameDeveloper> developer = gameDeveloperRepository.findById(id);
        developer.ifPresent(value -> {
            model.addAttribute("developerDTO", value);
        });

        return "edit-gameDeveloper";
    }

    @PostMapping("edit/gameDevelopers/edit")
    public String edit(@Valid DeveloperDTO request, HttpServletRequest servletRequest, BindingResult result) {
        log.info("edit artist request {}, binding result = {}", request, result.hasErrors());
        if (!result.hasErrors()) {
            var artist = request.toEntity();
            gameDeveloperRepository.save(artist);
            return "redirect:/gameDevelopers/";
        } else {
            log.info("has errors: {}", result.getFieldErrors()
                    .stream()
                    .map(FieldError::getField)
                    .collect(Collectors.toList()));
        }
        return "edit-gameDeveloper";
    }

    @PostMapping("remove")
    public String remove(@Positive Long id) {
        gameDeveloperRepository.deleteById(id);
        return "redirect:/gameDevelopers/";
    }
}
