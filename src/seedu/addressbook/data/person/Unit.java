package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Unit {
    public static final String EXAMPLE = "#02-14";
    public static final String MESSAGE_UNIT_CONSTRAINTS = "Unit number can be in any format.";
    public static final String UNIT_VALIDATION_REGEX = ".+";
	
	private String unit;
	
	Unit (String unit) throws IllegalValueException {
		if (!isValidUnit(unit)) {
			throw new IllegalValueException(MESSAGE_UNIT_CONSTRAINTS);
		}
		this.unit = unit;
	}
	
	public String getUnit() {
		return unit;
	}
	
    public static boolean isValidUnit(String test) {
        return test.matches(UNIT_VALIDATION_REGEX);
    }

}
