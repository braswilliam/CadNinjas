package dev.loser.mano.CadastroDeNinjas.ninjas.model;

import dev.loser.mano.CadastroDeNinjas.missoes.model.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

//Entity transforma uma classe em uma entidade do DB
@Entity
@Table(name = "tb_cad_ninja")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private int idade;


    //Muitas missões para um único ninja.
    @ManyToOne
    @JoinColumn(name = "missoes_id") // chave estrangeira
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public Long getId() {
        return id;
    }

}
