package com.demo.postgresdemo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.demo.postgresdemo.model.Medicine;
import com.demo.postgresdemo.repository.MedicineRepository;	

public class MedicineService {

	
	private static HashMap<Integer,Medicine> medicineHashMap=getMedicineHashMap();
	MedicineRepository medicineRepository;
	
	
public MedicineService() {
	super ();
	
}


public static int getMaximumId() {
    int max = 0;
    for (int id : medicineHashMap.keySet()) {
        if (max <= id) {
            max = id;
        }
    }
    return max;
}
public static HashMap<Integer, Medicine> getMedicineHashMap() {
    return medicineHashMap;
}
public List<Medicine> getAllMedicine() {
    List<Medicine> medicines = new ArrayList<Medicine>(medicineHashMap.values());
    return medicines;
}
public Medicine getMedicine(int id) {
	
	Medicine medicine = medicineHashMap.get(id);
    return medicine;
}
public Medicine ekleMedicine(Medicine medicine) {
	medicine.setId((long) (getMaximumId() + 1));
	medicineHashMap.put((int) medicine.getId(), medicine);
    return medicine;
}
public Medicine guncelleMedicine(Medicine medicine) {
    if (medicine.getId() <= 0)
        return null;
    medicineHashMap.put((int) medicine.getId(), medicine);
    return medicine;
}



public void silMedicine(int id) {
	medicineHashMap.remove(id);
}
	
}
