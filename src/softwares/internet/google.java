package softwares.internet;

public class google implements NavegadorInternet{

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
