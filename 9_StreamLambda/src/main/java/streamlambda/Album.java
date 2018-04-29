package streamlambda;

import java.util.Iterator;

/**
 *
 * @author 
 */
class Album implements Iterable<Album> {

    Name name;
    Track tracks;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public Iterator<Album> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
