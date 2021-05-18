
public class Main{
	public static void main(String[] args) {
		
		Liste_anomalie liste_ano = new Liste_anomalie();
		
		InterfaceGenEvent fenetre = new InterfaceGenEvent(liste_ano);
		fenetre.main(liste_ano);
		
		System.out.println(liste_ano.getListe_ano_A2());
		
	
	}
}
