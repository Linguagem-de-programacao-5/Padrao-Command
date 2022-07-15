public class AberturaSolicitacaoEquipamento implements Solicitacao{
    private FormSolicitacaoEquipamentos solicitacao;

    public AberturaSolicitacaoEquipamento(FormSolicitacaoEquipamentos solicitacao) {
        this.solicitacao = solicitacao;
    }

    @Override
    public void executar() {
        this.solicitacao.abrirChamadoSolicitacaoEquipamentos();
    }

    @Override
    public void cancelar() {
        this.solicitacao.fecharChamadoSolicitacaoEquipamentos();
    }
}
