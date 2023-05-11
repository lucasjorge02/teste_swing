/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

/**
 *
 * @author LUCAS
 */
public class Empresa {
    private Integer statusEmpresa, qtdTotem;

    public Empresa() {
    }

    public Integer getStatusEmpresa() {
        return statusEmpresa;
    }

    public void setStatusEmpresa(Integer statusEmpresa) {
        this.statusEmpresa = statusEmpresa;
    }

    public Integer getQtdTotem() {
        return qtdTotem;
    }

    public void setQtdTotem(Integer qtdTotem) {
        this.qtdTotem = qtdTotem;
    }

    @Override
    public String toString() {
        return "Empresa{" + "statusEmpresa=" + statusEmpresa + ", qtdTotem=" + qtdTotem + '}';
    }

    
}
