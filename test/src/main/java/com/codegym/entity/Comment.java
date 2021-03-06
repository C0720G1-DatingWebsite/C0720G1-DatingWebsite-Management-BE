package c0720g1be.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(columnDefinition = "TEXT")
    String content;
    @Column(name = "date_comment", columnDefinition = "DATETIME")
    String dateComment;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "post_id")
    Post post;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn (name = "account_id")
    Account account;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn (name = "comment_id")
    Comment comment;

    public Comment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateComment() {
        return dateComment;
    }

    public void setDateComment(String dateComment) {
        this.dateComment = dateComment;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
