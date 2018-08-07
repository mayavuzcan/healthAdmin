package com.demo.postgresdemo;

public class Health {
	
	String name = "cardakay";
	Integer kod =123;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getKod() {
		return kod;
	}
	public void setKod(Integer kod) {
		this.kod = kod;
	}
	
	@Override
	public String toString() {
		return "Health [name=" + name + ", kod=" + kod + ", getName()=" + getName() + ", getBrkod()=" + getKod()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
	