package softbyhumans.test_spring.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Entity(name = "gameDeveloper")
public class GameDeveloper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String website;
    private String logoUrl;

    @OneToMany()
    @JoinColumn(name = "game_id")
    @ToString.Exclude // аннотация исключает данное поле при формировании строкового представления
    private List<Game> games;
}