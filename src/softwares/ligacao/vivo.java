package softwares.ligacao;

public class vivo implements AparelhoTelefonico{
    
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

}
