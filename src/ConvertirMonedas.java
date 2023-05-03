import javax.swing.JOptionPane;

public class ConvertirMonedas {

	Divisa moneda = new Divisa();
	
	public void Convertir(double input) {
		String opcion = (JOptionPane.showInputDialog(null,"Elije la divisa a la que deseas convertir: ","Moneda",JOptionPane.PLAIN_MESSAGE,null,new Object[] 
				{"Pesos a Dólares", "Pesos a Euro", "Pesos a Libras","Pesos a Yen","Pesos a Won Coreano","Dólar a Pesos", "Euro a Pesos", "Libras Esterlinas a Pesos","Yen a Pesos","Won Coreano a Pesos"},"Seleccion")).toString();

		switch(opcion) {
			case "Pesos a Dólares":
				moneda.ConvertirADolares(input);
				break;
			case "Pesos a Euro":
				moneda.ConvertirAEuros(input);
				break;
			case "Pesos a Libras":
				moneda.ConvertirALibras(input);
				break;
			case "Pesos a Yen":
				moneda.ConvertirAYen(input);
				break;
			case "Pesos a Won Coreano":
				moneda.ConvertirAWon(input);
				break;
			case "Dólar a Pesos":
				moneda.ConvertirADolaresP(input);
				break;
			case "Euro a Pesos":
				moneda.ConvertirAEurosP(input);
				break;
			case "Libras Esterlinas a Pesos":
				moneda.ConvertirALibraP(input);
				break;
			case "Yen a Pesos":
				moneda.ConvertirAYenP(input);
				break;
			case "Won coreano a Pesos":
				moneda.ConvertirAWonP(input);
				
				break;
		
		}
	}
}
