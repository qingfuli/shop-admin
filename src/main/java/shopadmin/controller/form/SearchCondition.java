package shopadmin.controller.form;

public class SearchCondition {
	private String brand;
	private String os;
	private String ramMin;
	private String ramMax;
	
	public SearchCondition() {
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand.equals("") ? null : brand;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os.equals("") ? null : os;
	}

	public String getRamMin() {
		return ramMin;
	}

	public void setRamMin(String ramMin) {
		this.ramMin = ramMin.equals("") ? null : ramMin;
	}

	public String getRamMax() {
		return ramMax;
	}

	public void setRamMax(String ramMax) {
		this.ramMax = ramMax.equals("") ? null : ramMax;
	}
	
	
	
}
