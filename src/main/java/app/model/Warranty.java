package app.model;

public class Warranty {
	
	private String device_warranty;
    private String accessories_warranty;
    
    private String frame_warranty;
	private String motor_warranty;
	private String electronics_warranty;
	private String domestic_warranty;	
	
	public String getFrame_warranty() {
		return frame_warranty;
	}
	public void setFrame_warranty(String frame_warranty) {
		this.frame_warranty = frame_warranty;
	}
	public String getMotor_warranty() {
		return motor_warranty;
	}
	public void setMotor_warranty(String motor_warranty) {
		this.motor_warranty = motor_warranty;
	}
	public String getElectronics_warranty() {
		return electronics_warranty;
	}
	public void setElectronics_warranty(String electronics_warranty) {
		this.electronics_warranty = electronics_warranty;
	}

	public String getDevice_warranty() {
		return device_warranty;
	}
	public void setDevice_warranty(String device_warranty) {
		this.device_warranty = device_warranty;
	}
	public String getAccessories_warranty() {
		return accessories_warranty;
	}
	public void setAccessories_warranty(String accessories_warranty) {
		this.accessories_warranty = accessories_warranty;
	}
	
	/*
	//Adding additional warranty details
	private String international_warranty;
    public String getInternational_warranty() {
		return international_warranty;
	}
	
	public void setInternational_warranty(String international_warranty) {
		this.international_warranty = international_warranty;
	}
	
	private String extended_warranty;
	private String extended_warranty_period;
    private String free_installation;
	
	public String getExtended_warranty() {
		return extended_warranty;
	}
	public void setExtended_warranty(String extended_warranty) {
		this.extended_warranty = extended_warranty;
	}
	
	public String getExtended_warranty_period() {
		return extended_warranty_period;
	}
	public void setExtended_warranty_period(String extended_warranty_period) {
		this.extended_warranty_period = extended_warranty_period;
	}
	
	public String getFree_installation() {
		return free_installation;
	}
	public void setFree_installation(String free_installation) {
		this.free_installation = free_installation;
	}
	public String getdomestic_warranty() {
		return domestic_warranty;
	}
	public void setdomestic_warranty(String domestic_warranty) {
		this.domestic_warranty = domestic_warranty;
	}	
*/
}
