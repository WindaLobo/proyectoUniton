package com.windar.BaseDatos;

public class BaseDeDatos{
    private String nombre;
    private Integer edad;
     private static BaseDeDatos instance = null;
       private BaseDeDatos() {
    }
    public static BaseDeDatos getInstance() {

        if (instance == null) {

            instance = new BaseDeDatos();
        }
               return instance;
    }

    public void setEdad(Integer edad) {

           this.edad = edad;
    }


    public void setNombre(String nombre) {

           this.nombre = nombre;
    }
}