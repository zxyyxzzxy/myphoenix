/*
 * ............................................. 
 * 
 * 				    _ooOoo_ 
 * 		  	       o8888888o 
 * 	  	  	       88" . "88 
 *                 (| -_- |) 
 *                  O\ = /O 
 *              ____/`---*\____ 
 *               . * \\| |// `. 
 *             / \\||| : |||// \ 
 *           / _||||| -:- |||||- \ 
 *             | | \\\ - /// | | 
 *            | \_| **\---/** | | 
 *           \  .-\__ `-` ___/-. / 
 *            ___`. .* /--.--\ `. . __ 
 *        ."" *< `.___\_<|>_/___.* >*"". 
 *      | | : `- \`.;`\ _ /`;.`/ - ` : | | 
 *         \ \ `-. \_ __\ /__ _/ .-` / / 
 *======`-.____`-.___\_____/___.-`____.-*====== 
 * 
 * ............................................. 
 *              佛祖保佑 永无BUG 
 *
 * 佛曰: 
 * 写字楼里写字间，写字间里程序员； 
 * 程序人员写程序，又拿程序换酒钱。 
 * 酒醒只在网上坐，酒醉还来网下眠； 
 * 酒醉酒醒日复日，网上网下年复年。 
 * 但愿老死电脑间，不愿鞠躬老板前； 
 * 奔驰宝马贵者趣，公交自行程序员。 
 * 别人笑我忒疯癫，我笑自己命太贱； 
 * 不见满街漂亮妹，哪个归得程序员？
 *
 * 北纬30.√  154518484@qq.com
 */
package com.zxy.phoenix.entity;

import org.apache.commons.lang.builder.*;

public class Order {
	
	//alias
	public static final String TABLE_ALIAS = "Order";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_CUSTOMER_ID = "customerId";
	public static final String ALIAS_ITEM_ID = "itemId";
	public static final String ALIAS_QUANTITY = "quantity";
	
	
	//columns START
	/** id   db_column: id */ 	
	private String id;
	/** customerId   db_column: customer_id */ 	
	private String customerId;
	/** itemId   db_column: item_id */ 	
	private String itemId;
	/** quantity   db_column: quantity */ 	
	private String quantity;
	//columns END

	public Order(){
	}

	public Order(
		String id
	){
		this.id = id;
	}

	public void setId(String value) {
		this.id = value;
	}
	public String getId() {
		return this.id;
	}
	public void setCustomerId(String value) {
		this.customerId = value;
	}
	public String getCustomerId() {
		return this.customerId;
	}
	public void setItemId(String value) {
		this.itemId = value;
	}
	public String getItemId() {
		return this.itemId;
	}
	public void setQuantity(String value) {
		this.quantity = value;
	}
	public String getQuantity() {
		return this.quantity;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Order == false) return false;
		if(this == obj) return true;
		Order other = (Order)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

