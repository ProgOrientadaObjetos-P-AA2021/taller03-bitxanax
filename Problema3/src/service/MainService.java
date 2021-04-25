/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Institucion;

/**
 *
 * @author bitxanax
 */
public class MainService {
    public static void main(String[] args) {
        Institucion institucion = new Institucion();
        institucion.setCantidadAlumnos(20);
        institucion.setCantidadDocentes(1);
        institucion.setCantidadSedes(1);
        institucion.setNombre("Nuestra señora del Rosario");
        institucion.setTipoInsitucion("Fiscal");
        
    }
}
