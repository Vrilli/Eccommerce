/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.geekaton.eccommerce.controller;

import com.geekaton.eccommerce.DTO.ProducDataDTO;
import com.geekaton.eccommerce.repository.iRepository.IProducDataRepository;
import com.geekaton.eccommerce.service.ProducDataService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.geekaton.eccommerce.model.ProducData;

/**
 *
 * @author stevenfranco
 */
@RestController
@CrossOrigin(origins= {"*"})
@RequestMapping("api/productdata")
public class ProducDataController {
    
    	@Autowired
	private ProducDataService producDataService;
	
	@Autowired
	public IProducDataRepository iProducDataRepository;
	
	@GetMapping
	public List<ProducDataDTO> findAllProducDatas(){
            System.out.println("controller");
            //System.out.println(producDataService.findAllProducDatas());
		return producDataService.findAllProducDatas();
	}
	
	@GetMapping("/{id}")
	public Optional<ProducDataDTO> findProducDataById(@PathVariable("id") Long id){
		return producDataService.findProducDataById(id);
	}
	
	@PutMapping("/{id}")
	public ProducDataDTO updateProducData(@RequestBody ProducDataDTO producDataDTO,@PathVariable("id") Long id){
		System.out.println(producDataDTO);
		return producDataService.updateProducData(producDataDTO , id);
	}
	
	@DeleteMapping("/{id}")
	public ProducDataDTO deleteProducData(@PathVariable("id") Long id){
		return producDataService.deleteProducDataById(id);
	}
	
	@PostMapping("")
	public ProducData saveProducData(@RequestBody ProducData producData) {
		System.out.println(producData);
		producDataService.saveProducData(producData);
		return producData;
	}
    
}
