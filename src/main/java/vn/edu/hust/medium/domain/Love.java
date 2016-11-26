package vn.edu.hust.medium.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Love.
 */
@Entity
@Table(name = "love")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "love")
public class Love implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id")
    private Integer userID;

    @Column(name = "story_id")
    private Integer storyID;

    @Column(name = "user_name")
    private String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserID() {
        return userID;
    }

    public Love userID(Integer userID) {
        this.userID = userID;
        return this;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getStoryID() {
        return storyID;
    }

    public Love storyID(Integer storyID) {
        this.storyID = storyID;
        return this;
    }

    public void setStoryID(Integer storyID) {
        this.storyID = storyID;
    }

    public String getUserName() {
        return userName;
    }

    public Love userName(String userName) {
        this.userName = userName;
        return this;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Love love = (Love) o;
        if(love.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, love.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Love{" +
            "id=" + id +
            ", userID='" + userID + "'" +
            ", storyID='" + storyID + "'" +
            ", userName='" + userName + "'" +
            '}';
    }
}