import javax.swing.JOptionPane;

public class Divisa {
	
	public void ConvertirADolares(double valor) {
		double moneda = valor /18.59;
		moneda = (double) Math.round(moneda *100d)/100;
		JOptionPane.showMessageDialog(null," $" + moneda + " Dolares" );
		
	}
	
	public void ConvertirAEuros(double valor) {
		double moneda = valor /19.67;
		moneda = (double)Math.round(moneda *100d)/100;
		JOptionPane.showMessageDialog(null," $" + moneda + "Euros");
	}

	public void ConvertirALibras(double valor) {
		double moneda = valor /22.42;
		moneda = (double) Math.round(moneda *100d)/100;
		JOptionPane.showMessageDialog(null," $" + moneda + " Libras" );
	}

	public void ConvertirAYen(double valor) {
		double moneda = valor /0.13;
		moneda = (double) Math.round(moneda *100d)/100;
		JOptionPane.showMessageDialog(null," $" + moneda + " Yen" );
	}

	public void ConvertirAWon(double valor) {
		double moneda = valor /0.013;
		moneda = (double) Math.round(moneda *100d)/100;
		JOptionPane.showMessageDialog(null," $" + moneda + " Won" );
	}

	public void ConvertirADolaresP(double valor) {
		double moneda = valor * 18.59;
		moneda = (double) Math.round(moneda *100d)/100;
		JOptionPane.showMessageDialog(null," $" + moneda + " Pesos" );
	}

	public void ConvertirAEurosP(double valor) {
		double moneda = valor * 19.67;
		moneda = (double) Math.round(moneda *100d)/100;
		JOptionPane.showMessageDialog(null," $" + moneda + " Pesos" );
	}

	public void ConvertirALibraP(double valor) {
		double moneda = valor * 22.42;
		moneda = (double) Math.round(moneda *100d)/100;
		JOptionPane.showMessageDialog(null," $" + moneda + " Pesos" );
	}

	public void ConvertirAYenP(double valor) {
		double moneda = valor * 0.13;
		moneda = (double) Math.round(moneda *100d)/100;
		JOptionPane.showMessageDialog(null," $" + moneda + " Pesos" );
	}

	public void ConvertirAWonP(double valor) {
		double moneda = valor * 0.013;
		moneda = (double) Math.round(moneda *100d)/100;
		JOptionPane.showMessageDialog(null," $" + moneda + " Pesos" );
	}



}
