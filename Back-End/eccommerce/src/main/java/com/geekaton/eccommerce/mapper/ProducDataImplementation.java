/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.geekaton.eccommerce.mapper;

import com.geekaton.eccommerce.DTO.ProducDataDTO;
import com.geekaton.eccommerce.model.ProducData;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author stevenfranco
 */
@Component
public class ProducDataImplementation implements ProducDataMap {
    
    @Autowired
private ModelMapper modelMapper;

    @Override
    public List<ProducDataDTO> mappAllProducDatasToProducDatasDTOs(List<ProducData> producDataes) {
        // TODO Auto-generated method stub

        if (producDataes==null){return null;}


        List<ProducDataDTO> producDatasDTO = new ArrayList<>();
        for (ProducData x:producDataes) {
            producDatasDTO.add(mapProducDataToDTO(x));
        }
        return producDatasDTO;
    }

    @Override
    public ProducDataDTO mapProducDataToDTO(ProducData producData) {
        // TODO Auto-generated method stub
        if (producData == null) {return null;}
        return modelMapper.map(producData, ProducDataDTO.class);

    }
    
}
