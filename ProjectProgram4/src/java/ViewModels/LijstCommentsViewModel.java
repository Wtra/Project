/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ViewModels;

import DAL.Comment;
import java.util.List;

/**
 *
 * @author 11627
 */
public class LijstCommentsViewModel {
    
    private List<Comment> comments;

    public LijstCommentsViewModel(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
