package no.fint.pwfa.model;

import java.util.Arrays;
import java.util.List;

public enum PwfaActions {
    GET_ALL_DOGS,
    GET_ALL_OWNERS,
    GET_DOG,
    GET_OWNER;

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
