import javax.swing.JOptionPane;


public class Conversor {

	public static void main(String[] args) {
		
		
		ConvertirMonedas moneda = new ConvertirMonedas();
		ConvertidorTemp temp = new ConvertidorTemp();
		String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menu",JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
		switch(opciones) {
		case "Conversor de Moneda":
			
			String input = JOptionPane.showInputDialog("Ingresa la cantidad que deseas convertir: ");
			if(Validacion(input) == true) {
				double valor = Double.parseDouble(input);
				moneda.Convertir(valor);
				
				int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
	            
				if (JOptionPane.OK_OPTION == respuesta){
	            	System.out.println("Selecciona opción Afirmativa");
	            }else{
	               	JOptionPane.showMessageDialog(null, "Programa terminado");                         
	            }	
			}else {
				JOptionPane.showMessageDialog(null, "Valor no Valido");
			}      
            	break;
		case "Conversor de Temperatura":
			
			System.out.println(5+10);
				input = JOptionPane.showInputDialog("Ingresa la Temperatura que deseas convertir: ");
			if(Validacion(input) == true) {
				double valor = Double.parseDouble(input);
				temp.ConvertirTem(valor);
				
				int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
	            
				if (JOptionPane.OK_OPTION == respuesta){
	            	System.out.println("Selecciona opción Afirmativa");
	            }else{
	               	JOptionPane.showMessageDialog(null, "Programa terminado");                         
	            }	
			}else {
				JOptionPane.showMessageDialog(null, "Valor no Valido");
			}      
            	break;
		}
		

	}



	public static boolean Validacion(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		}catch(NumberFormatException nfe) {
			return false;
		}
		
	}
	
}
