package entities;

public class Sales {
	
	private String name;
	private Double unitPrice;
	private Integer quantity;
	
	public Sales(String name, Double unitPrice, Integer quantity) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double totalPrice() {
		return unitPrice * quantity;
	}
	
	public String toString() {
		return name + ", " + totalPrice();
	}
}
