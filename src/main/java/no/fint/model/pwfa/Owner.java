// Built from tag v0.1.1

package no.fint.model.pwfa;

import lombok.*;
import no.fint.model.FintMainObject;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Owner implements FintMainObject {
    public enum Relasjonsnavn {
            DOG
    }

    @NonNull
    private Identifikator id;
    @NonNull
    private String name;
}
