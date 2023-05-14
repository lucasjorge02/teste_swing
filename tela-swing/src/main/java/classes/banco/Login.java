/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.banco;

/**
 *
 * @author LUCAS
 */
public class Login {

    private String email, senha;
    private Integer fkEmpresa, firstAcess, statusFuncionario;
    
    public Login() {
    }

    public Integer getFirstAcess() {
        return firstAcess;
    }

    public void setFirstAcess(Integer firstAcess) {
        this.firstAcess = firstAcess;
    }

    public Integer getStatusFuncionario() {
        return statusFuncionario;
    }

    public void setStatusFuncionario(Integer statusFuncionario) {
        this.statusFuncionario = statusFuncionario;
    }
    
    public Integer getFkEmpresa() {
        return fkEmpresa;
    }

    public void setFkEmpresa(Integer fkEmpresa) {
        this.fkEmpresa = fkEmpresa;
    }
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return String.format("""
                             ------ Login ------
                             Email: %s
                             Senha: %s
                             fkEmpresa: %d
                             firstAcess: %d
                             statusFuncionario: %d
                             """, email, senha, fkEmpresa, firstAcess, statusFuncionario);
    }
    
    
    
}
