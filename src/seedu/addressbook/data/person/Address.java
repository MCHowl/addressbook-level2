package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address extends Contact implements Printable{

    public static final String EXAMPLE = "13, Computing Drive, #02-14, 117417";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Address must be in the format <BLOCK>,<STREET>,<UNIT>,<POSTAL CODE>";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";
    public static final int ADDRESS_VALIDATION_LENGTH = 4;
    
    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        
        String[] splitAddress = address.split(",");
        
        if (!isValidAddress(splitAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        } else {
        	block = new Block(splitAddress[0]);
        	street = new Street(splitAddress[1]);
        	unit = new Unit(splitAddress[2]);
        	postalCode = new PostalCode(splitAddress[3]);        	
        }
        
        this.value = updateAddress(block, street, unit, postalCode);
    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String[] test) {
        return test.length == ADDRESS_VALIDATION_LENGTH;
    }
    
    public String updateAddress(Block block, Street street, Unit unit, PostalCode postalCode) {
    	return block.getBlock() + ", " + 
    			street.getStreet() + ", " +
        		unit.getUnit() + ", " +
        		postalCode.getPostalCode();
    }

	@Override
	public String getPrintableString() {
		return "Address: " + toString();
	}
}