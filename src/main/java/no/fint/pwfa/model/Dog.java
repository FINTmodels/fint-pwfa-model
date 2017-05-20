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
public class Dog implements Identifiable {

    public enum Relasjonsnavn {
        OWNER
    }

    private String id;
    private String name;
    private String breed;


    @JsonIgnore
    @Override
    public String getId() {
        return id;
    }
}
