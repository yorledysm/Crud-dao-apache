/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionarioiud;

import controller.ControllerFuncionario;
import execute.Funcionario;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Classfunci {
     
    public static void crear( ControllerFuncionario  funcControl) {
        try {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Digite el tipo de documednto: ");
            String tipoD = sc.nextLine();
            System.out.println("Tipo de documento: "+tipoD);
            System.out.println("=======================================");
            
            System.out.println("Digite el numero de documednto: ");
            String numeroD = sc.nextLine();
            System.out.println("Numero de documento: "+numeroD);
            System.out.println("=======================================");
            
            System.out.println("Digite el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Tipo de documento: "+nombre);
            System.out.println("=======================================");
            
            System.out.println("Digite el apellido: ");
            String apellido = sc.nextLine();
            System.out.println("Tipo de apellido: "+apellido);
            System.out.println("=======================================");
            
            System.out.println("Digite el estado_civil: ");
            String estado = sc.nextLine();
            System.out.println("Tipo de estado: "+estado);
            System.out.println("=======================================");
            
            System.out.println("Digite el sexo: ");
            String sexo = sc.nextLine();
            System.out.println("Tipo de sexo: "+sexo);
            System.out.println("=======================================");
            
            System.out.println("Digite el direccion: ");
            String dire = sc.nextLine();
            System.out.println("Tipo de dire: "+dire);
            System.out.println("=======================================");
            
             System.out.println("Digite el fec: ");
            String fec = sc.nextLine();
            System.out.println("Tipo de fec: "+fec);
            System.out.println("=======================================");
            
            System.out.println("Digite el numero  telefono: ");
            String tel = sc.nextLine();
            System.out.println("Telefono: "+tel);
            System.out.println("=======================================");
            
           
            
           
            
            Funcionario func = new Funcionario();
            func.setTipoIdenti(tipoD);
            func.setNumeroIdent(numeroD);
            func.setNombre(nombre);
            func.setApellido(apellido);
            func.setEstadoCivil(estado);
            func.setSexo(sexo);
            func.setDireccion(dire);
            func.setTelefono(tel);
            func.setFechaNaciomiento(fec);
            funcControl.crear(func);
            System.out.println("Funcionario creado correctamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void obtenerFuncionarios(ControllerFuncionario funcControl){
        
        try{
            List<Funcionario> func = funcControl.obtenerFuncionarios();
            if(func.isEmpty()){
                System.out.println("No hay funcionarios");
            } else {
                func.forEach(f -> {
                    System.out.println("id: "+f.getIdFuncionarid());
                    System.out.println("tipo: "+f.getTipoIdenti());
                    System.out.println("#: "+f.getNumeroIdent());
                    System.out.println("nombre: "+f.getNombre());
                    System.out.println("apellido: "+f.getApellido());
                    System.out.println("estado: "+f.getEstadoCivil());
                    System.out.println("sexo: "+f.getSexo());
                    System.out.println("dire: "+f.getDireccion());
                    System.out.println("tele: "+f.getTelefono());
                    System.out.println("fec: "+f. getFechaNaciomiento());
                    System.out.println("===========================================");
                    System.out.println("===========================================");
                });
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public static void eliminarFuncionario(ControllerFuncionario funcControl){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite la ID del funcionario a eliminar: ");
            int id = sc.nextInt();
            System.out.println("Funcionario a eliminar: "+id);
            
            Funcionario funcExiste = funcControl.obtenerFuncionario(id);
            if(funcExiste == null){
                System.out.println("La Id del funcionario no existe");
                return;
            }
            
            funcControl.eliminarFuncionario(id);
            System.out.println("Funcionario Eliminado exitosamente");
            obtenerFuncionarios(funcControl);
            
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
     public static void main(String[] args) {
         
        ControllerFuncionario funcControl = new ControllerFuncionario();
      //  crear(funcControl);
        // obtenerFuncionarios(funcControl);
        // eliminarFuncionario(funcControl);
        
        Main jframe = new Main();
        
        jframe.setVisible(true);
         
    }

   
}
