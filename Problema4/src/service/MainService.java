/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import entity.Dispositivo;


/**
 *
 * @author bitxanax
 */
public class MainService {

    public static void main(String[] args) {
        Dispositivo device = new Dispositivo();
        device.setCosto(40);
        device.setImeiInfo("1253563345421");
        device.setMAC("14:4f:8a:ca:15:e8");
        device.setResolucion("450 x 500");
        device.setSistemaOperativo("Android Pie 9");
        
    }
}
