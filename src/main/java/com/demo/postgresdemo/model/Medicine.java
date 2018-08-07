package com.demo.postgresdemo.model;

import javax.persistence.*;


@Entity
@Table(name = "medicine")
public class Medicine  {
	
	 
	
	
	 @Id
	 @Column(name="id")  //Alttaki tanımlanan değişkenin veri tabanındaki karşılığı belirtiliyor
	 private Long id;	
	 @Column(name="medicine_name")
	 private String medicineName;
	 
	 public Medicine() {
		 super();
			
		}
	 
	 //Constructor oluşturuluyor
	 public Medicine (Long id, String medicineName) {
			this.id=id;
			this.medicineName=medicineName;
		}
	 
	 
	 //Get ve Set metodları oluşturuluyor
	 
	 public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	
	 
	@Override
	public String toString() {
		return id+" "+medicineName;
	}
	

}
