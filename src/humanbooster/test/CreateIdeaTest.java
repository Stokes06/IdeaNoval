package humanbooster.test;

import humanbooster.pojo.*;
//import humanbooster.myTools.*;
//import humanbooster.data.Database;

//import humanbooster.services.IdeaServices;
//import humanbooster.services.MarkServices;
//import humanbooster.services.UserServices;
//import humanbooster.services.impl.AnswerServicesImpl;
//import humanbooster.services.impl.IdeaServicesImpl;
//import humanbooster.services.impl.MarkServicesImpl;
//import humanbooster.services.impl.UserServicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Test ou le client cr�� une id�e apr�s connexion

public class CreateIdeaTest {
	public static void main(String[] args) {

		Client protoUser = new Client("Jack", "ja@jm.com", "doremifasol");
		List<Idea> newIdeas = new ArrayList<>();
		System.out.println("Bienvenue " + protoUser.getPseudo());
		Scanner sc = new Scanner(System.in);
		String rep = "";

		do {
			System.out.println("Cr�ez votre nouvelle id�e");
			System.out.println("Titre: ");
			String title = sc.nextLine();
			System.out.println("D�taillez votre id�e");
			String content = sc.nextLine();
			EvaluableIdea newIdea = new EvaluableIdea(title, content, protoUser);
			newIdeas.add(newIdea);
			System.out.println("Nouvelle id�e cr�� !");
			System.out.println("Encore inspir� ? (oui) (non)");
			rep = sc.nextLine();
		} while (rep.equals("oui") | rep.equals("o"));

		System.out.println("Voici vos nouvelles id�es");
		for (Idea i : newIdeas) {
			System.out.println(i);
		}
		sc.close();
	}

}
