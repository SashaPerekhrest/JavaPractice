package softbyhumans.test_spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import softbyhumans.test_spring.entity.Game;
public interface GameRepository extends JpaRepository<Game, Long> {

}
