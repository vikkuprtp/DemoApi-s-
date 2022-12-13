package com.vp.iqnextintern1.models;

import jakarta.persistence.*;

@Entity
@Table(name = "player_playing_time", schema = "fifa", catalog = "")
public class PlayerPlayingTime {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "player")
    private String player;
    @Basic
    @Column(name = "position")
    private String position;
    @Basic
    @Column(name = "team")
    private String team;
    @Basic
    @Column(name = "age")
    private String age;
    @Basic
    @Column(name = "birth_year")
    private Integer birthYear;
    @Basic
    @Column(name = "games")
    private Integer games;
    @Basic
    @Column(name = "minutes")
    private Integer minutes;
    @Basic
    @Column(name = "minutes_per_game")
    private Integer minutesPerGame;
    @Basic
    @Column(name = "minutes_pct")
    private Double minutesPct;
    @Basic
    @Column(name = "minutes_90s")
    private Double minutes90S;
    @Basic
    @Column(name = "games_starts")
    private Integer gamesStarts;
    @Basic
    @Column(name = "minutes_per_start")
    private Integer minutesPerStart;
    @Basic
    @Column(name = "games_complete")
    private Integer gamesComplete;
    @Basic
    @Column(name = "games_subs")
    private Integer gamesSubs;
    @Basic
    @Column(name = "minutes_per_sub")
    private Integer minutesPerSub;
    @Basic
    @Column(name = "unused_subs")
    private Integer unusedSubs;
    @Basic
    @Column(name = "points_per_game")
    private Double pointsPerGame;
    @Basic
    @Column(name = "on_goals_for")
    private Integer onGoalsFor;
    @Basic
    @Column(name = "on_goals_against")
    private Integer onGoalsAgainst;
    @Basic
    @Column(name = "plus_minus")
    private Integer plusMinus;
    @Basic
    @Column(name = "plus_minus_per90")
    private Double plusMinusPer90;
    @Basic
    @Column(name = "plus_minus_wowy")
    private Double plusMinusWowy;
    @Basic
    @Column(name = "on_xg_for")
    private Double onXgFor;
    @Basic
    @Column(name = "on_xg_against")
    private Double onXgAgainst;
    @Basic
    @Column(name = "xg_plus_minus")
    private Double xgPlusMinus;
    @Basic
    @Column(name = "xg_plus_minus_per90")
    private Double xgPlusMinusPer90;
    @Basic
    @Column(name = "xg_plus_minus_wowy")
    private Double xgPlusMinusWowy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getMinutesPerGame() {
        return minutesPerGame;
    }

    public void setMinutesPerGame(Integer minutesPerGame) {
        this.minutesPerGame = minutesPerGame;
    }

    public Double getMinutesPct() {
        return minutesPct;
    }

    public void setMinutesPct(Double minutesPct) {
        this.minutesPct = minutesPct;
    }

    public Double getMinutes90S() {
        return minutes90S;
    }

    public void setMinutes90S(Double minutes90S) {
        this.minutes90S = minutes90S;
    }

    public Integer getGamesStarts() {
        return gamesStarts;
    }

    public void setGamesStarts(Integer gamesStarts) {
        this.gamesStarts = gamesStarts;
    }

    public Integer getMinutesPerStart() {
        return minutesPerStart;
    }

    public void setMinutesPerStart(Integer minutesPerStart) {
        this.minutesPerStart = minutesPerStart;
    }

    public Integer getGamesComplete() {
        return gamesComplete;
    }

    public void setGamesComplete(Integer gamesComplete) {
        this.gamesComplete = gamesComplete;
    }

    public Integer getGamesSubs() {
        return gamesSubs;
    }

    public void setGamesSubs(Integer gamesSubs) {
        this.gamesSubs = gamesSubs;
    }

    public Integer getMinutesPerSub() {
        return minutesPerSub;
    }

    public void setMinutesPerSub(Integer minutesPerSub) {
        this.minutesPerSub = minutesPerSub;
    }

    public Integer getUnusedSubs() {
        return unusedSubs;
    }

    public void setUnusedSubs(Integer unusedSubs) {
        this.unusedSubs = unusedSubs;
    }

    public Double getPointsPerGame() {
        return pointsPerGame;
    }

    public void setPointsPerGame(Double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    public Integer getOnGoalsFor() {
        return onGoalsFor;
    }

    public void setOnGoalsFor(Integer onGoalsFor) {
        this.onGoalsFor = onGoalsFor;
    }

    public Integer getOnGoalsAgainst() {
        return onGoalsAgainst;
    }

    public void setOnGoalsAgainst(Integer onGoalsAgainst) {
        this.onGoalsAgainst = onGoalsAgainst;
    }

    public Integer getPlusMinus() {
        return plusMinus;
    }

    public void setPlusMinus(Integer plusMinus) {
        this.plusMinus = plusMinus;
    }

    public Double getPlusMinusPer90() {
        return plusMinusPer90;
    }

    public void setPlusMinusPer90(Double plusMinusPer90) {
        this.plusMinusPer90 = plusMinusPer90;
    }

    public Double getPlusMinusWowy() {
        return plusMinusWowy;
    }

    public void setPlusMinusWowy(Double plusMinusWowy) {
        this.plusMinusWowy = plusMinusWowy;
    }

    public Double getOnXgFor() {
        return onXgFor;
    }

    public void setOnXgFor(Double onXgFor) {
        this.onXgFor = onXgFor;
    }

    public Double getOnXgAgainst() {
        return onXgAgainst;
    }

    public void setOnXgAgainst(Double onXgAgainst) {
        this.onXgAgainst = onXgAgainst;
    }

    public Double getXgPlusMinus() {
        return xgPlusMinus;
    }

    public void setXgPlusMinus(Double xgPlusMinus) {
        this.xgPlusMinus = xgPlusMinus;
    }

    public Double getXgPlusMinusPer90() {
        return xgPlusMinusPer90;
    }

    public void setXgPlusMinusPer90(Double xgPlusMinusPer90) {
        this.xgPlusMinusPer90 = xgPlusMinusPer90;
    }

    public Double getXgPlusMinusWowy() {
        return xgPlusMinusWowy;
    }

    public void setXgPlusMinusWowy(Double xgPlusMinusWowy) {
        this.xgPlusMinusWowy = xgPlusMinusWowy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayerPlayingTime that = (PlayerPlayingTime) o;

        if (id != that.id) return false;
        if (player != null ? !player.equals(that.player) : that.player != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (team != null ? !team.equals(that.team) : that.team != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (birthYear != null ? !birthYear.equals(that.birthYear) : that.birthYear != null) return false;
        if (games != null ? !games.equals(that.games) : that.games != null) return false;
        if (minutes != null ? !minutes.equals(that.minutes) : that.minutes != null) return false;
        if (minutesPerGame != null ? !minutesPerGame.equals(that.minutesPerGame) : that.minutesPerGame != null)
            return false;
        if (minutesPct != null ? !minutesPct.equals(that.minutesPct) : that.minutesPct != null) return false;
        if (minutes90S != null ? !minutes90S.equals(that.minutes90S) : that.minutes90S != null) return false;
        if (gamesStarts != null ? !gamesStarts.equals(that.gamesStarts) : that.gamesStarts != null) return false;
        if (minutesPerStart != null ? !minutesPerStart.equals(that.minutesPerStart) : that.minutesPerStart != null)
            return false;
        if (gamesComplete != null ? !gamesComplete.equals(that.gamesComplete) : that.gamesComplete != null)
            return false;
        if (gamesSubs != null ? !gamesSubs.equals(that.gamesSubs) : that.gamesSubs != null) return false;
        if (minutesPerSub != null ? !minutesPerSub.equals(that.minutesPerSub) : that.minutesPerSub != null)
            return false;
        if (unusedSubs != null ? !unusedSubs.equals(that.unusedSubs) : that.unusedSubs != null) return false;
        if (pointsPerGame != null ? !pointsPerGame.equals(that.pointsPerGame) : that.pointsPerGame != null)
            return false;
        if (onGoalsFor != null ? !onGoalsFor.equals(that.onGoalsFor) : that.onGoalsFor != null) return false;
        if (onGoalsAgainst != null ? !onGoalsAgainst.equals(that.onGoalsAgainst) : that.onGoalsAgainst != null)
            return false;
        if (plusMinus != null ? !plusMinus.equals(that.plusMinus) : that.plusMinus != null) return false;
        if (plusMinusPer90 != null ? !plusMinusPer90.equals(that.plusMinusPer90) : that.plusMinusPer90 != null)
            return false;
        if (plusMinusWowy != null ? !plusMinusWowy.equals(that.plusMinusWowy) : that.plusMinusWowy != null)
            return false;
        if (onXgFor != null ? !onXgFor.equals(that.onXgFor) : that.onXgFor != null) return false;
        if (onXgAgainst != null ? !onXgAgainst.equals(that.onXgAgainst) : that.onXgAgainst != null) return false;
        if (xgPlusMinus != null ? !xgPlusMinus.equals(that.xgPlusMinus) : that.xgPlusMinus != null) return false;
        if (xgPlusMinusPer90 != null ? !xgPlusMinusPer90.equals(that.xgPlusMinusPer90) : that.xgPlusMinusPer90 != null)
            return false;
        if (xgPlusMinusWowy != null ? !xgPlusMinusWowy.equals(that.xgPlusMinusWowy) : that.xgPlusMinusWowy != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (player != null ? player.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (team != null ? team.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (birthYear != null ? birthYear.hashCode() : 0);
        result = 31 * result + (games != null ? games.hashCode() : 0);
        result = 31 * result + (minutes != null ? minutes.hashCode() : 0);
        result = 31 * result + (minutesPerGame != null ? minutesPerGame.hashCode() : 0);
        result = 31 * result + (minutesPct != null ? minutesPct.hashCode() : 0);
        result = 31 * result + (minutes90S != null ? minutes90S.hashCode() : 0);
        result = 31 * result + (gamesStarts != null ? gamesStarts.hashCode() : 0);
        result = 31 * result + (minutesPerStart != null ? minutesPerStart.hashCode() : 0);
        result = 31 * result + (gamesComplete != null ? gamesComplete.hashCode() : 0);
        result = 31 * result + (gamesSubs != null ? gamesSubs.hashCode() : 0);
        result = 31 * result + (minutesPerSub != null ? minutesPerSub.hashCode() : 0);
        result = 31 * result + (unusedSubs != null ? unusedSubs.hashCode() : 0);
        result = 31 * result + (pointsPerGame != null ? pointsPerGame.hashCode() : 0);
        result = 31 * result + (onGoalsFor != null ? onGoalsFor.hashCode() : 0);
        result = 31 * result + (onGoalsAgainst != null ? onGoalsAgainst.hashCode() : 0);
        result = 31 * result + (plusMinus != null ? plusMinus.hashCode() : 0);
        result = 31 * result + (plusMinusPer90 != null ? plusMinusPer90.hashCode() : 0);
        result = 31 * result + (plusMinusWowy != null ? plusMinusWowy.hashCode() : 0);
        result = 31 * result + (onXgFor != null ? onXgFor.hashCode() : 0);
        result = 31 * result + (onXgAgainst != null ? onXgAgainst.hashCode() : 0);
        result = 31 * result + (xgPlusMinus != null ? xgPlusMinus.hashCode() : 0);
        result = 31 * result + (xgPlusMinusPer90 != null ? xgPlusMinusPer90.hashCode() : 0);
        result = 31 * result + (xgPlusMinusWowy != null ? xgPlusMinusWowy.hashCode() : 0);
        return result;
    }
}
