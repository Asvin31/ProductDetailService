package app.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SpecificationBean {
	
	private String size;
	private String colour;
	private String OS;	
	private String RAM;
	private String internal_storage;
	private String primary_camera;
	private String secondary_camera;
	private String network_type;
	private String sim_size;
	private String weight;
	private String style;
	private String product_dimensions;
	private String primary_material;
	private String color;
	
	private String motor;
	private String speed_level;
	private String incline_level;
	private String running_surface;
	private String step_up_height;
	private String rollers;
	private String cooling_fans;
	private String pixels;
	private String tripodSocket;
	private String wifi;
	private String sensorType;
	private String isoRating;
	private String viewFinder;
	private String opticalZoom;
	private String viewFinderType;
	private String selfTimer;
	private String batteryType;
	private String 	StyleCode;
	private String Pattern;
	private String IdealFor;
	private String Sleeve;
	private String Occasion;
	private String NumberofContents;
	private String BeltIncluded;
	private String Fabric;
	private String Type;
	private String Neck;
	private String Style;
	private String BrandFit;
	private String Design;
	private String Collar;
	private String Fit;
	private String Placket;
	private String Pleats;
	private String Closure;
	private String KnitType;
	private String Pockets;
	private String OtherDetails;
	private String Cuff;
	private String Hem;
	private String WeaveType;
	private String ModelDetails;
	private String Brand;
	private String CareInstructions;
	private String model_name;
	private String number_of_strips;
	private String number_of_lancets;
	private String measuring_time;
	private String display_type;
	private String memory;

	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getSpeed_level() {
		return speed_level;
	}
	public void setSpeed_level(String speed_level) {
		this.speed_level = speed_level;
	}
	public String getIncline_level() {
		return incline_level;
	}
	public void setIncline_level(String incline_level) {
		this.incline_level = incline_level;
	}
	public String getRunning_surface() {
		return running_surface;
	}
	public void setRunning_surface(String running_surface) {
		this.running_surface = running_surface;
	}
	public String getStep_up_height() {
		return step_up_height;
	}
	public void setStep_up_height(String step_up_height) {
		this.step_up_height = step_up_height;
	}
	public String getRollers() {
		return rollers;
	}
	public void setRollers(String rollers) {
		this.rollers = rollers;
	}
	public String getCooling_fans() {
		return cooling_fans;
	}
	public void setCooling_fans(String cooling_fans) {
		this.cooling_fans = cooling_fans;
	}
	public String getPixels() {
		return pixels;
	}
	public void setPixels(String pixels) {
		this.pixels = pixels;
	}
	public String getTripodSocket() {
		return tripodSocket;
	}
	public void setTripodSocket(String tripodSocket) {
		this.tripodSocket = tripodSocket;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getSensorType() {
		return sensorType;
	}
	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
	}
	public String getIsoRating() {
		return isoRating;
	}
	public void setIsoRating(String isoRating) {
		this.isoRating = isoRating;
	}
	public String getViewFinder() {
		return viewFinder;
	}
	public void setViewFinder(String viewFinder) {
		this.viewFinder = viewFinder;
	}
	public String getViewFinderType() {
		return viewFinderType;
	}
	public void setViewFinderType(String viewFinderType) {
		this.viewFinderType = viewFinderType;
	}
	public String getSelfTimer() {
		return selfTimer;
	}
	public void setSelfTimer(String selfTimer) {
		this.selfTimer = selfTimer;
	}
	public String getBatteryType() {
		return batteryType;
	}
	public void setBatteryType(String batteryType) {
		this.batteryType = batteryType;
	}
	public String getOpticalZoom() {
	return opticalZoom;
    }
    
    public void setOpticalZoom(String opticalZoom) {
    	this.opticalZoom = opticalZoom;
    }

	
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getOS() {
		return OS;
	}
	public void setOS(String oS) {
		OS = oS;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String rAM) {
		RAM = rAM;
	}
	public String getInternal_storage() {
		return internal_storage;
	}
	public void setInternal_storage(String internal_storage) {
		this.internal_storage = internal_storage;
	}
	public String getPrimary_camera() {
		return primary_camera;
	}
	public void setPrimary_camera(String primary_camera) {
		this.primary_camera = primary_camera;
	}
	
	public String getSecondary_camera() {
		return secondary_camera;
	}
	public void setSecondary_camera(String secondary_camera) {
		this.secondary_camera = secondary_camera;
	}
	public String getNetwork_type() {
		return network_type;
	}
	public void setNetwork_type(String network_type) {
		this.network_type = network_type;
	}
	public String getSim_size() {
		return sim_size;
	}
	public void setSim_size(String sim_size) {
		this.sim_size = sim_size;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getProduct_dimensions() {
		return product_dimensions;
	}
	public void setProduct_dimensions(String product_dimensions) {
		this.product_dimensions = product_dimensions;
	}
	public String getPrimary_material() {
		return primary_material;
	}
	public void setPrimary_material(String primary_material) {
		this.primary_material = primary_material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getStyleCode() {
		return StyleCode;
	}
	public void setStyleCode(String StyleCode) {
		this.StyleCode = StyleCode;
	}
	public String getPattern() {
		return Pattern;
	}
	public void setPattern(String Pattern) {
		this.Pattern = Pattern;
	}
	public String getIdealFor() {
		return IdealFor;
	}
	public void setIdealFor(String IdealFor) {
		this.IdealFor = IdealFor;
	}
	public String getSleeve() {
		return Sleeve;
	}
	public void setSleeve(String Sleeve) {
		this.Sleeve = Sleeve;
	}
	public String getOccasion() {
		return Occasion;
	}
	public void setOccasion(String Occasion) {
		this.Occasion = Occasion;
	}
	public String getNumberofContents() {
		return NumberofContents;
	}
	public void setNumberofContents(String NumberofContents) {
		this.NumberofContents = NumberofContents;
	}
	public String getBeltIncluded() {
		return BeltIncluded;
	}
	public void setBeltIncluded(String BeltIncluded) {
		this.BeltIncluded = BeltIncluded;
	}
	public String getFabric() {
		return Fabric;
	}
	public void setFabric(String Fabric) {
		this.Fabric = Fabric;
	}
	public String getType() {
		return Type;
	}
	public void setType(String Type) {
		this.Type = Type;
	}
	public String getNeck() {
		return Neck;
	}
	public void setNeck(String Neck) {
		this.Neck = Neck;
	}
	public String getStyle1() {
		return Style;
	}
	public void setStyle1(String Style) {
		this.Style = Style;
	}
	public String getBrandFit() {
		return BrandFit;
	}
	public void setBrandFit(String BrandFit) {
		this.BrandFit = BrandFit;
	}
	public String getDesign() {
		return Design;
	}
	public void setDesign(String Design) {
		this.Design = Design;
	}
	public String getCollar() {
		return Collar;
	}
	public void setCollar(String Collar) {
		this.Collar = Collar;
	}
	public String getFit() {
		return Fit;
	}
	public void setFit(String Fit) {
		this.Fit = Fit;
	}
	public String getPlacket() {
		return Placket;
	}
	public void setPlacket(String Placket) {
		this.Placket = Placket;
	}
	public String getPleats() {
		return Pleats;
	}
	public void setPleats(String Pleats) {
		this.Pleats = Pleats;
	}
	public String getClosure() {
		return Closure;
	}
	public void setClosure(String Closure) {
		this.Closure = Closure;
	}
	public String getKnitType() {
		return KnitType;
	}
	public void setKnitType(String KnitType) {
		this.KnitType = KnitType;
	}
	public String getPockets() {
		return Pockets;
	}
	public void setPockets(String Pockets) {
		this.Pockets = Pockets;
	}
	public String getOtherDetails() {
		return OtherDetails;
	}
	public void setOtherDetails(String OtherDetails) {
		this.OtherDetails = OtherDetails;
	}
	public String getCuff() {
		return Cuff;
	}
	public void setCuff(String Cuff) {
		this.Cuff = Cuff;
	}
	public String getHem() {
		return Hem;
	}
	public void setHem(String Hem) {
		this.Hem = Hem;
	}
	public String getWeaveType() {
		return WeaveType;
	}
	public void setWeaveType(String WeaveType) {
		this.WeaveType = WeaveType;
	}
	public String getModelDetails() {
		return ModelDetails;
	}
	public void setModelDetails(String ModelDetails) {
		this.ModelDetails = ModelDetails;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String Brand) {
		this.Brand = Brand;
	}
	public String getCareInstructions() {
		return CareInstructions;
	}
	public void setCareInstructions(String CareInstructions) {
		this.CareInstructions = CareInstructions;
	}
	public String getmodel_name() {
		return model_name;
	}
	public void setmodel_name(String model_name) {
		this.model_name = model_name;
	}
	public String getnumber_of_strips() {
		return number_of_strips;
	}
	public void setnumber_of_strips(String number_of_strips) {
		this.number_of_strips = number_of_strips;
	}
	public String getnumber_of_lancets() {
		return number_of_lancets;
	}
	public void setnumber_of_lancets(String number_of_lancets) {
		this.number_of_lancets = number_of_lancets;
	}
	public String getmeasuring_time() {
		return measuring_time;
	}
	public void setmeasuring_time(String measuring_time) {
		this.measuring_time = measuring_time;
	}
	public String getdisplay_type() {
		return display_type;
	}
	public void setdisplay_type(String display_type) {
		this.display_type = display_type;
	}
	public String getmemory() {
		return memory;
	}
	public void setmemory(String memory) {
		this.memory = memory;
	}

}
