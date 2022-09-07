// Built from tag v0.1.1

package no.fint.model.resource.pwfa;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class OwnerResources extends AbstractCollectionResources<OwnerResource> {

    public OwnerResources(Collection<OwnerResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<OwnerResource>> getTypeReference() {
        return new TypeReference<List<OwnerResource>>() {};
    }
}
