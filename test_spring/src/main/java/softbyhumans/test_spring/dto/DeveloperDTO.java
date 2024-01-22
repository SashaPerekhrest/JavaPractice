package softbyhumans.test_spring.dto;
import jakarta.validation.constraints.NotBlank;
import softbyhumans.test_spring.entity.GameDeveloper;
import lombok.Data;

@Data
public class DeveloperDTO {
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String website;
    @NotBlank
    private String logoUrl;

    public GameDeveloper toEntity(){
        var gameDeveloper = new GameDeveloper();
        gameDeveloper.setId(id);
        gameDeveloper.setName(name);
        gameDeveloper.setWebsite(website);
        gameDeveloper.setLogoUrl(logoUrl);
        return gameDeveloper;
    }
}
