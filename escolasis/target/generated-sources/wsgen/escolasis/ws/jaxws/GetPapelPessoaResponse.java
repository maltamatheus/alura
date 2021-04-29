
package escolasis.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import escolasis.modelo.PapelPessoa;

@XmlRootElement(name = "ObterPapelDePessoaPorIdResponse", namespace = "http://ws.escolasis/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObterPapelDePessoaPorIdResponse", namespace = "http://ws.escolasis/")
public class GetPapelPessoaResponse {

    @XmlElement(name = "papel", namespace = "")
    private PapelPessoa papel;

    /**
     * 
     * @return
     *     returns PapelPessoa
     */
    public PapelPessoa getPapel() {
        return this.papel;
    }

    /**
     * 
     * @param papel
     *     the value for the papel property
     */
    public void setPapel(PapelPessoa papel) {
        this.papel = papel;
    }

}
