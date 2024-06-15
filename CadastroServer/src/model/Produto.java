/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import ProdutoId.ProdutoId;
import java.io.Serializable;
import javax.persistence.*;

// Entidade JPA Produto

/**
 *
 * @author zamor
 */
@Entity
@Table(name = "PRODUTO") // Nome da tabela no banco de dados
@IdClass(ProdutoId.class) // Indica o uso de ProdutoId como identificador composto
public class Produto implements Serializable {
    @Id
    @Column(name = "ID") // Nome do campo na tabela
    private Long id; // Campo de identificador da entidade Produto

    @Column(name = "NOME") // Nome do campo na tabela
    private String nome;

    @Column(name = "PRECO") // Nome do campo na tabela
    private double preco;

    // Construtor vazio (obrigatório para entidades JPA)
    public Produto() {
    }

    // Construtor com parâmetros
    public Produto(Long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos getter e setter para todos os campos
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Métodos equals e hashCode para comparar Produtos
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Produto other = (Produto) obj;
        return id != null && id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
