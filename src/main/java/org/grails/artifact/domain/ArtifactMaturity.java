package org.grails.artifact.domain;

public enum ArtifactMaturity {

    DEV("Development"),
    OFFICIAL("Official"),
    STABLE("Stable");

    private String value;

    ArtifactMaturity(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
