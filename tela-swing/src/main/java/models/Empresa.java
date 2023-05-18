/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.banco;

/**
 *
 * @author LUCAS
 */
public class Empresa {
    private Integer statusEmpresa;

    public Empresa() {
    }

    public Integer getStatusEmpresa() {
        return statusEmpresa;
    }

    public void setStatusEmpresa(Integer statusEmpresa) {
        this.statusEmpresa = statusEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa{" + "statusEmpresa=" + statusEmpresa + '}';
    }

    
}
