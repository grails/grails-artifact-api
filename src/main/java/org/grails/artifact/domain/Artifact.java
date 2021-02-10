package org.grails.artifact.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.micronaut.data.annotation.*;
import io.micronaut.data.model.DataType;

import javax.annotation.Nullable;
import java.util.Date;

@MappedEntity
public class Artifact {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String repo;

    private String owner;

    @Nullable
    private String desc;

    @Nullable
    @JsonSerialize(using = StringArraySerializer.class, as = String.class)
    private String labels;

    @Nullable
    @JsonSerialize(using = StringArraySerializer.class, as = String.class)
    private String attributeNames;

    @JsonSerialize(using = StringArraySerializer.class, as = String.class)
    private String licenses;

    @Nullable
    @JsonSerialize(using = StringArraySerializer.class, as = String.class)
    private String customLicenses;

    private Integer followersCount;

    @DateCreated
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date created;

    @Nullable
    private String websiteUrl;

    @Nullable
    private String issueTrackerUrl;

    @Nullable
    @JsonSerialize(using = StringArraySerializer.class, as = String.class)
    private String linkedToRepos;

    @Nullable
    @JsonSerialize(using = StringArraySerializer.class, as = String.class)
    private String permissions;

    @Nullable
    @JsonSerialize(using = StringArraySerializer.class, as = String.class)
    private String versions;

    @Nullable
    private String latestVersion;

    @DateUpdated
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date updated;

    private Integer ratingCount;

    @Nullable
    @JsonSerialize(using = StringArraySerializer.class, as = String.class)
    private String systemIds;

    @Nullable
    private String vcsUrl;

    @Nullable
    private String maturity;

    /*** Getters & Setters ***/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Nullable
    public String getDesc() {
        return desc;
    }

    public void setDesc(@Nullable String desc) {
        this.desc = desc;
    }

    @Nullable
    public String getLabels() {
        return labels;
    }

    public void setLabels(@Nullable String labels) {
        this.labels = labels;
    }

    @Nullable
    public String getAttributeNames() {
        return attributeNames;
    }

    public void setAttributeNames(@Nullable String attributeNames) {
        this.attributeNames = attributeNames;
    }

    public String getLicenses() {
        return licenses;
    }

    public void setLicenses(String licenses) {
        this.licenses = licenses;
    }

    @Nullable
    public String getCustomLicenses() {
        return customLicenses;
    }

    public void setCustomLicenses(@Nullable String customLicenses) {
        this.customLicenses = customLicenses;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Nullable
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(@Nullable String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @Nullable
    public String getIssueTrackerUrl() {
        return issueTrackerUrl;
    }

    public void setIssueTrackerUrl(@Nullable String issueTrackerUrl) {
        this.issueTrackerUrl = issueTrackerUrl;
    }

    @Nullable
    public String getLinkedToRepos() {
        return linkedToRepos;
    }

    public void setLinkedToRepos(@Nullable String linkedToRepos) {
        this.linkedToRepos = linkedToRepos;
    }

    @Nullable
    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(@Nullable String permissions) {
        this.permissions = permissions;
    }

    @Nullable
    public String getVersions() {
        return versions;
    }

    public void setVersions(@Nullable String versions) {
        this.versions = versions;
    }

    @Nullable
    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(@Nullable String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    @Nullable
    public String getSystemIds() {
        return systemIds;
    }

    public void setSystemIds(String systemIds) {
        this.systemIds = systemIds;
    }

    @Nullable
    public String getVcsUrl() {
        return vcsUrl;
    }

    public void setVcsUrl(@Nullable String vcsUrl) {
        this.vcsUrl = vcsUrl;
    }

    @Nullable
    public String getMaturity() {
        return maturity;
    }

    public void setMaturity(@Nullable String maturity) {
        this.maturity = maturity;
    }
}
