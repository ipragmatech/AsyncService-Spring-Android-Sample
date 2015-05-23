
package com.ipragmatech.asyncservice.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "gravatar_id",
    "username",
    "login",
    "name",
    "fullname",
    "location",
    "language",
    "type",
    "public_repo_count",
    "repos",
    "followers",
    "followers_count",
    "score",
    "created_at",
    "created"
})
public class User implements Serializable {

    public User() {
    }

    public User(String created, String createdAt, Integer followers, Integer followersCount, String fullname, String gravatarId, String id, String language, String location, String login, String name, Integer publicRepoCount, Integer repos, Double score, String type, String username) {
        this.created = created;
        this.createdAt = createdAt;
        this.followers = followers;
        this.followersCount = followersCount;
        this.fullname = fullname;
        this.gravatarId = gravatarId;
        this.id = id;
        this.language = language;
        this.location = location;
        this.login = login;
        this.name = name;
        this.publicRepoCount = publicRepoCount;
        this.repos = repos;
        this.score = score;
        this.type = type;
        this.username = username;
    }

    @JsonProperty("id")
    private String id;
    @JsonProperty("gravatar_id")
    private String gravatarId;
    @JsonProperty("username")
    private String username;
    @JsonProperty("login")
    private String login;
    @JsonProperty("name")
    private String name;
    @JsonProperty("fullname")
    private String fullname;
    @JsonProperty("location")
    private String location;
    @JsonProperty("language")
    private String language;
    @JsonProperty("type")
    private String type;
    @JsonProperty("public_repo_count")
    private Integer publicRepoCount;
    @JsonProperty("repos")
    private Integer repos;
    @JsonProperty("followers")
    private Integer followers;
    @JsonProperty("followers_count")
    private Integer followersCount;
    @JsonProperty("score")
    private Double score;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("created")
    private String created;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The gravatarId
     */
    @JsonProperty("gravatar_id")
    public String getGravatarId() {
        return gravatarId;
    }

    /**
     * 
     * @param gravatarId
     *     The gravatar_id
     */
    @JsonProperty("gravatar_id")
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    /**
     * 
     * @return
     *     The username
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username
     *     The username
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * @return
     *     The login
     */
    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    /**
     * 
     * @param login
     *     The login
     */
    @JsonProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The fullname
     */
    @JsonProperty("fullname")
    public String getFullname() {
        return fullname;
    }

    /**
     * 
     * @param fullname
     *     The fullname
     */
    @JsonProperty("fullname")
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The language
     */
    @JsonProperty("language")
    public Object getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The publicRepoCount
     */
    @JsonProperty("public_repo_count")
    public Integer getPublicRepoCount() {
        return publicRepoCount;
    }

    /**
     * 
     * @param publicRepoCount
     *     The public_repo_count
     */
    @JsonProperty("public_repo_count")
    public void setPublicRepoCount(Integer publicRepoCount) {
        this.publicRepoCount = publicRepoCount;
    }

    /**
     * 
     * @return
     *     The repos
     */
    @JsonProperty("repos")
    public Integer getRepos() {
        return repos;
    }

    /**
     * 
     * @param repos
     *     The repos
     */
    @JsonProperty("repos")
    public void setRepos(Integer repos) {
        this.repos = repos;
    }

    /**
     * 
     * @return
     *     The followers
     */
    @JsonProperty("followers")
    public Integer getFollowers() {
        return followers;
    }

    /**
     * 
     * @param followers
     *     The followers
     */
    @JsonProperty("followers")
    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    /**
     * 
     * @return
     *     The followersCount
     */
    @JsonProperty("followers_count")
    public Integer getFollowersCount() {
        return followersCount;
    }

    /**
     * 
     * @param followersCount
     *     The followers_count
     */
    @JsonProperty("followers_count")
    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    /**
     * 
     * @return
     *     The score
     */
    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The created
     */
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    /**
     * 
     * @param created
     *     The created
     */
    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
