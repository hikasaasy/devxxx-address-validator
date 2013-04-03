package com.salesforce.cdev.webservices.common;

public class Difference {
	private String fieldName;
	private String expecting;
	private String received;
	
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getExpecting() {
		return expecting;
	}
	public void setExpecting(String expecting) {
		this.expecting = expecting;
	}
	public String getReceived() {
		return received;
	}
	public void setReceived(String received) {
		this.received = received;
	}
	
	// Constructor
	public Difference() {
		super();
	}
	public Difference(String fieldName, String expecting, String received) {
		super();
		this.fieldName = fieldName;
		this.expecting = expecting;
		this.received = received;
	}
}
