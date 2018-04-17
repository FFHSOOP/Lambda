import java.util.ArrayList;
import java.util.List;

public class SchiffDataModel {
	List<Schiff> schiffsListe;
	String nachricht;
	int schlachtschiff = 1;
	int kreuzer = 2;
	int zerstoerer = 3;
	int uboot = 4;

	
	SchiffDataModel(){
		schiffsListe = new ArrayList<Schiff>();
		
		for (int i = 0; i < schlachtschiff; i++){
		schiffsListe.add(new Schlachtschiff());
		}
		
		for (int i = 0; i < kreuzer; i++){
			schiffsListe.add(new Kreuzer());
		}
		
		for (int i = 0; i < zerstoerer; i++){
		schiffsListe.add(new Zerstoerer());
		}
		
		for (int i = 0; i < uboot; i++){
		schiffsListe.add(new UBoot());
		}
	
	
	}

}
