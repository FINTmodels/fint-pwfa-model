package no.fint.model.pwfa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Dog {

    public enum Relasjonsnavn {
        OWNER
    }

    private String id;
    private String name;
    private String breed;
}
