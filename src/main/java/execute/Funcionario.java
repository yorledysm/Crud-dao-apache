/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package execute;

/**
 *
 * @author HP
 */
public class Funcionario {
     private int idFuncionarid;
    private String tipoIdenti;
    private String numeroIdent;
    private String nombre;
    private String apellido;
    private String estadoCivil;
    private String sexo;
    private String direccion;
    private String telefono;
    private String fechaNaciomiento;

    public int getIdFuncionarid() {
        return idFuncionarid;
    }

    public void setIdFuncionarid(int idFuncionarid) {
        this.idFuncionarid = idFuncionarid;
    }

    public String getTipoIdenti() {
        return tipoIdenti;
    }

    public void setTipoIdenti(String tipoIdenti) {
        this.tipoIdenti = tipoIdenti;
    }

    public String getNumeroIdent() {
        return numeroIdent;
    }

    public void setNumeroIdent(String numeroIdent) {
        this.numeroIdent = numeroIdent;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNaciomiento() {
        return fechaNaciomiento;
    }

    public void setFechaNaciomiento(String fechaNaciomiento) {
        this.fechaNaciomiento = fechaNaciomiento;
    }

    
    
    
    
    
  
    @Override
    public String toString() {
        return "Funcionario{" + "funcionario_id=" + idFuncionarid + ", nombres=" + nombre + '}';
    }

 
}
