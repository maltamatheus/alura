
package escolasis.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ObterPapelDePessoaPorId", namespace = "http://ws.escolasis/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObterPapelDePessoaPorId", namespace = "http://ws.escolasis/")
public class GetPapelPessoa {

    @XmlElement(name = "idPapelPessoa", namespace = "")
    private Long idPapelPessoa;

    /**
     * 
     * @return
     *     returns Long
     */
    public Long getIdPapelPessoa() {
        return this.idPapelPessoa;
    }

    /**
     * 
     * @param idPapelPessoa
     *     the value for the idPapelPessoa property
     */
    public void setIdPapelPessoa(Long idPapelPessoa) {
        this.idPapelPessoa = idPapelPessoa;
    }

}
