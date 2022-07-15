public class FormSolicitacaoEquipamentos {
    private String equipamentos;
    private String motivo;
    private String enderecoEntrega;
    private boolean chamadoAberto;

    public FormSolicitacaoEquipamentos(String equipamentos, String motivo, String enderecoEntrega) {
        this.equipamentos = equipamentos;
        this.motivo = motivo;
        this.enderecoEntrega = enderecoEntrega;
    }

    public boolean isChamadoAberto() {
        return chamadoAberto;
    }

    public void  abrirChamadoSolicitacaoEquipamentos(){
        this.chamadoAberto = true;
    }
    public void  fecharChamadoSolicitacaoEquipamentos(){
        this.chamadoAberto = false;
    }
}
