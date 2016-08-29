package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Street {
    public static final String EXAMPLE = "Computing Drive";
    public static final String MESSAGE_STREET_CONSTRAINTS = "Street can be in any format.";
    public static final String STREET_VALIDATION_REGEX = ".+";
	
	private String street;
	
	Street(String street) throws IllegalValueException {
		if (!isValidStreet(street)) {
			throw new IllegalValueException(MESSAGE_STREET_CONSTRAINTS);
		}
		this.street = street;
	}
	
	public String getStreet() {
		return street;
	}
	
    public static boolean isValidStreet(String test) {
        return test.matches(STREET_VALIDATION_REGEX);
    }
	
}
