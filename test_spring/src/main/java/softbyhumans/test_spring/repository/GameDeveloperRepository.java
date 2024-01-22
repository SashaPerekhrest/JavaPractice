package softbyhumans.test_spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import softbyhumans.test_spring.entity.GameDeveloper;
public interface GameDeveloperRepository extends JpaRepository<GameDeveloper, Long> {
}
