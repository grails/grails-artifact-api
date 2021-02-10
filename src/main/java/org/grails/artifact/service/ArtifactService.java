package org.grails.artifact.service;

import org.grails.artifact.domain.Artifact;
import org.grails.artifact.domain.ArtifactRepository;

import javax.annotation.Nullable;
import javax.inject.Singleton;

@Singleton
public class ArtifactService {

    private final ArtifactRepository artifactRepository;

    public ArtifactService(ArtifactRepository artifactRepository) {
        this.artifactRepository = artifactRepository;
    }

    public Iterable<Artifact> list(@Nullable Integer start) {
        return artifactRepository.findAll();
    }
}
