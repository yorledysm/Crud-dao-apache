/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import conexion.Conexion;
import execute.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author HP
 */
public class FuncionarioDao {
    private static final String getFuncionario = "select * from funcionario";
    private static final String createFuncionario = "INSERT INTO  funcionario( idFuncionario, tipoIdenti, numeroIdent, nombre, apellido, estadoCivil, sexo, direccion, telefono, fechaNaciomiento "
    + "values(?,?,?,?,?,?,?,?,? )";
    private static final String getFuncionarioId = "select * from funcionario where idFuncionario = ?";
    private static final String updateFuncionario = "update funcionarios set "
    + "tipoIdenti = ?, numeroIdent = ?, nombre = ?, apellido = ?,"
    + " estadoCivill = ?, sexo = ?, direccion = ?, telefono = ?, fechaNaciomiento = ? where idFuncionario = ?";
    private static final String deleteFuncionario = "delete from funcionario where idFuncionario = ?";

   
    
    
    
    
    
    
    
    public List<Funcionario> obtenerFuncionarios() throws SQLException {

        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;

        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            con = Conexion.getConnection();
            preparedStatement = con.prepareStatement(getFuncionario);
            result = preparedStatement.executeQuery();

            while (result.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario. setIdFuncionarid(result.getInt("idFuncionarid"));
                funcionario.setTipoIdenti(result.getString("tipoIdenti"));
                funcionario.setNumeroIdent(result.getString("numeroIdent"));
                funcionario.setNombre(result.getString("nombre"));
                funcionario.setApellido(result.getString("apellido"));
                funcionario.setEstadoCivil(result.getString("estadoCivil"));
                funcionario.setSexo(result.getString("sexo"));
                funcionario.setDireccion(result.getString("direccion"));
                funcionario.setTelefono(result.getString("telefono"));
                funcionario.setFechaNaciomiento(result.getString("fechaNaciomiento"));
                funcionarios.add(funcionario);

            }
            return funcionarios;
        } finally {
            if (con != null) {
                con.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (result != null) {
                result.close();
            }
        }

    }
     public void crear(Funcionario func) throws SQLException {
        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            con = Conexion.getConnection();
            preparedStatement = con.prepareStatement(createFuncionario);
            preparedStatement.setString(1, func.getTipoIdenti());
            preparedStatement.setString(2, func.getNumeroIdent());
            preparedStatement.setString(3, func.getNombre());
            preparedStatement.setString(4, func.getApellido());
            preparedStatement.setString(5, func.getEstadoCivil());
            preparedStatement.setString(6, func.getSexo());
            preparedStatement.setString(7, func.getDireccion());
            preparedStatement.setString(8, func.getTelefono());
            preparedStatement.setString(9, func.getFechaNaciomiento());
            preparedStatement.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

    public Funcionario obtenerFuncionario(int id) throws SQLException {
        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        Funcionario funcionario = null;

        try {
            con = Conexion.getConnection();
            preparedStatement = con.prepareStatement(getFuncionarioId);
            preparedStatement.setInt(1, id);
            result = preparedStatement.executeQuery();

            if (result.next()) {
                funcionario = new Funcionario();
                funcionario.setIdFuncionarid(result.getInt("idFuncionarid"));
                funcionario.setTipoIdenti(result.getString("tipoIdenti"));
                funcionario.setNumeroIdent(result.getString("setNumeroIdent"));
                funcionario.setNombre(result.getString("nombre"));
                funcionario.setApellido(result.getString("apellido"));
                funcionario.setEstadoCivil(result.getString("estadoCivil"));
                funcionario.setSexo(result.getString("sexo"));
                funcionario.setDireccion(result.getString("direccion"));
                funcionario.setTelefono(result.getString("telefono"));
                funcionario.setFechaNaciomiento(result.getString("fechaNaciomiento"));
            }
            return funcionario;
        } finally {
            if (con != null) {
                con.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (result != null) {
                result.close();
            }
        }
    }

    public void actualizarFuncionario(int id, Funcionario func) throws SQLException {

        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            con = Conexion.getConnection();
            preparedStatement = con.prepareStatement(updateFuncionario);
            preparedStatement.setString(1, func.getTipoIdenti());
            preparedStatement.setString(2, func.getNumeroIdent());
            preparedStatement.setString(3, func.getNombre());
            preparedStatement.setString(4, func.getApellido());
            preparedStatement.setString(5, func.getEstadoCivil());
            preparedStatement.setString(6, func.getSexo());
            preparedStatement.setString(7, func.getDireccion());
            preparedStatement.setString(8, func.getTelefono());
            preparedStatement.setString(9, func.getFechaNaciomiento());
            preparedStatement.setInt(10, id);
            preparedStatement.executeUpdate();
        } finally {
            if (con != null) {
                con.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }
    
    public void eliminarFuncionario(int id) throws SQLException {
         Connection con = null;
        PreparedStatement preparedStatement = null;
        
        try {
            
            con = Conexion.getConnection();
            preparedStatement = con.prepareStatement(deleteFuncionario);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            
        } finally {
             if (con != null) {
                con.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }
}
