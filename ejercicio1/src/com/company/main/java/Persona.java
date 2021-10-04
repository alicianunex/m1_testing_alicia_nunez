package com.company.main.java;

public class Persona
{
    private final String nombre;
    private final int telefono;
    private final short codigo;


    public String getNombre()
    {
        return this.nombre;
    }

    public int getTelefono()
    {
        return this.telefono;
    }

    public short getCodigo()
    {
        return this.codigo;
    }

    public Persona(String nombre,int telefono, short codigo)
    {
        this.nombre=nombre;
        this.telefono=telefono;
        this.codigo=codigo;
    }
}
