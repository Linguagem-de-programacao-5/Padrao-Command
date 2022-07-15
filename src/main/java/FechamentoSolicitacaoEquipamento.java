public class FechamentoSolicitacaoEquipamento implements Solicitacao{
    private FormSolicitacaoEquipamentos solicitacao;

    public FechamentoSolicitacaoEquipamento(FormSolicitacaoEquipamentos solicitacao) {
        this.solicitacao = solicitacao;
    }

    @Override
    public void executar() {
        this.solicitacao.fecharChamadoSolicitacaoEquipamentos();
    }

    @Override
    public void cancelar() {
        this.solicitacao.abrirChamadoSolicitacaoEquipamentos();
    }
}
