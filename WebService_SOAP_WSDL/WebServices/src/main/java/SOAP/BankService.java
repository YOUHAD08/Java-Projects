package SOAP;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;


@WebService(serviceName = "BankWS")
public class BankService {

     @WebMethod(operationName ="ChangeEuroToDH" )
    public double Currency_Change(@WebParam(name = "amount") double amt) {
        return amt*11;
    }

    @WebMethod
    public Account Get_Account(@WebParam(name = "BankId") int id){
        return new Account(id, Math.random()*60000,new Date());

    }
    @WebMethod
    public List<Account> Get_Accounts(){
        return List.of(
                new Account(1, Math.random()*60000,new Date()),
                new Account(2, Math.random()*60000,new Date()),
                new Account(3, Math.random()*60000,new Date()),
                new Account(4, Math.random()*60000,new Date())
        );
    }
}
