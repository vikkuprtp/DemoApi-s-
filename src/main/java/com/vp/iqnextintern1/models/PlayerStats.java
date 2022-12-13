package com.vp.iqnextintern1.models;

import jakarta.persistence.*;

@Entity
@Table(name = "player_stats", schema = "fifa", catalog = "")
public class PlayerStats {
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
    @Column(name = "club")
    private String club;
    @Basic
    @Column(name = "birth_year")
    private Integer birthYear;
    @Basic
    @Column(name = "games")
    private Integer games;
    @Basic
    @Column(name = "games_starts")
    private Integer gamesStarts;
    @Basic
    @Column(name = "minutes")
    private Integer minutes;
    @Basic
    @Column(name = "minutes_90s")
    private Double minutes90S;
    @Basic
    @Column(name = "goals")
    private Integer goals;
    @Basic
    @Column(name = "assists")
    private Integer assists;
    @Basic
    @Column(name = "goals_pens")
    private Integer goalsPens;
    @Basic
    @Column(name = "pens_made")
    private Integer pensMade;
    @Basic
    @Column(name = "pens_att")
    private Integer pensAtt;
    @Basic
    @Column(name = "cards_yellow")
    private Integer cardsYellow;
    @Basic
    @Column(name = "cards_red")
    private Integer cardsRed;
    @Basic
    @Column(name = "goals_per90")
    private Double goalsPer90;
    @Basic
    @Column(name = "assists_per90")
    private Double assistsPer90;
    @Basic
    @Column(name = "goals_assists_per90")
    private Double goalsAssistsPer90;
    @Basic
    @Column(name = "goals_pens_per90")
    private Double goalsPensPer90;
    @Basic
    @Column(name = "goals_assists_pens_per90")
    private Double goalsAssistsPensPer90;
    @Basic
    @Column(name = "xg")
    private Double xg;
    @Basic
    @Column(name = "npxg")
    private Double npxg;
    @Basic
    @Column(name = "xg_assist")
    private Double xgAssist;
    @Basic
    @Column(name = "npxg_xg_assist")
    private Double npxgXgAssist;
    @Basic
    @Column(name = "xg_per90")
    private Double xgPer90;
    @Basic
    @Column(name = "xg_assist_per90")
    private Double xgAssistPer90;
    @Basic
    @Column(name = "xg_xg_assist_per90")
    private Double xgXgAssistPer90;
    @Basic
    @Column(name = "npxg_per90")
    private Double npxgPer90;
    @Basic
    @Column(name = "npxg_xg_assist_per90")
    private Double npxgXgAssistPer90;

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

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
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

    public Integer getGamesStarts() {
        return gamesStarts;
    }

    public void setGamesStarts(Integer gamesStarts) {
        this.gamesStarts = gamesStarts;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Double getMinutes90S() {
        return minutes90S;
    }

    public void setMinutes90S(Double minutes90S) {
        this.minutes90S = minutes90S;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getGoalsPens() {
        return goalsPens;
    }

    public void setGoalsPens(Integer goalsPens) {
        this.goalsPens = goalsPens;
    }

    public Integer getPensMade() {
        return pensMade;
    }

    public void setPensMade(Integer pensMade) {
        this.pensMade = pensMade;
    }

    public Integer getPensAtt() {
        return pensAtt;
    }

    public void setPensAtt(Integer pensAtt) {
        this.pensAtt = pensAtt;
    }

    public Integer getCardsYellow() {
        return cardsYellow;
    }

    public void setCardsYellow(Integer cardsYellow) {
        this.cardsYellow = cardsYellow;
    }

    public Integer getCardsRed() {
        return cardsRed;
    }

    public void setCardsRed(Integer cardsRed) {
        this.cardsRed = cardsRed;
    }

    public Double getGoalsPer90() {
        return goalsPer90;
    }

    public void setGoalsPer90(Double goalsPer90) {
        this.goalsPer90 = goalsPer90;
    }

    public Double getAssistsPer90() {
        return assistsPer90;
    }

    public void setAssistsPer90(Double assistsPer90) {
        this.assistsPer90 = assistsPer90;
    }

    public Double getGoalsAssistsPer90() {
        return goalsAssistsPer90;
    }

    public void setGoalsAssistsPer90(Double goalsAssistsPer90) {
        this.goalsAssistsPer90 = goalsAssistsPer90;
    }

    public Double getGoalsPensPer90() {
        return goalsPensPer90;
    }

    public void setGoalsPensPer90(Double goalsPensPer90) {
        this.goalsPensPer90 = goalsPensPer90;
    }

    public Double getGoalsAssistsPensPer90() {
        return goalsAssistsPensPer90;
    }

    public void setGoalsAssistsPensPer90(Double goalsAssistsPensPer90) {
        this.goalsAssistsPensPer90 = goalsAssistsPensPer90;
    }

    public Double getXg() {
        return xg;
    }

    public void setXg(Double xg) {
        this.xg = xg;
    }

    public Double getNpxg() {
        return npxg;
    }

    public void setNpxg(Double npxg) {
        this.npxg = npxg;
    }

    public Double getXgAssist() {
        return xgAssist;
    }

    public void setXgAssist(Double xgAssist) {
        this.xgAssist = xgAssist;
    }

    public Double getNpxgXgAssist() {
        return npxgXgAssist;
    }

    public void setNpxgXgAssist(Double npxgXgAssist) {
        this.npxgXgAssist = npxgXgAssist;
    }

    public Double getXgPer90() {
        return xgPer90;
    }

    public void setXgPer90(Double xgPer90) {
        this.xgPer90 = xgPer90;
    }

    public Double getXgAssistPer90() {
        return xgAssistPer90;
    }

    public void setXgAssistPer90(Double xgAssistPer90) {
        this.xgAssistPer90 = xgAssistPer90;
    }

    public Double getXgXgAssistPer90() {
        return xgXgAssistPer90;
    }

    public void setXgXgAssistPer90(Double xgXgAssistPer90) {
        this.xgXgAssistPer90 = xgXgAssistPer90;
    }

    public Double getNpxgPer90() {
        return npxgPer90;
    }

    public void setNpxgPer90(Double npxgPer90) {
        this.npxgPer90 = npxgPer90;
    }

    public Double getNpxgXgAssistPer90() {
        return npxgXgAssistPer90;
    }

    public void setNpxgXgAssistPer90(Double npxgXgAssistPer90) {
        this.npxgXgAssistPer90 = npxgXgAssistPer90;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayerStats that = (PlayerStats) o;

        if (id != that.id) return false;
        if (player != null ? !player.equals(that.player) : that.player != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (team != null ? !team.equals(that.team) : that.team != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (club != null ? !club.equals(that.club) : that.club != null) return false;
        if (birthYear != null ? !birthYear.equals(that.birthYear) : that.birthYear != null) return false;
        if (games != null ? !games.equals(that.games) : that.games != null) return false;
        if (gamesStarts != null ? !gamesStarts.equals(that.gamesStarts) : that.gamesStarts != null) return false;
        if (minutes != null ? !minutes.equals(that.minutes) : that.minutes != null) return false;
        if (minutes90S != null ? !minutes90S.equals(that.minutes90S) : that.minutes90S != null) return false;
        if (goals != null ? !goals.equals(that.goals) : that.goals != null) return false;
        if (assists != null ? !assists.equals(that.assists) : that.assists != null) return false;
        if (goalsPens != null ? !goalsPens.equals(that.goalsPens) : that.goalsPens != null) return false;
        if (pensMade != null ? !pensMade.equals(that.pensMade) : that.pensMade != null) return false;
        if (pensAtt != null ? !pensAtt.equals(that.pensAtt) : that.pensAtt != null) return false;
        if (cardsYellow != null ? !cardsYellow.equals(that.cardsYellow) : that.cardsYellow != null) return false;
        if (cardsRed != null ? !cardsRed.equals(that.cardsRed) : that.cardsRed != null) return false;
        if (goalsPer90 != null ? !goalsPer90.equals(that.goalsPer90) : that.goalsPer90 != null) return false;
        if (assistsPer90 != null ? !assistsPer90.equals(that.assistsPer90) : that.assistsPer90 != null) return false;
        if (goalsAssistsPer90 != null ? !goalsAssistsPer90.equals(that.goalsAssistsPer90) : that.goalsAssistsPer90 != null)
            return false;
        if (goalsPensPer90 != null ? !goalsPensPer90.equals(that.goalsPensPer90) : that.goalsPensPer90 != null)
            return false;
        if (goalsAssistsPensPer90 != null ? !goalsAssistsPensPer90.equals(that.goalsAssistsPensPer90) : that.goalsAssistsPensPer90 != null)
            return false;
        if (xg != null ? !xg.equals(that.xg) : that.xg != null) return false;
        if (npxg != null ? !npxg.equals(that.npxg) : that.npxg != null) return false;
        if (xgAssist != null ? !xgAssist.equals(that.xgAssist) : that.xgAssist != null) return false;
        if (npxgXgAssist != null ? !npxgXgAssist.equals(that.npxgXgAssist) : that.npxgXgAssist != null) return false;
        if (xgPer90 != null ? !xgPer90.equals(that.xgPer90) : that.xgPer90 != null) return false;
        if (xgAssistPer90 != null ? !xgAssistPer90.equals(that.xgAssistPer90) : that.xgAssistPer90 != null)
            return false;
        if (xgXgAssistPer90 != null ? !xgXgAssistPer90.equals(that.xgXgAssistPer90) : that.xgXgAssistPer90 != null)
            return false;
        if (npxgPer90 != null ? !npxgPer90.equals(that.npxgPer90) : that.npxgPer90 != null) return false;
        if (npxgXgAssistPer90 != null ? !npxgXgAssistPer90.equals(that.npxgXgAssistPer90) : that.npxgXgAssistPer90 != null)
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
        result = 31 * result + (club != null ? club.hashCode() : 0);
        result = 31 * result + (birthYear != null ? birthYear.hashCode() : 0);
        result = 31 * result + (games != null ? games.hashCode() : 0);
        result = 31 * result + (gamesStarts != null ? gamesStarts.hashCode() : 0);
        result = 31 * result + (minutes != null ? minutes.hashCode() : 0);
        result = 31 * result + (minutes90S != null ? minutes90S.hashCode() : 0);
        result = 31 * result + (goals != null ? goals.hashCode() : 0);
        result = 31 * result + (assists != null ? assists.hashCode() : 0);
        result = 31 * result + (goalsPens != null ? goalsPens.hashCode() : 0);
        result = 31 * result + (pensMade != null ? pensMade.hashCode() : 0);
        result = 31 * result + (pensAtt != null ? pensAtt.hashCode() : 0);
        result = 31 * result + (cardsYellow != null ? cardsYellow.hashCode() : 0);
        result = 31 * result + (cardsRed != null ? cardsRed.hashCode() : 0);
        result = 31 * result + (goalsPer90 != null ? goalsPer90.hashCode() : 0);
        result = 31 * result + (assistsPer90 != null ? assistsPer90.hashCode() : 0);
        result = 31 * result + (goalsAssistsPer90 != null ? goalsAssistsPer90.hashCode() : 0);
        result = 31 * result + (goalsPensPer90 != null ? goalsPensPer90.hashCode() : 0);
        result = 31 * result + (goalsAssistsPensPer90 != null ? goalsAssistsPensPer90.hashCode() : 0);
        result = 31 * result + (xg != null ? xg.hashCode() : 0);
        result = 31 * result + (npxg != null ? npxg.hashCode() : 0);
        result = 31 * result + (xgAssist != null ? xgAssist.hashCode() : 0);
        result = 31 * result + (npxgXgAssist != null ? npxgXgAssist.hashCode() : 0);
        result = 31 * result + (xgPer90 != null ? xgPer90.hashCode() : 0);
        result = 31 * result + (xgAssistPer90 != null ? xgAssistPer90.hashCode() : 0);
        result = 31 * result + (xgXgAssistPer90 != null ? xgXgAssistPer90.hashCode() : 0);
        result = 31 * result + (npxgPer90 != null ? npxgPer90.hashCode() : 0);
        result = 31 * result + (npxgXgAssistPer90 != null ? npxgXgAssistPer90.hashCode() : 0);
        return result;
    }
}
