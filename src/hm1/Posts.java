package hm1;

public class Posts {
   private Number userID;
   private Number id;
   private String title;
   private String body;

    public Number getUserID() {
        return userID;
    }

    public void setUserID(Number userID) {
        this.userID = userID;
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Posts(){

     }

    public Posts(Number userID, Number id, String title, String body) {
        this.userID = userID;
        this.id = id;
        this.title = title;
        this.body = body;
    }


    @Override
    public String toString() {
        return "Posts{" +
                "userID=" + userID +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
