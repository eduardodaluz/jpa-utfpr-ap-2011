package control;

import model.Cidade;

public class CidadeCtrl extends PadraoCtrl {
    
    public void incluir(Cidade cidade) {
        abrirTransacao();
        em.persist(cidade);
        concluirTransacao();
    }
    
    public void deletar(Cidade cidade) {
        abrirTransacao();
        em.remove(cidade);
        concluirTransacao();
    }
    
    public void alterar(Cidade cidade) {
        abrirTransacao();
        em.refresh(cidade);
        concluirTransacao();
    }
    
}
