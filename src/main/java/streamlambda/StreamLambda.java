package streamlambda;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Aufgabe 9 Streams und Lambda
 * @author  Stefan Nyffenegger
 * @author  Marco Wyssmann
 * @author  Benjamin Steffen
 * @version 1.0
 */
public class StreamLambda {

    public List<Album> copyFavsAndSort(List<Album> albums) {
        //Filter Predicate
        final Predicate<Album> hasFavorite = album -> album.tracks.rating >= 4;
        //Sort Comparator
        Comparator<Album> comp = (Album a1, Album a2) -> a1.name.compareTo(a2.name);
        //Filtern, Sortieren, als Liste speichern
        List<Album> favs = albums.stream().filter(hasFavorite).sorted(comp).collect(Collectors.toList());
        return favs;
    }
}
