/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.geekaton.eccommerce.service.iProducDataService;

import com.geekaton.eccommerce.DTO.ProducDataDTO;
import java.util.List;
import com.geekaton.eccommerce.model.ProducData;

/**
 *
 * @author stevenfranco
 */
public interface IProducDataService {
    
    public List<ProducDataDTO> findAllProducDatas();
    public ProducDataDTO updateProducData(ProducDataDTO producDataDTO, Long id);
    public ProducDataDTO deleteProducDataById(Long id);
    public ProducData saveProducData(ProducData producData);
    
}
