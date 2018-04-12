import java.lang.reflect.Field;

public class SpielfeldZeile {
	private String A;
	private String B;
	private String C;
	private String D;
	private String E;
	private String F;
	private String G;
	private String H;
	private String I;
	private String J;

	public SpielfeldZeile(){}
	
	public SpielfeldZeile(
			String A
			,String B
			,String C
			,String D
			,String E
			,String F
			,String G
			,String H
			,String I
			,String J
			
			){
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
		this.E = E;
		this.F = F;
		this.G = G;
		this.H = H;
		this.I = I;
		this.J = J;

		
	}
	
	public String getValue(String x){
		String r = "";
		switch(x.toLowerCase()){
		case "a":
			r = this.A;
			break;
		case "b":
			r = this.B;
			break;
		case "c":
			r = this.C;
			break;
		case "d":
			r = this.D;
			break;
		case "e":
			r = this.E;
			break;
		case "f":
			r = this.F;
			break;
		case "g":
			r = this.G;
			break;
		case "h":
			r = this.H;
			break;
		case "i":
			r = this.I;
			break;
		case "j":
			r = this.J;
			break;
		}
		return r;
	}
	
	public void setValue(String column, String value){
		
		switch(column.toLowerCase()){
		case "a":
			this.A = value;
			break;
		case "b":
			this.B = value;
			break;
		case "c":
			this.C = value;
			break;
		case "d":
			this.D = value;
			break;
		case "e":
			this.E = value;
			break;
		case "f":
			this.F = value;
			break;
		case "g":
			this.G = value;
			break;
		case "h":
			this.H = value;
			break;
		case "i":
			this.I = value;
			break;
		case "j":
			this.J = value;
			break;
		}

	}
		

	/*
	public String getRowContent(String x) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException{
		
		SpielfeldZeile s = new SpielfeldZeile();

			Field f = s.getClass().getField(x.toUpperCase());
			return (String) f.get(s);
	
		
		}
	
	
	
	public void setRowContent(String row, String wert) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		
		SpielfeldZeile s = new SpielfeldZeile();
		
		Field f = s.getClass().getField(row.toUpperCase());
		f.set(s, wert);
		
			}
	*/

}
