package logic;

public class Logica {
	
	public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
	
	public static double dePesoColAMoneda(double valor, Moneda m, int tipo) {
		if(tipo==1) {
			return valor/m.getValorEnPesos();
		}else {
			return valor*m.getValorEnPesos();
		}
	}
	
	public static double conversionLongitud(double valor, String nombre1, String nombre2) {
			if(nombre1.equals("m") && nombre2.equals("km")) {
				return valor/1000;
			}else if(nombre1.equals("m") && nombre2.equals("cm")) {
				return valor*100;
			}else if(nombre1.equals("km") && nombre2.equals("m")) {
				return valor*1000;
			}else if(nombre1.equals("km") && nombre2.equals("cm")) {
				return valor*100000;
			}else if(nombre1.equals("cm") && nombre2.equals("m")) {
				return valor/100;
			}else {
				return valor/100000;
			}
		
	}
	
}