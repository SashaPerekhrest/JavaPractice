package softbyhumans.test_spring.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import softbyhumans.test_spring.entity.Game;
import softbyhumans.test_spring.entity.GameDeveloper;
import softbyhumans.test_spring.repository.GameDeveloperRepository;

import java.time.Instant;
import java.time.LocalDate;

@Data
public class GameDTO {
    private long id;
    @NotBlank
    private String name;
    @NotBlank
    private String genre;
    private String imgUrl;
    @NotBlank
    private String steamLink;
    private Long developerId;
    private GameDeveloper developer;

    public Game toEntity(){
        var game = new Game();
        game.setId(id);
        game.setName(name);
        game.setGenre(genre);
        game.setImgUrl(imgUrl);
        game.setSteamLink(steamLink);
        game.setGameDeveloper(developer);
        return game;
    }
}
