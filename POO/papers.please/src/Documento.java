import java.time.LocalDate;

public abstract class Documento {
        private String nomeCompleto;
        private LocalDate dataDeValidade;
        private boolean estaCerto;
        //2025-05-20



    public Documento(String nomeCompleto, LocalDate dataDeValidade, boolean estaCerto) {
        this.nomeCompleto = nomeCompleto;
        this.dataDeValidade = dataDeValidade;
        this.estaCerto = estaCerto;
    }

    //Verifica se o documento está vencido, usando a data do jogo
    public boolean estaValido(LocalDate dataDoJogo) {
            return dataDoJogo.isBefore(this.dataDeValidade) || dataDoJogo.isEqual(this.dataDeValidade);
    }

    //Metodo abstrato pras subclasses implementarem
    public abstract boolean verificarLegalidade(String nomeImigrante);



        /*public boolean estaValido() {
            //Todo documento terá este método, que sempre terá, mínimamente, esta estrutura:
            LocalDate hoje = LocalDate.now();
            //.isBefore significa que tudo que for antes da data de dataDeValidade é válido.
            if (hoje.isBefore(getDataDeValidade())) {
                System.out.println("O documento ainda está válido (vence em " + getDataDeValidade() + ").");
                return true;
            }
            //.isEqual significa tudo que for NO DIA da data de dataDeValidade é válido.
            else if (hoje.isEqual(getDataDeValidade())) {
                System.out.println("O documento vence HOJE (" + getDataDeValidade() + ").");
                return true;
            }
            //Tudo que passar da data de dataDeValidade é inválido
            else {
                System.out.println("O documento está EXPIRADO (venceu em " + getDataDeValidade() + ").");
                return false;
            }
        }*/

        public abstract boolean verificarLegalidade(Imigrante dadosImigrante);
        //Todos documentos devem ter este metodo, mas ele varia a cada subclasse devido seus diferentes atributos


        public String getNomeCompleto() {
            return nomeCompleto;
        }

        @Override
    public String toString() {
            return "Documento{" +"nome completo='" + nomeCompleto + "', validade=" + dataDeValidade + "}";
        }

}