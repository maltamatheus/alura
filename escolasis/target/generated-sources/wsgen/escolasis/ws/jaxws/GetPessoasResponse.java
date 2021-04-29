
package escolasis.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import escolasis.modelo.xml.ListaPessoa;

@XmlRootElement(name = "ObterPessoasResponse", namespace = "http://ws.escolasis/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObterPessoasResponse", namespace = "http://ws.escolasis/")
public class GetPessoasResponse {

    @XmlElement(name = "pessoas", namespace = "")
    private ListaPessoa pessoas;

    /**
     * 
     * @return
     *     returns ListaPessoa
     */
    public ListaPessoa getPessoas() {
        return this.pessoas;
    }

    /**
     * 
     * @param pessoas
     *     the value for the pessoas property
     */
    public void setPessoas(ListaPessoa pessoas) {
        this.pessoas = pessoas;
    }

}
