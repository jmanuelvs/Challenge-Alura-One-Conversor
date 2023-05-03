import javax.swing.JOptionPane;

public class ConvertidorTemp {
	
	Temperatura temp = new Temperatura();
	
	public void ConvertirTem(double input) {
		String opcion = (JOptionPane.showInputDialog(null,"Elije la divisa a la que deseas convertir: ","Moneda",JOptionPane.PLAIN_MESSAGE,null,new Object[] 
				{"Celcius a Farenheit", "Celcius a Kelvin", "Farenheit a Celcius","Kelvin a Celcius","Kelvin a Farenheit"},"Seleccion")).toString();

		switch(opcion) {
			case "Celcius a Farenheit":
				temp.CelciusAFarenheit(input);
				break;
			case "Celcius a Kelvin":
				temp.CelciusAKelvin(input);
				break;
			case "Farenheit a Celcius":
				temp.FarenheitACelcius(input);
				break;
			case "Kelvin a Celcius":
				temp.KelvinACelcius(input);
				break;
			case "Kelvin a Farenheit":
				temp.KelvinAFarenheit(input);
				break;
		
		}
	}
}
