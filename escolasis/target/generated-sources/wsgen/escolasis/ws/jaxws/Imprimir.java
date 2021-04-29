
package escolasis.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import escolasis.modelo.xml.ListaPessoaInsert;

@XmlRootElement(name = "ImprimirPessoas", namespace = "http://ws.escolasis/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImprimirPessoas", namespace = "http://ws.escolasis/")
public class Imprimir {

    @XmlElement(name = "listaPessoas", namespace = "")
    private ListaPessoaInsert listaPessoas;

    /**
     * 
     * @return
     *     returns ListaPessoaInsert
     */
    public ListaPessoaInsert getListaPessoas() {
        return this.listaPessoas;
    }

    /**
     * 
     * @param listaPessoas
     *     the value for the listaPessoas property
     */
    public void setListaPessoas(ListaPessoaInsert listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

}
