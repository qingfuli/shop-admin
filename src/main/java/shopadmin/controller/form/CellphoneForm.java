package shopadmin.controller.form;

import java.text.DecimalFormat;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import shopadmin.model.Cellphone;

public class CellphoneForm {
	
	private Long id;
	
	@Size(min = 1 ,max = 128,message = "1-128字")
	private String name;
	
	@Size(min = 1 ,max = 1024,message = "1-1024字")
	private String description;
	
	@Digits(integer = 8,fraction = 2,message = "必须为两位小数")
	private String price;
	
	@Size(min = 1 ,max = 64,message = "1-64字")
	private String brand;              // 品牌
	
	@Size(min = 1 ,max = 64,message = "1-64字")
	private String model;              // 型号
	
	@Size(min = 1 ,max = 64,message = "1-64字")
	private String os;                 // 操作系统
	
	@Size(min = 1 ,max = 64,message = "1-64字")
	private String cpuBrand;           // CPU型号
	
	@Digits(integer = 8,fraction = 0,message = "必须为整数")
	private String ram;               // 内存
	
	@Digits(integer = 8,fraction = 0,message = "必须为整数")
	private String storage;           // 存储容量
	
	@Size(min = 1 ,max = 32,message = "1-32字")
	private String color;              // 颜色
	
	public CellphoneForm() {
	}

	public CellphoneForm(Long id, String name, String description, String price, String brand, String model, String os,
			String cpuBrand, String ram, String storage, String color) {
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
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

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
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

	public Cellphone toCellphone() {
		Cellphone cellphone = new Cellphone(
				id,
				name,
				description,
				(int) (Double.parseDouble(price) * 100),
				brand,
				model,
				os,
				cpuBrand,
				Integer.parseInt(ram),
				Integer.parseInt(storage),
				color
				);
	
		return cellphone;
	}

	public static CellphoneForm fromCellphone(Cellphone cellphone) {
		CellphoneForm cellphoneForm = new CellphoneForm(
				cellphone.getId(),
				cellphone.getName(),
				cellphone.getDescription(),
				intToDouble(cellphone.getPrice()),
				cellphone.getBrand(),
				cellphone.getModel(),
				cellphone.getOs(),
				cellphone.getCpuBrand(),
				cellphone.getRam().toString(),
				cellphone.getStorage().toString(),
				cellphone.getColor()
				);
		
		return cellphoneForm;
	}
	
	public static void main(String[] args) {
		int a = 772100;
		double d = Double.parseDouble("77");
		
		int s = (int) (d * 100);
		
		System.out.println();
	}
	
	// 把整数除以100后，转换为字符串，且保留两位小数
	private static String intToDouble(int i){
		float num= (float)i/100;   
		DecimalFormat df = new DecimalFormat("0.00");
		String s = df.format(num); 
		return s;
	}

}
