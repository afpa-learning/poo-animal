package fr.afpa.animals;

import java.util.ArrayList;

/**
 * Classe principale du projet, contient la fonction "main"
 */
class AnimalsMain
{
	public static void main(String[] args) 
	{
		System.out.println("\n----- Exercice de programmation objet - héritage -----");

		ArrayList<Animal> animals = new ArrayList<>();

		// TODO ajouter du code pour tester vos classes

		// instanciation d'un objet de la classe "Mammal"
		Mammal mammal1 = new Mammal("Ours", "Châtaigne", 12, "Brun");
		// affichage des informations de l'objet
		System.out.println(mammal1.toString());
	}
}

