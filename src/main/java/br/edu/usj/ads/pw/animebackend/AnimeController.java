package br.edu.usj.ads.pw.animebackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
;

@Controller
@ResponseBody
@CrossOrigin
public class AnimeController {

    @Autowired
    AnimeRepository animeRepository;

    @GetMapping(value = "/")
    public List<Anime> getListarTodos() {
        List<Anime> lista = animeRepository.findAll();
        return lista;
    }

    @GetMapping(value = "/detalhes/{id}")
    public Anime getDetalhes(@PathVariable Long id) {
        Anime anime = new Anime();
        anime = animeRepository.findById(id).get();
        return anime;
    }

    @PostMapping(value = "/adicionar")
    public Anime postAdicionar(@RequestBody Anime anime) {
        Anime animeNovo = animeRepository.save(anime);
        return animeNovo;
    }

    @GetMapping(value = "/deletar/{id}")
    public void getDeletar(@PathVariable Long id) {
        animeRepository.deleteById(id);
    }
}