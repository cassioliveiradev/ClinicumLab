package br.com.clinicumlab.dao;

import br.com.clinicumlab.modelo.Orcamento;
import java.io.Serializable;

/**
 * Classe que contém métodos específicos que podem ser usados para fornecer
 * serviços relacionados à comunicação com o banco de dados. Essa classe, ainda,
 * herda todos os métodos abstratos da classe.
 * 
 * @see DaoAbstrato
 * 
 * @author elisangela <elysangeladesouza@gmail.com>
 */
public class OrcamentoDao extends DaoAbstrato<Orcamento> implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    public OrcamentoDao() {
        super(Orcamento.class);
    }
    
}
