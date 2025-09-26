import java.util.List;

public class Imigrante {
    private String nomeCompleto;
    private String nacionalidade;
    private List<Documento> documentos;
    private boolean deveSerAceito;

    public Imigrante(String nomeCompleto, String nacionalidade, List<Documento> documentos, boolean deveSerAceito) {
        this.nomeCompleto = nomeCompleto;
        this.nacionalidade = nacionalidade;
        this.documentos = documentos;
        this.deveSerAceito = deveSerAceito;
    }


    public List<Documento> getDocumentos() {
        return documentos;
    }
    public boolean isDeveSerAceito() {
        return deveSerAceito;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
}
