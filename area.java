package house;

import javax.swing.JOptionPane;

public class area {
	
	
	//En este ejersicion vamos a calcular el area de figuras geometricas el circulo, triangulo, cuadrado

	public static void main(String[] args) {

		//Declaramos estas variavle para reutilizarla y no tener que declarar tantas variables
		String texto= "";
		
		//Declaramos esta variable para mostrar fnal el resultado
		double resultado=0;
		
		//El usuario inserta aqui, la figura a la que le quiere calcular el area
		String eleccion=JOptionPane.showInputDialog("Introduce una figura : circulo, tringulo o cuadrado :");
		

		switch (eleccion)
		//Segun la figura realizamos una serie de acciones
		{
		case "circulo":
			
			
			texto=JOptionPane.showInputDialog("Introduce el radio :"); 	//En este caso usamos un cuadro de dialogo para pedile al usuario que inserte el dato
			int radio=Integer.parseInt(texto);				//El dato lo convertimos a una variable de tipo entero para poder calcular.
			resultado=areaCirculo(radio);					//y Aplicamos la operacion para calcular.
			break;
		case "triangulo":
			texto=JOptionPane.showInputDialog("Introduce el base :");
			int base=Integer.parseInt(texto);
			texto=JOptionPane.showInputDialog("Introduce la altura :");
			int altura=Integer.parseInt(texto);
			resultado=areaTriangulo(base, altura);
			break;
		case "cuadrado":
			texto=JOptionPane.showInputDialog("Introduce la medida de un lado :");
			int lado=Integer.parseInt(texto);
			resultado=areaCirculo(lado);
			break;
		default :
			System.out.println("No has introducido una figura correcta");
		}
		
		System.out.println("El area del "+eleccion+ "es" +resultado);			//Por ultimo mandamos por pantalla el resultado de la operaicon que elejimos
		
	}
	
	
	public static double areaCirculo(int radio)	//Por fuera cramos estos metodos los cuales calculan la operacion cuadno los llaman les tienen que pasar parametros
	{
		return Math.pow(radio, 2)*Math.PI;
	}
	

	public static double areaTriangulo(int base,int altura)
	{
		return base*altura/2;
	}
	
	
	public static double areaCuadrado(int lado)
	{
		return lado*lado;
	}
	
}
