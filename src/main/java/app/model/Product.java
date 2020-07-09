package app.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	private String catentry_id;
	private String name;
	private String imagepath;
	private String price;
	private String ingredients;
	
	public String getCatentry_id() {
		return catentry_id;
	}
	public void setCatentry_id(String catentry_id) {
		this.catentry_id = catentry_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImagepath()
	{
		return imagepath;
	}
	public void setImagepath(String imagepath)
	{
		this.imagepath=imagepath;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
		public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
}
