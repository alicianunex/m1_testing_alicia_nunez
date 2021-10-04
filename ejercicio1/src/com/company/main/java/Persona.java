package com.company.main.java;

import java.util.ArrayList;
import java.util.List;

public class Persona
{
    private String nombre;
    private int telefono;
    private short codigo;


    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nom) {
        this.nombre = nom;
    }
    public int getTelefono()
    {
        return this.telefono;
    }
    public void setTelefono(int tlf)
    {
        this.telefono = tlf;
    }
    public short getCodigo()
    {
        return this.codigo;
    }
    public void setCodigo(short cod)
    {
        this.codigo = cod;
    }
    public Persona(String nombre,int telefono, short codigo)
    {
        this.nombre=nombre;
        this.telefono=telefono;
        this.codigo=codigo;
    }
}