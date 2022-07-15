import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private String nome;
    private List<Solicitacao> solicitacoes = new ArrayList<Solicitacao>();

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void executarSolicitacao(Solicitacao solicitacao) {
        this.solicitacoes.add(solicitacao);
        solicitacao.executar();
    }

    public void cancelarUltimaSolicitacao() {
        if (solicitacoes.size() != 0) {
            Solicitacao solicitacao = this.solicitacoes.get(this.solicitacoes.size() - 1);
            solicitacao.cancelar();
            this.solicitacoes.remove(this.solicitacoes.size() - 1);
        }
    }
}
