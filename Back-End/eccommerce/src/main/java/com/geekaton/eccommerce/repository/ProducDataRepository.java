/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.geekaton.eccommerce.repository;

import com.geekaton.eccommerce.repository.iRepository.IProducDataRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.geekaton.eccommerce.model.ProducData;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stevenfranco
 */
@Repository
public class ProducDataRepository {
    
    @Autowired
private IProducDataRepository producDataRepository;

public List<ProducData> findProducDatas(){
    System.out.println("Aca");
    //System.out.println(producDataRepository.findAll());
    return producDataRepository.findAll();
}


public Optional<ProducData> findProducDataById(Long id){
    return producDataRepository.findById(id);
}

public ProducData saveProducData (ProducData producData) {
    return producDataRepository.save(producData);
}


public void deleteProducDataById(Long id){
    producDataRepository.deleteById(id);
}
    
}
