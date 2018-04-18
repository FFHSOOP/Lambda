import java.io.Serializable;

public class Spieler implements Serializable{
	private String name;
	private String vorname;
	private String ip;
	private int port;
	
	Spieler(String name, String vorname, String ip, int port){
		this.name = name;
		this.vorname = vorname;
		this.ip = ip;
		this.port = port;
	}
}
