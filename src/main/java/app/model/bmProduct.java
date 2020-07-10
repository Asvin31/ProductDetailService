package app.model;

import java.util.Map;

import org.springframework.data.annotation.Id;
import app.model.details;
import app.model.RecommendedProductBean;
import app.model.SpecificationBean;

public class bmProduct {

	public bmProduct() {

	}

	@Id
	private String id;
	private String catentry_id;
	private String name;
	private String shortProductDesc;
	private String make;
	private String sku;
	private String category;
	private String sub_category;
	private String thumb_image;
	private String full_image;
	private String tumb_image;
	private String large_image;
	private details details;
	private String productdetails;
	private Map<String, String> specification;
	private Warranty warranty;
	private RecommendedProductBean recommendedproduct;
	private String image;
	private String brandName;

	public bmProduct(String catentry_id, String name, String shortProductDesc, String make, String sku, String category,
			String sub_category, String thumb_image, String full_image, String tumb_image, String large_image,
			details details, String productdetails, Map<String, String> specification, Warranty warrant,
			RecommendedProductBean recommendedproduct, String image) {
		this.catentry_id = catentry_id;
		this.name = name;
		this.shortProductDesc = shortProductDesc;
		this.make = make;
		this.sku = sku;
		this.category = category;
		this.sub_category = sub_category;
		this.thumb_image = thumb_image;
		this.full_image = full_image;
		this.tumb_image = tumb_image;
		this.large_image = large_image;
		this.details = details;
		this.productdetails = productdetails;
		this.specification = specification;
		this.warranty = warrant;
		this.recommendedproduct = recommendedproduct;
		this.image = image;

	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the catentry_id
	 */
	public String getCatentry_id() {
		return catentry_id;
	}

	/**
	 * @param catentry_id the catentry_id to set
	 */
	public void setCatentry_id(String catentry_id) {
		this.catentry_id = catentry_id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getShortProductDesc() {
		return shortProductDesc;
	}

	public void setShortProductDesc(String shortProductDesc) {
		this.shortProductDesc = shortProductDesc;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the sub_category
	 */
	public String getSub_category() {
		return sub_category;
	}

	/**
	 * @param sub_category the sub_category to set
	 */
	public void setSub_category(String sub_category) {
		this.sub_category = sub_category;
	}

	/**
	 * @return the thumb_image
	 */
	public String getThumb_image() {
		return thumb_image;
	}

	/**
	 * @param thumb_image the thumb_image to set
	 */
	public void setThumb_image(String thumb_image) {
		this.thumb_image = thumb_image;
	}

	/**
	 * @return the full_image
	 */
	public String getFull_image() {
		return full_image;
	}

	/**
	 * @param full_image the full_image to set
	 */
	public void setFull_image(String full_image) {
		this.full_image = full_image;
	}

	/**
	 * @return the details
	 */
	public details getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(details details) {
		this.details = details;
	}

	public String getProductdetails() {
		return productdetails;
	}

	public void setProductdetails(String productdetails) {

		this.productdetails = productdetails;
	}

	public Map<String, String> getSpecification() {
		return specification;
	}

	public void setSpecification(Map<String, String> specification) {
		this.specification = specification;
	}

	public Warranty getWarranty() {
		return warranty;
	}

	public void setWarranty(Warranty warranty) {
		this.warranty = warranty;
	}

	public RecommendedProductBean getRecommendedproduct() {
		return recommendedproduct;
	}

	public void setRecommendedproduct(RecommendedProductBean recommendedproduct) {
		this.recommendedproduct = recommendedproduct;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTumb_image() {
		return tumb_image;
	}

	public void setTumb_image(String tumb_image) {
		this.tumb_image = tumb_image;
	}

	public String getLarge_image() {
		return large_image;
	}

	public void setLarge_image(String large_image) {
		this.large_image = large_image;
	}
}
