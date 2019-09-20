// Built from tag v0.1.1

package no.fint.model.resource.pwfa.pwfa;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import no.fint.model.FintMainObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.pwfa.pwfa.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class OwnerResource implements FintMainObject, FintLinks {
    // Attributes
    @NonNull
    private Identifikator id;
    @NonNull
    private String name;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getDog() {
        return getLinks().getOrDefault("dog", Collections.emptyList()); 
    }
    public void addDog(Link link) {
        addLink("dog", link);
    }
}
