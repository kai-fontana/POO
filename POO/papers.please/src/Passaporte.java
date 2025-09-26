import java.time.LocalDate;

public class Passaporte extends Documento {

    public Passaporte(String nomeCompleto, LocalDate validade) {
        super(nomeCompleto, validade);
    }

    public boolean verificarLegalidade(Imigrante dadosImigrante) {
        return false;
    }

    @Override
    public void exibirDocumentos() {

    }
}
