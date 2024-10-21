package softwares.smartphone;

import softwares.internet.NavegadorInternet;
import softwares.ligacao.AparelhoTelefonico;
import softwares.musica.ReprodutorMusical;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{

    @Override
    public void Ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void Atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void IniciarCorreioDeVoz() {
        System.out.println("Ouvindo Correio de voz");
    }

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

    @Override
    public void ExibirPagina() {
       System.out.println("Navegagndo na intermet");
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("Atualizando pagina de internet");
    }

    @Override
    public void AtualizarNovaAba() {
        System.out.println("Abrindo nova aba de navegação");
    }

}
