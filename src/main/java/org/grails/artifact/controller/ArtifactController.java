package org.grails.artifact.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import org.grails.artifact.domain.Artifact;
import org.grails.artifact.service.ArtifactService;
import javax.annotation.Nullable;

@Secured(SecurityRule.IS_ANONYMOUS)
@Controller("/")
public class ArtifactController {

    private final ArtifactService artifactService;

    public ArtifactController(ArtifactService artifactService) {
        this.artifactService = artifactService;
    }

    @Get("/{?start}")
    HttpResponse<Iterable<Artifact>> list(@Nullable Integer start) {
        return HttpResponse.ok(artifactService.list(start));
    }


}
