package hapExam.aimcore.demo.dto;

import java.util.Date;

import com.hand.hap.system.dto.BaseDTO;

public class SalerOrder extends BaseDTO{
	private Long line_id;
	private Long header_id;
	private String customer_name;
	private String company_name;
	private Date order_date;
	private String order_status;
	private Long order_amount;
	private Long line_number;
	private Long company_id;
	private Long customer_id;
	private Long inventory_item_id;
	private String order_number;
	private String item_description;
	private String item_code;
	private String order_quantity_uom;
	private Long orderd_quantity;
	private Long unit_selling_price;
	private String description;
	private String addition1;
	private String addition2;
	private String addition3;
	private String addition4;
	private String addition5;

	
	
	public Long getLine_number() {
		return line_number;
	}

	public void setLine_number(Long line_number) {
		this.line_number = line_number;
	}

	public Long getLine_id() {
		return line_id;
	}

	public void setLine_id(Long line_id) {
		this.line_id = line_id;
	}

	public Long getHeader_id() {
		return header_id;
	}

	public void setHeader_id(Long header_id) {
		this.header_id = header_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public Long getOrder_amount() {
		return order_amount;
	}

	public void setOrder_amount(Long order_amount) {
		this.order_amount = order_amount;
	}

	public Long getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Long company_id) {
		this.company_id = company_id;
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public Long getInventory_item_id() {
		return inventory_item_id;
	}

	public void setInventory_item_id(Long inventory_item_id) {
		this.inventory_item_id = inventory_item_id;
	}

	public String getOrder_number() {
		return order_number;
	}

	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}

	public String getItem_description() {
		return item_description;
	}

	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}

	public String getOrder_quantity_uom() {
		return order_quantity_uom;
	}

	public void setOrder_quantity_uom(String order_quantity_uom) {
		this.order_quantity_uom = order_quantity_uom;
	}

	public Long getOrderd_quantity() {
		return orderd_quantity;
	}

	public void setOrderd_quantity(Long orderd_quantity) {
		this.orderd_quantity = orderd_quantity;
	}

	public Long getUnit_selling_price() {
		return unit_selling_price;
	}

	public void setUnit_selling_price(Long unit_selling_price) {
		this.unit_selling_price = unit_selling_price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddition1() {
		return addition1;
	}

	public void setAddition1(String addition1) {
		this.addition1 = addition1;
	}

	public String getAddition2() {
		return addition2;
	}

	public void setAddition2(String addition2) {
		this.addition2 = addition2;
	}

	public String getAddition3() {
		return addition3;
	}

	public void setAddition3(String addition3) {
		this.addition3 = addition3;
	}

	public String getAddition4() {
		return addition4;
	}

	public void setAddition4(String addition4) {
		this.addition4 = addition4;
	}

	public String getAddition5() {
		return addition5;
	}

	public void setAddition5(String addition5) {
		this.addition5 = addition5;
	}

	public String getItem_code() {
		return item_code;
	}

	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}

	@Override
	public String toString() {
		return "SalerOrder [line_id=" + line_id + ", header_id=" + header_id
				+ ", customer_name=" + customer_name + ", company_name="
				+ company_name + ", order_date=" + order_date
				+ ", order_status=" + order_status + ", order_amount="
				+ order_amount + ", company_id=" + company_id
				+ ", customer_id=" + customer_id + ", inventory_item_id="
				+ inventory_item_id + ", order_number=" + order_number
				+ ", item_description=" + item_description + ", item_code="
				+ item_code + ", order_quantity_uom=" + order_quantity_uom
				+ ", orderd_quantity=" + orderd_quantity
				+ ", unit_selling_price=" + unit_selling_price
				+ ", description=" + description + ", addition1=" + addition1
				+ ", addition2=" + addition2 + ", addition3=" + addition3
				+ ", addition4=" + addition4 + ", addition5=" + addition5 + "]";
	}



}
