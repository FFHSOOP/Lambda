import java.util.ArrayList;
import java.util.List;

public class SchiffDataModel {
	List<Schiff> schiffsListe;
	String nachricht;

	
	SchiffDataModel(){
		schiffsListe = new ArrayList<Schiff>();
		
		schiffsListe.add(new Schlachtschiff());
		
		schiffsListe.add(new Kreuzer());
		schiffsListe.add(new Kreuzer());
		
		schiffsListe.add(new Zerstoerer());
		schiffsListe.add(new Zerstoerer());
		schiffsListe.add(new Zerstoerer());
		
		schiffsListe.add(new UBoot());
		schiffsListe.add(new UBoot());
		schiffsListe.add(new UBoot());
		schiffsListe.add(new UBoot());
	
	}

}
