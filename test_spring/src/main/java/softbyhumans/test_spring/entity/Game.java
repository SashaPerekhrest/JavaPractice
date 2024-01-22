package softbyhumans.test_spring.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "game")
public class Game {
    // первичный ключ
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // остальные поля
    private String name;
    private String genre;
    private String steamLink;
    private String imgUrl;

    @ManyToOne
    @JoinColumn(name = "gameDeveloper_id")
    private GameDeveloper gameDeveloper;

}
