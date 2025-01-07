package org.acme.config;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.util.Optional;

@ConfigMapping(prefix = "app.data")
public interface GreetingConfiguration {

    @ConfigProperty(name = "app.data.name")
    String name();

    @ConfigProperty(name = "app.data.domain-claim")
    String domainClaim();
}
