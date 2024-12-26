
package BankServicesProxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Get_Account complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Get_Account">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Get_Account", propOrder = {
    "bankId"
})
public class GetAccount {

    @XmlElement(name = "BankId")
    protected int bankId;

    /**
     * Gets the value of the bankId property.
     * 
     */
    public int getBankId() {
        return bankId;
    }

    /**
     * Sets the value of the bankId property.
     * 
     */
    public void setBankId(int value) {
        this.bankId = value;
    }

}
