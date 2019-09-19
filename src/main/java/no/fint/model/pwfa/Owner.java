package no.fint.model.pwfa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Owner {

    public enum Relasjonsnavn {
        DOG
    }

    private String id;
    private String name;
}
