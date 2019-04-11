import java.util.List;
import lombok.Data;

@Data
@SuppressWarnings("unused")
public class PetModel2 {
    public PetModel2(Category category, List<Tag> tags) {
        this.category = category;
        this.tags = tags;
    }

    private Category category;
    private long id;
    private String name;
    private List<String> photoUrls;
    private String status;
    private List<Tag> tags;

}
