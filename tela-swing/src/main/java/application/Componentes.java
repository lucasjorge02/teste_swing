/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

/**
 *
 * @author LUCAS
 */
public class Componentes {

    private String nome, unidadeMedida;
    private Integer id;
    public Componentes(Integer id, String nome, String unidadeMedida) {
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
    public Componentes() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    @Override
    public String toString() {
        return "Componentes{" + "nome=" + nome + ", unidadeMedida=" + unidadeMedida + ", id=" + id + '}';
    }
    
}
