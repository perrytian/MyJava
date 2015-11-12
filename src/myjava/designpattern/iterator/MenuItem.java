package myjava.designpattern.iterator;

public class MenuItem
{
    String name;
    String description;
    boolean vegetarin;
    double price;

    public MenuItem(String name, String description, boolean vegetarin, double price)
    {
        this.name = name;
        this.description = description;
        this.vegetarin = vegetarin;
        this.price = price;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isVegetarin() {
		return vegetarin;
	}

	public void setVegetarin(boolean vegetarin) {
		this.vegetarin = vegetarin;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
