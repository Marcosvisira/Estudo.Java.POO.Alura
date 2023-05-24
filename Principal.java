package Main;

import br.com.desafio2.audio.TipoDeReprodutores.MinhasPreferidas;
import br.com.desafio2.audio.TipoDeReprodutores.Musica;
import br.com.desafio2.audio.TipoDeReprodutores.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Call Out my Name");
        minhaMusica.setArtista("The Weeknd");
        minhaMusica.setGeneroMusical("R&B");
        minhaMusica.setAlbum("My Dear Melancholy,");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast podJava = new Podcast();
        podJava.setTitulo("PodCast PodJava");
        podJava.setApresentador("Marcos Ramos");
        podJava.setDescricao("""
                PodCast com o compromisso de auxiliar estudantes a ingressar no mundo do TI
                Apresentado por Marcos Ramos. Apresentador, estudante e rato de academia.""");

        for (int i = 0; i < 5000; i++) {
            podJava.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            podJava.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podJava);
        preferidas.inclui(minhaMusica);

    }


}
