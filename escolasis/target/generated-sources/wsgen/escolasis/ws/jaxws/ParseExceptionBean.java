
package escolasis.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2.6
 * 
 */
@XmlRootElement(name = "ParseException", namespace = "http://ws.escolasis/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParseException", namespace = "http://ws.escolasis/", propOrder = {
    "errorOffset",
    "message"
})
public class ParseExceptionBean {

    private int errorOffset;
    private String message;

    /**
     * 
     * @return
     *     returns int
     */
    public int getErrorOffset() {
        return this.errorOffset;
    }

    /**
     * 
     * @param errorOffset
     *     the value for the errorOffset property
     */
    public void setErrorOffset(int errorOffset) {
        this.errorOffset = errorOffset;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * 
     * @param message
     *     the value for the message property
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
