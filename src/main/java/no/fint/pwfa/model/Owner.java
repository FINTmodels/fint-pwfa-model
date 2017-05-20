package no.fint.pwfa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.relation.Identifiable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Owner implements Identifiable {

    public enum Relasjonsnavn {
        DOG
    }

    private String id;
    private String name;

    @JsonIgnore
    @Override
    public String getId() {
        return id;
    }
}
