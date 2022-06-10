/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.geekaton.eccommerce.mapper;

import com.geekaton.eccommerce.DTO.ProducDataDTO;
import com.geekaton.eccommerce.model.ProducData;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author stevenfranco
 */
@Mapper(componentModel = "spring")
public interface ProducDataMap {
    
    public List<ProducDataDTO> mappAllProducDatasToProducDatasDTOs(List<ProducData> ProducDataes);

    public ProducDataDTO mapProducDataToDTO(ProducData producData);
    
}
