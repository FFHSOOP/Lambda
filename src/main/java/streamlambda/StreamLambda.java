package streamlambda;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author
 */
public class StreamLambda {

    public List<Album> copyFavsAndSort(List<Album> albums) {
        //Filter Predicate
        final Predicate<Album> hasFavorite = album -> album.tracks.rating >= 4;
        //Sort Comparator
        Comparator<Album> comp = new Comparator<Album>() {
            public int compare(Album a1, Album a2) {
                return a1.name.compareTo(a2.name);
            }
        };
        //Filtern, Sortieren, als Liste speichern
        List<Album> favs = albums.stream().filter(hasFavorite).sorted(comp).collect(Collectors.toList());
        return favs;
    }
}
