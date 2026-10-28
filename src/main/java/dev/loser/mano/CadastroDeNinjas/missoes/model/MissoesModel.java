package dev.loser.mano.CadastroDeNinjas.missoes.model;

import dev.loser.mano.CadastroDeNinjas.ninjas.model.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cad_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dificuldade;

    //Uma unica missão tem muitos ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;




}
