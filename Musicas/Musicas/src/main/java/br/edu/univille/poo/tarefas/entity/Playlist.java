package br.edu.univille.poo.tarefas.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    @ManyToMany
    private List<Musica> musicas;
    @ManyToMany
    private List<Perfil> perfil_ouvinte;
    @ManyToOne
    private Perfil perfil_dono;
}
