//Bu sınıf controller sınıfı crud işlemlerinin tanımlandığı yer

package com.demo.postgresdemo;

// import com.demo.postgresdemo.exception.ResourceNotFoundException;
import com.demo.postgresdemo.service.MedicineService; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.demo.postgresdemo.model.Medicine; 
import com.demo.postgresdemo.repository.MedicineRepository;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController

public class MedicineController {
	
	@Autowired
    MedicineRepository medicineRepository;
	
	MedicineService medicineService = new MedicineService();
	
	
	 @GetMapping("/medicine") 
	 
	 public List<Medicine> get() {
		 List<Medicine> medicine = (List<Medicine>) medicineRepository.findAll();

			return medicine; } 

	 
@PostMapping("/medicinewe") 
	 
	 public String get1() {
		 List<Medicine> medicine = (List<Medicine>) medicineRepository.findAll();

		 String name=medicine.get(0).getMedicineName();
		 
		 
			return name; } 


	 @GetMapping("/medicine/{id}") 
		
	 public ResponseEntity<?> get(@PathVariable(value = "id") Long id) {
			Optional<Medicine> medicine = medicineRepository.findById(id);
						
			return ResponseEntity.ok(medicine);		
					
			}

	 @PostMapping("/medicine")
	 public ResponseEntity<Medicine> update(@RequestBody Medicine medicine){
			Medicine newMedicine = new Medicine();
			if (medicine != null ) {

				newMedicine =medicineRepository.save(medicine);
			}
				
			return new ResponseEntity<Medicine>(newMedicine,HttpStatus.OK);
		}
	
	 
	 @DeleteMapping("/medicine/{id}")
	 public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
						medicineRepository.deleteById(id);

						return ResponseEntity.ok().build();		
			
					
			}

	 
 
}
