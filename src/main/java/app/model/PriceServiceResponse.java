package app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceServiceResponse {

    private PriceValue data;
     private  String stock;
    private Boolean success;

    public PriceServiceResponse() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public PriceValue getData() {
        return data;
    }

    public void setData(PriceValue data) {
        this.data = data;
    }
    
    public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}
	
	@Override
    public String toString() {
        return "PriceServiceResponse{" +
                "priceValue='" + data + '\'' +
                ", responseMsg=" + success +
                '}';
    }

}
