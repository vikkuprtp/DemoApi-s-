package com.vp.iqnextintern1.models;
import jakarta.persistence.*;
@Entity
@Table(name = "player_defence", schema = "fifa", catalog = "")
public class PlayerDefence {
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
    @Column(name = "minutes_90s")
    private Double minutes90S;
    @Basic
    @Column(name = "tackles")
    private Integer tackles;
    @Basic
    @Column(name = "tackles_won")
    private Integer tacklesWon;
    @Basic
    @Column(name = "tackles_def_3rd")
    private Integer tacklesDef3Rd;
    @Basic
    @Column(name = "tackles_mid_3rd")
    private Integer tacklesMid3Rd;
    @Basic
    @Column(name = "tackles_att_3rd")
    private Integer tacklesAtt3Rd;
    @Basic
    @Column(name = "dribble_tackles")
    private Integer dribbleTackles;
    @Basic
    @Column(name = "dribbles_vs")
    private Integer dribblesVs;
    @Basic
    @Column(name = "dribble_tackles_pct")
    private Double dribbleTacklesPct;
    @Basic
    @Column(name = "dribbled_past")
    private Integer dribbledPast;
    @Basic
    @Column(name = "blocks")
    private Integer blocks;
    @Basic
    @Column(name = "blocked_shots")
    private Integer blockedShots;
    @Basic
    @Column(name = "blocked_passes")
    private Integer blockedPasses;
    @Basic
    @Column(name = "interceptions")
    private Integer interceptions;
    @Basic
    @Column(name = "tackles_interceptions")
    private Integer tacklesInterceptions;
    @Basic
    @Column(name = "clearances")
    private Integer clearances;
    @Basic
    @Column(name = "errors")
    private Integer errors;

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

    public Double getMinutes90S() {
        return minutes90S;
    }

    public void setMinutes90S(Double minutes90S) {
        this.minutes90S = minutes90S;
    }

    public Integer getTackles() {
        return tackles;
    }

    public void setTackles(Integer tackles) {
        this.tackles = tackles;
    }

    public Integer getTacklesWon() {
        return tacklesWon;
    }

    public void setTacklesWon(Integer tacklesWon) {
        this.tacklesWon = tacklesWon;
    }

    public Integer getTacklesDef3Rd() {
        return tacklesDef3Rd;
    }

    public void setTacklesDef3Rd(Integer tacklesDef3Rd) {
        this.tacklesDef3Rd = tacklesDef3Rd;
    }

    public Integer getTacklesMid3Rd() {
        return tacklesMid3Rd;
    }

    public void setTacklesMid3Rd(Integer tacklesMid3Rd) {
        this.tacklesMid3Rd = tacklesMid3Rd;
    }

    public Integer getTacklesAtt3Rd() {
        return tacklesAtt3Rd;
    }

    public void setTacklesAtt3Rd(Integer tacklesAtt3Rd) {
        this.tacklesAtt3Rd = tacklesAtt3Rd;
    }

    public Integer getDribbleTackles() {
        return dribbleTackles;
    }

    public void setDribbleTackles(Integer dribbleTackles) {
        this.dribbleTackles = dribbleTackles;
    }

    public Integer getDribblesVs() {
        return dribblesVs;
    }

    public void setDribblesVs(Integer dribblesVs) {
        this.dribblesVs = dribblesVs;
    }

    public Double getDribbleTacklesPct() {
        return dribbleTacklesPct;
    }

    public void setDribbleTacklesPct(Double dribbleTacklesPct) {
        this.dribbleTacklesPct = dribbleTacklesPct;
    }

    public Integer getDribbledPast() {
        return dribbledPast;
    }

    public void setDribbledPast(Integer dribbledPast) {
        this.dribbledPast = dribbledPast;
    }

    public Integer getBlocks() {
        return blocks;
    }

    public void setBlocks(Integer blocks) {
        this.blocks = blocks;
    }

    public Integer getBlockedShots() {
        return blockedShots;
    }

    public void setBlockedShots(Integer blockedShots) {
        this.blockedShots = blockedShots;
    }

    public Integer getBlockedPasses() {
        return blockedPasses;
    }

    public void setBlockedPasses(Integer blockedPasses) {
        this.blockedPasses = blockedPasses;
    }

    public Integer getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(Integer interceptions) {
        this.interceptions = interceptions;
    }

    public Integer getTacklesInterceptions() {
        return tacklesInterceptions;
    }

    public void setTacklesInterceptions(Integer tacklesInterceptions) {
        this.tacklesInterceptions = tacklesInterceptions;
    }

    public Integer getClearances() {
        return clearances;
    }

    public void setClearances(Integer clearances) {
        this.clearances = clearances;
    }

    public Integer getErrors() {
        return errors;
    }

    public void setErrors(Integer errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayerDefence that = (PlayerDefence) o;

        if (id != that.id) return false;
        if (player != null ? !player.equals(that.player) : that.player != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (team != null ? !team.equals(that.team) : that.team != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (birthYear != null ? !birthYear.equals(that.birthYear) : that.birthYear != null) return false;
        if (minutes90S != null ? !minutes90S.equals(that.minutes90S) : that.minutes90S != null) return false;
        if (tackles != null ? !tackles.equals(that.tackles) : that.tackles != null) return false;
        if (tacklesWon != null ? !tacklesWon.equals(that.tacklesWon) : that.tacklesWon != null) return false;
        if (tacklesDef3Rd != null ? !tacklesDef3Rd.equals(that.tacklesDef3Rd) : that.tacklesDef3Rd != null)
            return false;
        if (tacklesMid3Rd != null ? !tacklesMid3Rd.equals(that.tacklesMid3Rd) : that.tacklesMid3Rd != null)
            return false;
        if (tacklesAtt3Rd != null ? !tacklesAtt3Rd.equals(that.tacklesAtt3Rd) : that.tacklesAtt3Rd != null)
            return false;
        if (dribbleTackles != null ? !dribbleTackles.equals(that.dribbleTackles) : that.dribbleTackles != null)
            return false;
        if (dribblesVs != null ? !dribblesVs.equals(that.dribblesVs) : that.dribblesVs != null) return false;
        if (dribbleTacklesPct != null ? !dribbleTacklesPct.equals(that.dribbleTacklesPct) : that.dribbleTacklesPct != null)
            return false;
        if (dribbledPast != null ? !dribbledPast.equals(that.dribbledPast) : that.dribbledPast != null) return false;
        if (blocks != null ? !blocks.equals(that.blocks) : that.blocks != null) return false;
        if (blockedShots != null ? !blockedShots.equals(that.blockedShots) : that.blockedShots != null) return false;
        if (blockedPasses != null ? !blockedPasses.equals(that.blockedPasses) : that.blockedPasses != null)
            return false;
        if (interceptions != null ? !interceptions.equals(that.interceptions) : that.interceptions != null)
            return false;
        if (tacklesInterceptions != null ? !tacklesInterceptions.equals(that.tacklesInterceptions) : that.tacklesInterceptions != null)
            return false;
        if (clearances != null ? !clearances.equals(that.clearances) : that.clearances != null) return false;
        if (errors != null ? !errors.equals(that.errors) : that.errors != null) return false;

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
        result = 31 * result + (minutes90S != null ? minutes90S.hashCode() : 0);
        result = 31 * result + (tackles != null ? tackles.hashCode() : 0);
        result = 31 * result + (tacklesWon != null ? tacklesWon.hashCode() : 0);
        result = 31 * result + (tacklesDef3Rd != null ? tacklesDef3Rd.hashCode() : 0);
        result = 31 * result + (tacklesMid3Rd != null ? tacklesMid3Rd.hashCode() : 0);
        result = 31 * result + (tacklesAtt3Rd != null ? tacklesAtt3Rd.hashCode() : 0);
        result = 31 * result + (dribbleTackles != null ? dribbleTackles.hashCode() : 0);
        result = 31 * result + (dribblesVs != null ? dribblesVs.hashCode() : 0);
        result = 31 * result + (dribbleTacklesPct != null ? dribbleTacklesPct.hashCode() : 0);
        result = 31 * result + (dribbledPast != null ? dribbledPast.hashCode() : 0);
        result = 31 * result + (blocks != null ? blocks.hashCode() : 0);
        result = 31 * result + (blockedShots != null ? blockedShots.hashCode() : 0);
        result = 31 * result + (blockedPasses != null ? blockedPasses.hashCode() : 0);
        result = 31 * result + (interceptions != null ? interceptions.hashCode() : 0);
        result = 31 * result + (tacklesInterceptions != null ? tacklesInterceptions.hashCode() : 0);
        result = 31 * result + (clearances != null ? clearances.hashCode() : 0);
        result = 31 * result + (errors != null ? errors.hashCode() : 0);
        return result;
    }
}
