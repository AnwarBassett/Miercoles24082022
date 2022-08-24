package ejemplouno;

public class Variables {

	public static void main(String[] args) {
		int n;
		float areaLateral;
		float Pbase, h, l;
		double anguloCentral, Abase, apotema, areaTotal, Volumen, denominador;
		
		
		h=20;
		n=5;
		l=8.5f;
		Pbase= n*l;
		areaLateral= Pbase*h;
		
		anguloCentral= (360/n)*(Math.PI/180);
		denominador= Math.tan(anguloCentral/2);
		apotema = l/(2*denominador);
		Abase=(Pbase*apotema)/2;
		areaTotal= areaLateral+2*Abase;
		
		Volumen = Abase * h;
		
		//Datos de salida(Resultado)
		
		System.out.println("1.Datos del prisma:");
		System.out.println("2.Cantidad de lados: "+n);
		System.out.println("3.Longitud de lados: "+l);
		System.out.println("4.Altura: "+h);
		System.out.println("5.Perimetro de la base: "+Pbase);
		System.out.println("6.Area de la base: "+String.format("%.2f", Abase));
		System.out.println("7.Apotema: "+apotema);
		System.out.println("8.Area Lateral: "+areaLateral);
		System.out.println("9.Area Total: "+areaTotal);
		System.out.println("10.Volumen: "+Volumen);
	}
}
