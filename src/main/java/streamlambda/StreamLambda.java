package streamlambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author
 */
public class StreamLambda {

    private static Iterable<Album> albums;

    public static void main(String[] args) {
        List<Album> favs = new ArrayList<>();
        
        for (Album a : albums) {
            boolean hasFavorite = false;
            for (Track t : a.tracks) {
                if (t.rating >= 4) {
                    hasFavorite = true;
                    break;
                }
            }
            if (hasFavorite) {
                favs.add(a);
            }
        }
        
        Collections.sort(favs, (Album a1, Album a2) -> a1.name.compareTo(a2.name));
    }
}
