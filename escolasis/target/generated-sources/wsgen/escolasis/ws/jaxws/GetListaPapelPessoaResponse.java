
package escolasis.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import escolasis.modelo.xml.ListaPapelPessoa;

@XmlRootElement(name = "papeis", namespace = "http://ws.escolasis/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "papeis", namespace = "http://ws.escolasis/")
public class GetListaPapelPessoaResponse {

    @XmlElement(name = "papel", namespace = "")
    private ListaPapelPessoa papel;

    /**
     * 
     * @return
     *     returns ListaPapelPessoa
     */
    public ListaPapelPessoa getPapel() {
        return this.papel;
    }

    /**
     * 
     * @param papel
     *     the value for the papel property
     */
    public void setPapel(ListaPapelPessoa papel) {
        this.papel = papel;
    }

}
