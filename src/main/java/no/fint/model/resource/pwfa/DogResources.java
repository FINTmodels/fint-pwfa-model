// Built from tag v0.1.1

package no.fint.model.resource.pwfa;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class DogResources extends AbstractCollectionResources<DogResource> {

    public DogResources(Collection<DogResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<DogResource>> getTypeReference() {
        return new TypeReference<List<DogResource>>() {};
    }
}
