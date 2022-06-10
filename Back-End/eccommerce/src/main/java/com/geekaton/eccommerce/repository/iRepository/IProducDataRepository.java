/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.geekaton.eccommerce.repository.iRepository;

import com.geekaton.eccommerce.model.ProducData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author stevenfranco
 */
public interface IProducDataRepository extends JpaRepository<ProducData,Long>{
    
}
