import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    void setUp(){
        funcionario = new Funcionario("Jose");
    }

    @Test
    void deveAbrirChamadoSolicitacaoEquipamentos(){
        FormSolicitacaoEquipamentos formSolicitacaoEquipamentos = new FormSolicitacaoEquipamentos("Notebook","Necessidade", "Rua dos bobos n°0");
        Solicitacao solicitacaoEquipamento = new AberturaSolicitacaoEquipamento(formSolicitacaoEquipamentos);
        funcionario.executarSolicitacao(solicitacaoEquipamento);

        assertTrue(formSolicitacaoEquipamentos.isChamadoAberto());
    }

    @Test
    void deveFecharChamadoSolicitacaoEquipamentos(){
        FormSolicitacaoEquipamentos formSolicitacaoEquipamentos = new FormSolicitacaoEquipamentos("Notebook","Necessidade", "Rua dos bobos n°0");
        Solicitacao solicitacaoEquipamento = new FechamentoSolicitacaoEquipamento(formSolicitacaoEquipamentos);
        funcionario.executarSolicitacao(solicitacaoEquipamento);

        assertFalse(formSolicitacaoEquipamentos.isChamadoAberto());
    }

    @Test
    void deveCancelarFechamentoSolicitacaoEquipamentos(){
        FormSolicitacaoEquipamentos formSolicitacaoEquipamentos = new FormSolicitacaoEquipamentos("Notebook","Necessidade", "Rua dos bobos n°0");

        Solicitacao aberturaSolicitacaoEquipamento = new AberturaSolicitacaoEquipamento(formSolicitacaoEquipamentos);
        Solicitacao fechamentoSolicitacaoEquipamento = new FechamentoSolicitacaoEquipamento(formSolicitacaoEquipamentos);


        funcionario.executarSolicitacao(aberturaSolicitacaoEquipamento);
        funcionario.executarSolicitacao(fechamentoSolicitacaoEquipamento);

        funcionario.cancelarUltimaSolicitacao();

        assertTrue(formSolicitacaoEquipamentos.isChamadoAberto());
    }
}