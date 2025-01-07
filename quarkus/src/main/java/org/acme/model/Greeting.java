package org.acme.model;


import io.smallrye.common.constraint.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {
    @NotNull
    @Size(min =  5, max = 7)
    private String name;

    @NotNull
    @Size(min = 5, max = 500)
    private String domainClaim;

}
