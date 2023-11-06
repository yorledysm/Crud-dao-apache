/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import data.FuncionarioDao;
import execute.Funcionario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HP
 */
public class ControllerFuncionario {
    private FuncionarioDao funcioDao;

    public ControllerFuncionario() {
        
        funcioDao = new FuncionarioDao();
    }
    
    public List<Funcionario> obtenerFuncionarios() throws SQLException{
        
        return funcioDao.obtenerFuncionarios();
    }
    
    public void crear(Funcionario func) throws SQLException {
        funcioDao.crear(func);
    }
    
    public Funcionario obtenerFuncionario(int id) throws SQLException {
        return funcioDao.obtenerFuncionario(id);
    }
    
    public void actualizarFuncionario(int id, Funcionario func) throws SQLException {
        funcioDao.actualizarFuncionario(id, func);
    }
    
    public void eliminarFuncionario(int id) throws SQLException {
        funcioDao.eliminarFuncionario(id);
    }
}
