// Built from tag v0.1.0-alpha-4

package no.fint.model.pwfa.pwfa;

import java.util.Arrays;
import java.util.List;

public enum PwfaActions {
	
	GET_DOG,
	GET_ALL_DOG,
	UPDATE_DOG,
	GET_OWNER,
	GET_ALL_OWNER,
	UPDATE_OWNER
	;


    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(PwfaActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

