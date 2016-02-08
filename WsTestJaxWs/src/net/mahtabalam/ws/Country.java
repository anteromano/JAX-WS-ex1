package net.mahtabalam.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface Country {

	@WebMethod
	String getCapital(String s) throws MyException;

	@WebMethod
	State updateState(@WebParam(name = "stateName") String s, @WebParam(name = "state") State state);
	
	@WebMethod
	public void testThrowException() throws Exception;
	
	@WebMethod
	public void testThrowFault();

}