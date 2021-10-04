package com.company.main.java;

import java.io.*;
import java.util.*;


public class Agenda
{
    public static void main(String[] args) throws IOException
    {
        Vector<Persona> miagenda;
        miagenda = new Vector<>();
        Persona contacto = null;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); int opcion;
        while (true)
        {
            mostrarMenu(); System.out.println("Introduzca una opcion"); opcion = Integer.parseInt(lector.readLine()); switch (opcion)
        {
            case 1:
                String nom;
                int tlf,cod;
                System.out.println("Introduzca nombre:"); nom = lector.readLine(); System.out.println("Introduzca Telefono:"); tlf = Integer.parseInt(lector.readLine()); System.out.println("Introduzca Codigo:"); cod = Integer.parseInt(lector.readLine()); contacto=new Persona(nom,tlf,(short)cod); miagenda.addElement(contacto);
                break;
            case 2:
                for (int i=0; i< miagenda.size(); i++)
                {
                    contacto = miagenda.elementAt(i);
                    System.out.println("Contacto: "+contacto.getNombre()+", Telefono: " +contacto.getTelefono()+", Codigo: "+contacto.getCodigo());
                }
                break;
            case 3:
                int codigo;
                String nombre;
                int seleccion;
                System.out.println("Seleccione una opcion de busqueda"); System.out.println("\n1.-Nombre");
                System.out.println("2.- Codigo"); seleccion=Integer.parseInt(lector.readLine());
                boolean encontrado = false;
                switch (seleccion) {
                    case 1 -> {
                        System.out.println("Introduzca el NOMBRE a buscar");
                        nombre = lector.readLine();
                        for (int i = 0; i < miagenda.size(); i++) {
                            contacto = miagenda.elementAt(i);
                            if (contacto.getNombre().equals(nombre)) {
                                encontrado = true;
                                break;
                            }
                        }
                        if (encontrado) {
                            System.out.println("Contacto: " + contacto.getNombre() + ", Telefono: " + contacto.getTelefono() + ", Codigo: " + contacto.getCodigo());
                        } else {
                            System.out.println("No se ha encontrado el contacto");
                        }
                    }
                    case 2 -> {
                        System.out.println("Introduzca el codigo a buscar");
                        codigo = Integer.parseInt(lector.readLine());
                        for (int i = 0; i < miagenda.size(); i++) {
                            contacto = miagenda.elementAt(i);
                            if (contacto.getCodigo() == (short) codigo) {
                                encontrado = true;
                                break;
                            }
                        }
                        if (encontrado) {
                            System.out.println("Contacto: " + contacto.getNombre() + ", Telefono: " + contacto.getTelefono() + ", Codigo: " + contacto.getCodigo());
                        } else {
                            System.out.println("No se ha encontrado el contacto");
                        }
                    }
                    default -> System.out.println("Opcion Incorrecta");
                }
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion escrita incorrecta"); }
        }
    }
    public static void mostrarMenu()

    {
        System.out.println("\n1.-Insertar Contacto"); System.out.println("2.-Mostrar Contactos"); System.out.println("3.-Buscar Contacto"); System.out.println("4.-Salir\n");
    }
}
