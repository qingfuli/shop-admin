package shopadmin.model;

public class Cellphone {
	
	private Long id;
	private String name;
	private String description;
	private Integer price;
	
	private String brand;              // 品牌
	private String model;              // 型号
	private String os;                 // 操作系统
	private String cpuBrand;           // CPU型号
	private Integer ram;               // 内存
	private Integer storage;           // 存储容量
	private String color;              // 颜色
	
	public Cellphone() {
	}	

	public Cellphone(Long id, String name, String description, Integer price, String brand, String model, String os,
			String cpuBrand, Integer ram, Integer storage, String color) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.brand = brand;
		this.model = model;
		this.os = os;
		this.cpuBrand = cpuBrand;
		this.ram = ram;
		this.storage = storage;
		this.color = color;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCpuBrand() {
		return cpuBrand;
	}

	public void setCpuBrand(String cpuBrand) {
		this.cpuBrand = cpuBrand;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Integer getStorage() {
		return storage;
	}

	public void setStorage(Integer storage) {
		this.storage = storage;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "CellPhone [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", brand=" + brand + ", model=" + model + ", os=" + os + ", cpuBrand=" + cpuBrand + ", ram=" + ram
				+ ", storage=" + storage + ", color=" + color + "]";
	}

}
