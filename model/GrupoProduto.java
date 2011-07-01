package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GrupoProduto {
    
    @Id
    private int id;
    
    @Column
    private String descricao;
    
}
