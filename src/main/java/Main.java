import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PetModel2 pet= new PetModel2();

        List<String> urls = new ArrayList<String>();
        urls.add("aaa");
        urls.add("bbb");
        pet.setName("kkkkk");
        pet.setPhotoUrls(urls);
        System.out.println(pet.getName());
        System.out.println(pet.getStatus());
        System.out.println(pet.getTags().toString());
    }
}
