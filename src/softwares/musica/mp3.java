package softwares.musica;

public class mp3 implements ReprodutorMusical{
    @Override
    public void Tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void Pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void SelecionarMusica() {
        System.out.println("Musica selecionada");
    }

}
