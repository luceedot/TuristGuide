

package repository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;


@Repository


public class TouristRepository {
    public static void main(String[] args) {

        ArrayList<String> attractions = new ArrayList<String>();
        attractions.add("Tivoli");
        attractions.add("Zoo");
        attractions.add("Den Lille Havfrue");
        attractions.add("Rosenborg");
        attractions.add("Nyhavn");


    }

}


// denne klasse skal desuden indeholde CRUD metoder, der arbejder på ovenstående ArrayList