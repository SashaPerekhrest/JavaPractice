package softbyhumans.test_spring.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "game")
public class Game {
    // первичный ключ
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // остальные поля
    private String name;
    private String genre;
    private String steamLink;
    private String imgUrl;
}
