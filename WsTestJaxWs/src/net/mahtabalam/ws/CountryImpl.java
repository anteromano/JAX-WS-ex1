package net.mahtabalam.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.soap.SOAPFaultException;

@WebService(serviceName = "test", endpointInterface = "net.mahtabalam.ws.Country")
public class CountryImpl implements Country {
	private Utility states;

	public CountryImpl() {
		states = new Utility();
		states.loadData();
	}

	@WebMethod
	public String getCapital(String stateName) throws MyException {
		return states.getState(stateName).getCapital();
	}

	@WebMethod
	public State updateState(@WebParam(name = "stateName") String s, @WebParam(name = "state") State state) {
		return states.replaceState(s, state);
	}

	@WebMethod
	public void testThrowException() throws Exception {
		throw new Exception("Dummy Error!!!");
	}

	@WebMethod
	public void testThrowFault() {
		throw new RuntimeException("This is a test");
	}
}
