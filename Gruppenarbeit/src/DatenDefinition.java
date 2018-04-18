import java.util.ArrayList;
import java.util.List;

public final class DatenDefinition {
	
	// Hilfsklasse um ein Datenset fuer Tests zur Verfuegung zu stellen...
	
	public static final List<SpielfeldZeile> spielfeldzeilen = new ArrayList<>();
	
	static{
	spielfeldzeilen.add(new SpielfeldZeile("x","o","o","o","o","o","o","o","o","o"));
	spielfeldzeilen.add(new SpielfeldZeile("o","x","o","o","o","o","o","o","o","o"));
	spielfeldzeilen.add(new SpielfeldZeile("o","o","x","o","o","o","o","o","o","o"));
	spielfeldzeilen.add(new SpielfeldZeile("o","o","o","x","o","o","o","o","o","o"));
	spielfeldzeilen.add(new SpielfeldZeile("o","o","o","o","x","o","o","o","o","o"));
	spielfeldzeilen.add(new SpielfeldZeile("o","o","o","o","o","x","o","o","o","o"));
	spielfeldzeilen.add(new SpielfeldZeile("o","o","o","o","o","o","x","o","o","o"));
	spielfeldzeilen.add(new SpielfeldZeile("o","o","o","o","o","o","o","x","o","o"));
	spielfeldzeilen.add(new SpielfeldZeile("o","o","o","o","o","o","o","o","x","o"));
	spielfeldzeilen.add(new SpielfeldZeile("o","o","o","o","o","o","o","o","o","o"));
	}
	
public static final List<SpielfeldZeile> gegnerspielfeldzeilen = new ArrayList<>();
	
	static{
		gegnerspielfeldzeilen.add(new SpielfeldZeile("","","","","","","","","",""));
		gegnerspielfeldzeilen.add(new SpielfeldZeile("","","","","","","","","",""));
		gegnerspielfeldzeilen.add(new SpielfeldZeile("","","","","","","","","",""));
		gegnerspielfeldzeilen.add(new SpielfeldZeile("","","","","","","","","",""));
		gegnerspielfeldzeilen.add(new SpielfeldZeile("","","","","","","","","",""));
		gegnerspielfeldzeilen.add(new SpielfeldZeile("","","","","","","","","",""));
		gegnerspielfeldzeilen.add(new SpielfeldZeile("","","","","","","","","",""));
		gegnerspielfeldzeilen.add(new SpielfeldZeile("","","","","","","","","",""));
		gegnerspielfeldzeilen.add(new SpielfeldZeile("","","","","","","","","",""));
		gegnerspielfeldzeilen.add(new SpielfeldZeile("","","","","","","","","",""));
	}
	

}
