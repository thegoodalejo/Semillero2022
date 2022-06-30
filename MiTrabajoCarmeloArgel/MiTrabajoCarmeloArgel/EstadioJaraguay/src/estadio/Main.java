package estadio;

public class Main {

	public static void main(String[] args) {
		
		General general1 = new General("Jesus",29,"Masc","General");
		General general2 = new General("Daniel",22,"Masc","General");
		General general3 = new General("Javier",30,"Masc","General");
		General general4 = new General("Maria",30,"Fem","General");
		General general5 = new General("Yeison",31,"Masc","General");
		General general6 = new General("Marco",33,"Masc","General");
		General general7 = new General("Jorge",24,"Masc","General");
		General general8 = new General("Juan",28,"Masc","General");
		Abonado abonado1 = new Abonado("Carmelo",30,"Masc","Abonado");
		Abonado abonado2 = new Abonado("Angelica",27,"Fem","Abonado");
		Abonado abonado3 = new Abonado("Luis Daniel",21,"Masc","Abonado");
		
		Oriental oriental1 = new Oriental(1, 70);
		Occidental occidental1 = new Occidental(1, 27);
		Occidental occidental2 = new Occidental(2, 10);
		
		oriental1.ingresar(general1);
		oriental1.ingresar(general2);
		oriental1.ingresar(general6);
		oriental1.ingresar(general8);
		occidental1.ingresar(abonado1);
		occidental1.ingresar(abonado2);
		occidental1.ingresar(abonado3);
		occidental1.ingresar(general5);
		occidental2.ingresar(general3);
		occidental2.ingresar(general4);
		occidental2.ingresar(general7);
		
		oriental1.resumen();
		occidental1.resumen();
		occidental2.resumen();
	}
}
