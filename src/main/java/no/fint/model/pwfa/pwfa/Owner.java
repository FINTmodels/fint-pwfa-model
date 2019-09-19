// Built from tag v0.1.0

package no.fint.model.pwfa.pwfa;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;
import no.fint.model.pwfa.pwfa.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Owner implements FintMainObject {
    public enum Relasjonsnavn {
            DOG
    }

    @NonNull
    private Identifikator id;
    @NonNull
    private String name;
}
