
package escolasis.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import escolasis.modelo.xml.ListaPessoaInsert;

@XmlRootElement(name = "CadastrarListaPessoasResponse", namespace = "http://ws.escolasis/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CadastrarListaPessoasResponse", namespace = "http://ws.escolasis/")
public class SalvarResponse {

    @XmlElement(name = "pessoas", namespace = "")
    private ListaPessoaInsert pessoas;

    /**
     * 
     * @return
     *     returns ListaPessoaInsert
     */
    public ListaPessoaInsert getPessoas() {
        return this.pessoas;
    }

    /**
     * 
     * @param pessoas
     *     the value for the pessoas property
     */
    public void setPessoas(ListaPessoaInsert pessoas) {
        this.pessoas = pessoas;
    }

}
