package br.edu.univille.poo.tarefas.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Conta conta;

    private String nome;

    @ManyToOne
    private Plano plano;

    @Column (unique = true) //nome deve ser único
    private String Nomemusuario;

    private String senha;

}
