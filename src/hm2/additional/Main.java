package hm2.additional;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args ){

        ArrayList<Posts> posts = new ArrayList<>();
        posts.add(new Posts(1,1,"title1","body1"));
        posts.add(new Posts(2,2,"title2","body2"));
        posts.add(new Posts(3,3,"title3","body3"));
        posts.add(new Posts(4,4,"title4","body4"));


        ArrayList<Comments> comments = new ArrayList<>();
        comments.add(new Comments(1,2,"name1","rgergerer@gmail.com","body1"));
        comments.add(new Comments(2,2,"name2","dfhgdfh@gmail.com","body2"));
        comments.add(new Comments(3,3,"name3","fdgdfhgdf@gmail.com","body3"));
        comments.add(new Comments(1,1,"name4","gfvhfghfg@gmail.com","body4"));
        comments.add(new Comments(4,4,"name5","gfvhfghfg@gmail.com","body4"));
        comments.add(new Comments(5,5,"name6","gfvhfghfg@gmail.com","body4"));
        comments.add(new Comments(2,2,"name7","gfvhfghfg@gmail.com","body4"));
        comments.add(new Comments(3,3,"name8","gfvhfghfg@gmail.com","body4"));


        for (Posts post : posts) {
            for (Comments comment : comments) {
                if (post.getId() == comment.getId()){
                    post.getComment().add(comment);
                }
            }
        }

        }





    }


