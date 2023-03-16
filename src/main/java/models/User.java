package models;

import java.util.ArrayList;

// TODO: Complete the class
public class User {

    // some example vars
    public final int id;
    
    public ArrayList<Comment> postedComments;
    public ArrayList<Post> postedPosts;

    public ArrayList<Comment> upvotedComments;
    public ArrayList<Post> upvotedPosts;

    public ArrayList<Comment> downvotedComments;
    public ArrayList<Post> downvotedPosts;

    public User(int id) {
        // only for example, may change later
        this.id = id;
    }

}
