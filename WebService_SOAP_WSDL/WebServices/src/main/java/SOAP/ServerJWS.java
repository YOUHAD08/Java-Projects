package SOAP;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url ="http://0.0.0.0:8787/";
        Endpoint.publish(url, new BankService());
        System.out.println("Server is deployed at : "+url);

    }
}
