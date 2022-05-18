package br.com.alura.loja.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "produtos")
public class Produto {

    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;

}
