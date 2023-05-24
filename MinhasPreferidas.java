package br.com.desafio2.audio.TipoDeReprodutores;

import br.com.desafio2.audio.Audio.Audio;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " É considerado top das paradas ");
        } else {
            System.out.println(audio.getTitulo() + " Musica bem avaliada ");
        }
    }
}
