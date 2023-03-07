package hm2.additional;

public class Main {
    public static void main(String[] args ){

        Posts [] posts = {new Posts(1,1,"gghfhfghhfg","gfdhgfhgffh"),
                          new Posts(2,2,"fghgfhfghfghgf","ghghgfgf"),
                          new Posts(3,3,"fgdhfghgfh","fdgdfgfddffd"),
                          new Posts(4,4,"fdhgdfhfghgf","hyhhytrhyrtytr")};

        Comments [] comments = {new Comments(1,2,"fgdfgdffdgdf","rgergerer@gmail.com","fdfghfhg"),
                                new Comments(2,2,"fgdfgfd","dfhgdfh@gmail.com","fdgdfdfgdf"),
                                new Comments(3,3,"dfgdfgdf","fdgdfhgdf@gmail.com","dfghfghgf"),
                                new Comments(4,4,"dghgfhfg","gfvhfghfg@gmail.com","dfhfghgfhb")};

        for (Posts post : posts) {
            for (Comments comment : comments) {
                if (post.getPostID() == comment.getCommentID()){
                    System.out.println(post + " " + comment);
                }
            }
        }


    }

}
