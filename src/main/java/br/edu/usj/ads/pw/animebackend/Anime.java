package br.edu.usj.ads.pw.animebackend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    String nome;
    String genero;
    String eps;

}
