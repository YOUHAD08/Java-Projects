
package BankServicesProxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the BankServicesProxy package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _ChangeEuroToDH_QNAME = new QName("http://SOAP/", "ChangeEuroToDH");
    private static final QName _ChangeEuroToDHResponse_QNAME = new QName("http://SOAP/", "ChangeEuroToDHResponse");
    private static final QName _GetAccount_QNAME = new QName("http://SOAP/", "Get_Account");
    private static final QName _GetAccountResponse_QNAME = new QName("http://SOAP/", "Get_AccountResponse");
    private static final QName _GetAccounts_QNAME = new QName("http://SOAP/", "Get_Accounts");
    private static final QName _GetAccountsResponse_QNAME = new QName("http://SOAP/", "Get_AccountsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: BankServicesProxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeEuroToDH }
     * 
     * @return
     *     the new instance of {@link ChangeEuroToDH }
     */
    public ChangeEuroToDH createChangeEuroToDH() {
        return new ChangeEuroToDH();
    }

    /**
     * Create an instance of {@link ChangeEuroToDHResponse }
     * 
     * @return
     *     the new instance of {@link ChangeEuroToDHResponse }
     */
    public ChangeEuroToDHResponse createChangeEuroToDHResponse() {
        return new ChangeEuroToDHResponse();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     * @return
     *     the new instance of {@link GetAccount }
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountResponse }
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link GetAccounts }
     * 
     * @return
     *     the new instance of {@link GetAccounts }
     */
    public GetAccounts createGetAccounts() {
        return new GetAccounts();
    }

    /**
     * Create an instance of {@link GetAccountsResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountsResponse }
     */
    public GetAccountsResponse createGetAccountsResponse() {
        return new GetAccountsResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeEuroToDH }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeEuroToDH }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP/", name = "ChangeEuroToDH")
    public JAXBElement<ChangeEuroToDH> createChangeEuroToDH(ChangeEuroToDH value) {
        return new JAXBElement<>(_ChangeEuroToDH_QNAME, ChangeEuroToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeEuroToDHResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeEuroToDHResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP/", name = "ChangeEuroToDHResponse")
    public JAXBElement<ChangeEuroToDHResponse> createChangeEuroToDHResponse(ChangeEuroToDHResponse value) {
        return new JAXBElement<>(_ChangeEuroToDHResponse_QNAME, ChangeEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP/", name = "Get_Account")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP/", name = "Get_AccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccounts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccounts }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP/", name = "Get_Accounts")
    public JAXBElement<GetAccounts> createGetAccounts(GetAccounts value) {
        return new JAXBElement<>(_GetAccounts_QNAME, GetAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP/", name = "Get_AccountsResponse")
    public JAXBElement<GetAccountsResponse> createGetAccountsResponse(GetAccountsResponse value) {
        return new JAXBElement<>(_GetAccountsResponse_QNAME, GetAccountsResponse.class, null, value);
    }

}
