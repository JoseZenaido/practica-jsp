/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.model;

/**
 *
 * @author TICLAB1
 */
public class Hotel {
    
    private int id;
    private String nombre;
    private String descripcion;
    private int categoria;
    private String domicilio;
    
    
    public  Hotel(int id, String nombre, String descripsion,int categoria, String domicilio){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripsion;
        this.categoria=categoria;
        this.domicilio=domicilio;
        
    }
    public Hotel(){
        this(0,"", "",0,"");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescribsion(String describsion) {
        this.descripcion = descripcion;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Hotel{" + "id=" + id + ", nombre=" + nombre + ", describsion=" + descripcion + ", categoria=" + categoria + ", domicilio=" + domicilio + '}';
    }
    
    
}
