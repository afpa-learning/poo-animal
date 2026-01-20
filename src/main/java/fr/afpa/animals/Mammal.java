package fr.afpa.animals;

/**
 * Classe qui représente un mammifère.
 * Caractérisé par la couleur de son pelage.
 */
class Mammal extends Animal 
{
    private String furColor;

	/**
     * Constructeur
     */
    public Mammal(String species, String name, int age, String furColor) 
	{
        super(species, name, age);
        this.furColor = furColor;
    }

    public String getFurColor() 
	{
        return furColor;
    }

    public void setFurColor(String furColor) 
	{
        this.furColor = furColor;
    }

    /**
     * Ré-implémentation de la méthode "toString()"
     */
    @Override
    public String toString()
	{
        return super.toString() + " - Couleur :" + this.furColor;
    }
}
