package fr.afpa.animals;

/*
Objectif : prise en main de l'héritage
Lisez l'intégralité l'énoncé avant de vous lancer dans le code.

TODO Ecrire un code permettant d'implémenter les classes avec les spécifications suivantes :

1. La classe "Animal" qui représente un animal 
Attributs de la classe :
 - species, l'espèce en chaîne de caractères
 - name, le nom de l'animal en chaîne de caractères
 - age, l'âge en entier

Méthodes de la classe :
 - getters pour les attributs
 - setters pour les attributs
 - toString() permettant de représenter sous forme de chaîne de caractère un objet de la classe "Animal"

Questions à se poser :
- qu'est-ce qu'une classe abstraite ? (la réponse est ici -> https://gayerie.dev/epsi-b3-java/langage_java/classe_abstraite.html)
- est-il pertinent de déclarer la classe "Animal" comme une classe abstraite ?

--------------------------------------------------------------------------------------------------------
2. La classe "Mammal" qui représente un mammifère.
Cette classe devra hériter de la classe "Animal"

Attributs en plus :
 - furColor, couleur de fourrure en chaîne de caractère

Méthodes en plus :
 - getters
 - setters
 - toString permettant de formater l'affichage des informations d'un objet de la classe "Mammal"
   -> exemple d'affichage :  "Espèce : Ours -  Nom : Châtaigne - Age : 12 ans - Couleur : Brun"
*/


/**
 * Classe représentant un animal
 */
abstract class Animal 
{
    private String species;
    private String name;
    private int age;

    // Constructor
    public Animal(String species, String name, int age) 
	{
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter method to get or to modify the private data
    public String getSpecies()
	{
        return species;
    }

    public void setSpecies(String species) 
	{
        this.species = species;
    }

    public int getAge() 
	{
        return age;
    }

    public void setAge(int age) 
	{
        this.age = age;
    }

    // Abstract method
    public String toString() {
        return "Espèce :" + this.species +" -  Nom : " + this.name + " - Age : " + this.age;
    }

    public abstract void displayLocomotionType();
}