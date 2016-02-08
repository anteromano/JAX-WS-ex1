package net.mahtabalam.ws;

public class MyException extends Exception {
	/**
	 * 
	 */
	public static final String COUNTRY_NOT_FOUND = "1";
	private static final long serialVersionUID = 1L;
	private String code;

	public MyException(String code, String errorDescription, Throwable t) {
		super(errorDescription, t);
		this.code = code;
	}

	public MyException(String code) {
		super(getCodeDescription(code));
		this.code = code;
	}

	private static String getCodeDescription(String code) {
		switch (code) {
		case COUNTRY_NOT_FOUND:
			return "Country not found";
		default:
			return "Unexpected error";
		}
	}

	public String getErrorDescription() {
		return super.getMessage();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
