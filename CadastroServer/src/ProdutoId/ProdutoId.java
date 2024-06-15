/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProdutoId;

import java.io.Serializable;
import javax.persistence.*;

// Classe de identificador composto para a entidade Produto
public class ProdutoId implements Serializable {
    @Column(name = "ID")
    private Long id;

    // Construtor vazio (obrigatório para entidades JPA)
    public ProdutoId() {
    }

    // Construtor com parâmetros
    public ProdutoId(Long id) {
        this.id = id;
    }

    // Métodos getter e setter para o campo id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Métodos equals e hashCode para comparar ProdutoIds
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        ProdutoId other = (ProdutoId) obj;
        return id != null && id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
