// Built from tag v0.1.1

package no.fint.model.pwfa;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintComplexDatatypeObject;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Identifikator implements FintComplexDatatypeObject {
    @NonNull
    private String identifikatorverdi;
}
