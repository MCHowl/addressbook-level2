package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class PostalCode {
    public static final String EXAMPLE = "117417";
    public static final String MESSAGE_POSTAL_CODE_CONSTRAINTS = "Postal code can be in any format.";
    public static final String POSTAL_CODE_VALIDATION_REGEX = ".+";
	
	private String postalCode;
	
	PostalCode (String postalCode) throws IllegalValueException {
		if (!isValidPostalCode(postalCode)) {
			throw new IllegalValueException(MESSAGE_POSTAL_CODE_CONSTRAINTS);
		}
		
		this.postalCode = postalCode;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
    public static boolean isValidPostalCode(String test) {
        return test.matches(POSTAL_CODE_VALIDATION_REGEX);
    }

}
