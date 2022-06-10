/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.geekaton.eccommerce.DTO;

import lombok.Data;

/**
 *
 * @author stevenfranco
 */
@Data
public class ProducDataDTO {
    

	private Long Id;

	private Long Precio;

	private Long Amount;

	private String Nombre;


	private String Imagen;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getPrecio() {
        return Precio;
    }

    public void setPrecio(Long Precio) {
        this.Precio = Precio;
    }

    public Long getAmount() {
        return Amount;
    }

    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    
}
