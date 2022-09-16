package com.handball.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.handball.demo.Model.Referee;
import com.handball.demo.service.RefereeService;



	@CrossOrigin(origins = "http://localhost:4200")
	@RestController
	public class RefereeController {
		
		@Autowired
		private RefereeService service;
		
		@PostMapping("/admin/addReferee")
		public Referee addReferee(@RequestBody Referee referee) {
			return service.saveReferee(referee);
		}
		
		@GetMapping("admin/viewReferee")
		public List<Referee> findAcademy(){
			return service.showReferee();
		}
		
		@PutMapping("/admin/updateReferee")
		public Referee updateReferee(@RequestBody Referee referee){
			return service.updateReferee(referee);
		}
		
		@DeleteMapping("/admin/deleteReferee")
		public void deleteReferee(@RequestParam int id) {
				service.deleteReferee(id);	
		}
		
		@GetMapping("/admin/getReferee")
		public Optional<Referee> getRefereeById(@RequestParam int id) {
			return service.getRefereeId(id);
		}


}
