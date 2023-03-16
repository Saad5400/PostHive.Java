package web;

import models.*;
import java.util.ArrayList;

public class Web {

    // will be assigned later
    private final String url = "temp";

    // init the object with url and stuff
    public Web() {

    }

    /**
    * Register a new usre in the api
    *
    * @param  user   oject which represents the user
    * @return         a boolean if user was registerd or not
    */
    public boolean registerUser(User user) {

        // TODO: complete the method

        return false;
    }

    /**
    * Request posts from the api
    *
    * @return         posts sorted by most recent
    */
    public ArrayList<Post> getPosts() {

        // TODO: complete the method

        return new ArrayList<Post>();
    }

    /**
    * Request comments on a specfic post
    *
    * @param  postId   the wanted post's comments id
    * @return         the post-incremented value
    */
    public ArrayList<Comment> getCommentsOnPost(Integer postId) {

        // TODO: complete the method
        
        return new ArrayList<Comment>();
    }

    /**
    * Post a post :)
    *
    * @param  post   object represinting the post
    * @return         a boolean if post was posted
    */
    public boolean postPost(Post post) {

        // TODO: complete the method
        
        return false;
    }

    /**
    * Post a comment
    *
    * @param  comment   object represinting the comment
    * @return         a boolean if comment was posted
    */
    public boolean postComment(Comment comment) {

        // TODO: complete the method
        
        return false;
    }
}
