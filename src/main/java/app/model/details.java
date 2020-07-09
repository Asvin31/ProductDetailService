package app.model;
import java.util.ArrayList;
import java.util.List;
import app.model.attributes;

public class details {
	
	private String description;
	private ArrayList<attributes> attributes;
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the attributes
	 */
	public List<attributes> getAttributes() {
		return attributes;
	}
	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(List<attributes> attributes) {
		if(null == attributes){
			attributes = new ArrayList<attributes>();
		}
		this.attributes = (ArrayList<attributes>) attributes;
	}
}
