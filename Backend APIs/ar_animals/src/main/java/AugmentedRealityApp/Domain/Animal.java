package AugmentedRealityApp.Domain;

public class Animal{
	private int id;
	private String name;
	private String category;
	private String foodHabit;
	private String habitat;
	private String description;
	
	public Animal() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getFoodHabit() {
		return foodHabit;
	}
	public void setFoodHabit(String foodHabit) {
		this.foodHabit = foodHabit;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}