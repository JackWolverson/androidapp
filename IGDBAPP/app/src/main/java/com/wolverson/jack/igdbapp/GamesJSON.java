
package com.wolverson.jack.igdbapp;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GamesJSON {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("created_at")
    @Expose
    private long createdAt;
    @SerializedName("updated_at")
    @Expose
    private long updatedAt;
    @SerializedName("collection")
    @Expose
    private long collection;
    @SerializedName("popularity")
    @Expose
    private float popularity;
    @SerializedName("games")
    @Expose
    private List<Integer> games = null;
    @SerializedName("tags")
    @Expose
    private List<Integer> tags = null;
    @SerializedName("developers")
    @Expose
    private List<Integer> developers = null;
    @SerializedName("publishers")
    @Expose
    private List<Integer> publishers = null;
    @SerializedName("category")
    @Expose
    private int category;
    @SerializedName("player_perspectives")
    @Expose
    private List<Integer> playerPerspectives = null;
    @SerializedName("game_modes")
    @Expose
    private List<Integer> gameModes = null;
    @SerializedName("keywords")
    @Expose
    private List<Integer> keywords = null;
    @SerializedName("themes")
    @Expose
    private List<Integer> themes = null;
    @SerializedName("genres")
    @Expose
    private List<Integer> genres = null;
    @SerializedName("first_release_date")
    @Expose
    private long firstReleaseDate;
    @SerializedName("platforms")
    @Expose
    private List<Integer> platforms = null;
    @SerializedName("release_dates")
    @Expose
    private List<ReleaseDate> releaseDates = null;
    @SerializedName("cover")
    @Expose
    private Cover cover;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("rating")
    @Expose
    private float rating;
    @SerializedName("aggregated_rating")
    @Expose
    private float aggregatedRating;
    @SerializedName("aggregated_rating_count")
    @Expose
    private int aggregatedRatingCount;
    @SerializedName("total_rating")
    @Expose
    private float totalRating;
    @SerializedName("total_rating_count")
    @Expose
    private int totalRatingCount;
    @SerializedName("rating_count")
    @Expose
    private int ratingCount;
    @SerializedName("game")
    @Expose
    private int game;
    @SerializedName("game_engines")
    @Expose
    private List<Integer> gameEngines = null;
    @SerializedName("screenshots")
    @Expose
    private List<Screenshot> screenshots = null;
    @SerializedName("videos")
    @Expose
    private List<Video> videos = null;
    @SerializedName("esrb")
    @Expose
    private Esrb esrb;
    @SerializedName("pegi")
    @Expose
    private Pegi pegi;
    @SerializedName("websites")
    @Expose
    private List<Website> websites = null;
    @SerializedName("alternative_names")
    @Expose
    private List<AlternativeName> alternativeNames = null;
    @SerializedName("franchise")
    @Expose
    private int franchise;
    @SerializedName("franchises")
    @Expose
    private List<Integer> franchises = null;
    @SerializedName("multiplayer_modes")
    @Expose
    private List<MultiplayerMode> multiplayerModes = null;
    @SerializedName("pulse_count")
    @Expose
    private int pulseCount;
    @SerializedName("storyline")
    @Expose
    private String storyline;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getCollection() {
        return collection;
    }

    public void setCollection(long collection) {
        this.collection = collection;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public List<Integer> getGames() {
        return games;
    }

    public void setGames(List<Integer> games) {
        this.games = games;
    }

    public List<Integer> getTags() {
        return tags;
    }

    public void setTags(List<Integer> tags) {
        this.tags = tags;
    }

    public List<Integer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Integer> developers) {
        this.developers = developers;
    }

    public List<Integer> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<Integer> publishers) {
        this.publishers = publishers;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public List<Integer> getPlayerPerspectives() {
        return playerPerspectives;
    }

    public void setPlayerPerspectives(List<Integer> playerPerspectives) {
        this.playerPerspectives = playerPerspectives;
    }

    public List<Integer> getGameModes() {
        return gameModes;
    }

    public void setGameModes(List<Integer> gameModes) {
        this.gameModes = gameModes;
    }

    public List<Integer> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<Integer> keywords) {
        this.keywords = keywords;
    }

    public List<Integer> getThemes() {
        return themes;
    }

    public void setThemes(List<Integer> themes) {
        this.themes = themes;
    }

    public List<Integer> getGenres() {
        return genres;
    }

    public void setGenres(List<Integer> genres) {
        this.genres = genres;
    }

    public long getFirstReleaseDate() {
        return firstReleaseDate;
    }

    public void setFirstReleaseDate(long firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }

    public List<Integer> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Integer> platforms) {
        this.platforms = platforms;
    }

    public List<ReleaseDate> getReleaseDates() {
        return releaseDates;
    }

    public void setReleaseDates(List<ReleaseDate> releaseDates) {
        this.releaseDates = releaseDates;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public float getAggregatedRating() {
        return aggregatedRating;
    }

    public void setAggregatedRating(int aggregatedRating) {
        this.aggregatedRating = aggregatedRating;
    }

    public int getAggregatedRatingCount() {
        return aggregatedRatingCount;
    }

    public void setAggregatedRatingCount(int aggregatedRatingCount) {
        this.aggregatedRatingCount = aggregatedRatingCount;
    }

    public float getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(float totalRating) {
        this.totalRating = totalRating;
    }

    public int getTotalRatingCount() {
        return totalRatingCount;
    }

    public void setTotalRatingCount(int totalRatingCount) {
        this.totalRatingCount = totalRatingCount;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public int getGame() {
        return game;
    }

    public void setGame(int game) {
        this.game = game;
    }

    public List<Integer> getGameEngines() {
        return gameEngines;
    }

    public void setGameEngines(List<Integer> gameEngines) {
        this.gameEngines = gameEngines;
    }

    public List<Screenshot> getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(List<Screenshot> screenshots) {
        this.screenshots = screenshots;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public Esrb getEsrb() {
        return esrb;
    }

    public void setEsrb(Esrb esrb) {
        this.esrb = esrb;
    }

    public Pegi getPegi() {
        return pegi;
    }

    public void setPegi(Pegi pegi) {
        this.pegi = pegi;
    }

    public List<Website> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Website> websites) {
        this.websites = websites;
    }

    public List<AlternativeName> getAlternativeNames() {
        return alternativeNames;
    }

    public void setAlternativeNames(List<AlternativeName> alternativeNames) {
        this.alternativeNames = alternativeNames;
    }

    public int getFranchise() {
        return franchise;
    }

    public void setFranchise(int franchise) {
        this.franchise = franchise;
    }

    public List<Integer> getFranchises() {
        return franchises;
    }

    public void setFranchises(List<Integer> franchises) {
        this.franchises = franchises;
    }

    public List<MultiplayerMode> getMultiplayerModes() {
        return multiplayerModes;
    }

    public void setMultiplayerModes(List<MultiplayerMode> multiplayerModes) {
        this.multiplayerModes = multiplayerModes;
    }

    public int getPulseCount() {
        return pulseCount;
    }

    public void setPulseCount(int pulseCount) {
        this.pulseCount = pulseCount;
    }

    public String getStoryline() {
        return storyline;
    }

    public void setStoryline(String storyline) {
        this.storyline = storyline;
    }

}
