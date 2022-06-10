/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.geekaton.eccommerce.service;

import com.geekaton.eccommerce.DTO.ProducDataDTO;
import com.geekaton.eccommerce.mapper.ProducDataMap;
import com.geekaton.eccommerce.repository.ProducDataRepository;
import com.geekaton.eccommerce.service.iProducDataService.IProducDataService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.geekaton.eccommerce.model.ProducData;

/**
 *
 * @author stevenfranco
 */
@Service
public class ProducDataService implements IProducDataService{
    
    @Autowired
private ProducDataRepository producDataRepository;
@Autowired
private ProducDataMap producDataMap;


@Override
public List<ProducDataDTO> findAllProducDatas() {
    // TODO Auto-generated method stub
    //System.out.println("service");
    //System.out.println(producDataMap.mappAllProducDatasToProducDatasDTOs(producDataRepository.findProducDatas()));
    return producDataMap.mappAllProducDatasToProducDatasDTOs(producDataRepository.findProducDatas());
    //return producDataRepository.findProducDatas();
}

public Optional<ProducDataDTO> findProducDataById(Long id){
    Optional<ProducData> oProducData = producDataRepository.findProducDataById(id);
    return Optional.of(producDataMap.mapProducDataToDTO(oProducData.get()));
}

@Override
public ProducDataDTO updateProducData(ProducDataDTO producDataDTO, Long id){
    
    Optional<ProducData> oProducData = producDataRepository.findProducDataById(id);
    if (oProducData.isPresent()) {
        
        if (producDataDTO.getPrecio()!= null) {
            oProducData.get().setPrecio(producDataDTO.getPrecio());
        }
        
        if (producDataDTO.getAmount()!= null) {
            oProducData.get().setAmount(producDataDTO.getAmount());
        }
                
        if (producDataDTO.getNombre() != null) {
            oProducData.get().setNombre(producDataDTO.getNombre());
        }
        
        if (producDataDTO.getImagen()!= null) {
            oProducData.get().setImagen(producDataDTO.getImagen());
        }
        

        return producDataMap.mapProducDataToDTO(producDataRepository.saveProducData(oProducData.get())) ;
    }
    return null;			
}

@Override
public ProducDataDTO deleteProducDataById(Long id) {
    // TODO Auto-generated method stub
    Optional<ProducData> producDataDeleted = producDataRepository.findProducDataById(id);
    if(producDataDeleted.isPresent()) {
        producDataRepository.deleteProducDataById(id);
        return producDataMap.mapProducDataToDTO(producDataDeleted.get());
        }
    return null;
}

@Override
public ProducData saveProducData(ProducData producData) {
    // TODO Auto-generated method stub
    producDataRepository.saveProducData(producData);
    return producData;
}

    
}
