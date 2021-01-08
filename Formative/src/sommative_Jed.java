/*
 * Description des erreurs:
 * 1. Le 'public class' doit avoir le nom du projet pas le nom du package. Dans le cas de l'exemple ca sera public class Erreurs
 * 2. Pour la partie 'System.out.println(saluerAmi(John));' tu a besoin de mettre les " autour de John pour que c'est mis comme text dans le console
 * 3. Sur la ligne System.out.println(saluerAmi (John)); le code est mal écrit car le robot va deja penser que l'homme est nommé john
 * 4. tu dois importer un scanner pour mettre les reponses a votre nom
 */
import java.util.Scanner;

public class sommative_Jed
{
	public static void main(String[] args)
	{	
		System.out.println(saluerAmi + "John");
	}
}
public String saluerAmi(String nom)
{
	String message="Bonjour mon ami" + nom
}
}