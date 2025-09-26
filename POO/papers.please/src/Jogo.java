import java.time.LocalDate;

public class Jogo {
    private LocalDate diaAtual;
    private int saldo;
    private int acertos;
    private int erros;

    public Jogo() {
        this.diaAtual = LocalDate.of(1982, 11, 23);
        this.acertos = 0;
        this.erros = 0;
        this.saldo = 500;
    }

    public void avancarParaProximoDia() {
        this.diaAtual = this.diaAtual.plusDays(1);
        System.out.println("\n ====== DIA" + (this.diaAtual.toEpochDay() - LocalDate.of(1982, 11, 23).toEpochDay() + 1) + ": " + this.diaAtual + " ======");
        iniciarDia();
    }
    public void iniciarDia() {
        long tempoLimite = System.currentTimeMillis() + (60 * 1000); //60 segundos
        while (System.currentTimeMillis() < tempoLimite) {
            processarProximoImigrante();
            if (System.currentTimeMillis() >= tempoLimite) {
                break;
            }
        }
        finalizarDia();
    }

    private void processarProximoImigrante() {
        Imigrante imigrante = GeradorDeImigrantes.gerarImigrantesAleatorio();
        System.out.println("\nPróximo imigrante: " + imigrante.getNomeCompleto());

        boolean jogadorEncontrouErro = false;

        //Try-catch para docs faltando
        try {
            Documento passaporte = imigrante.getDocumentosPorTipo("passaporte");
            if (passaporte.geTipo())
        }
    }
}
