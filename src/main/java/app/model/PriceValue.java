package app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceValue {

    private Boolean onSale;
    private Double listPrice;
	private Double salePrice;


    public Boolean getOnSale() {
        return onSale;
    }

    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }

	public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }
	
	public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }
	
	@Override
    public String toString() {
        return "PriceValue{" +
                "onSaleFlag=" + onSale +
                ", listPrice=" + listPrice +
                ", salePrice=" + salePrice + "}";
    }
}
