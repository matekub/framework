import java.util.List;
import java.util.Map;

public class PetModel {

    private int id;
    private Map<String, Object> category;
    private String name;
    private List<String> photoUrls;
    private List<Map<String, Object>> tags;
    private String status;

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(Map<String, Object> category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public void setTags(List<Map<String, Object>> tags) {
        this.tags = tags;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
