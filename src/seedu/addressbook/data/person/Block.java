package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Block {
    public static final String EXAMPLE = "13";
    public static final String MESSAGE_BLOCK_CONSTRAINTS = "Block number can be in any format.";
    
    public static final String BLOCK_VALIDATION_REGEX = ".+";
	
	private String block;
	
	Block(String block) throws IllegalValueException {
		if (!isValidBlock(block)) {
			throw new IllegalValueException(MESSAGE_BLOCK_CONSTRAINTS);
		}
		
		this.block = block;			
	}
	
	public String getBlock() {
		return block;
	}
	
    public static boolean isValidBlock(String test) {
        return test.matches(BLOCK_VALIDATION_REGEX);
    }
	
}
