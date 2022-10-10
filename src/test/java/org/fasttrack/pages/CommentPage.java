package org.fasttrack.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CommentPage extends PageObject {

    @FindBy(css = "#menu-comments")
    private WebElementFacade commentMenuButton;

    @FindBy(css = "a[href='http://qa3.fasttrackit.org:8008/wp-admin/edit-comments.php?comment_status=moderated']")
    private WebElementFacade pendingButton;

    @FindBy(css = ".unapproved .comment.column-comment.has-row-actions.column-primary ")
    private WebElementFacade hoverPendingComments;

    @FindBy(css = ".row-actions .approve")
    private WebElementFacade approveCommentButton;

    @FindBy(css = "a[href='http://qa3.fasttrackit.org:8008/wp-admin/edit-comments.php?comment_status=trash']")
    private WebElementFacade trashCommentButton;

    @FindBy(css = ".comment.column-comment.has-row-actions.column-primary ")
    private WebElementFacade hoverTrashComments;

    @FindBy(css = ".row-actions .delete .vim-d.vim-destructive")
    private WebElementFacade deleteCommentsButton;


    public void clickCommentMenuButton() {
        clickOn(commentMenuButton);
    }

    public void clickPendingButton() {
        clickOn(pendingButton);
    }

    public void clickHoverPendingComments() {
        clickOn(hoverPendingComments);
    }

    public void clickApproveCommentButton() {
        clickOn(approveCommentButton);
    }

    public void clickTrashCommentButton() {
        clickOn(trashCommentButton);
    }

    public void clickHoverTrashComments() {
        clickOn(hoverTrashComments);
    }

    public void clickDeleteCommentsButton() {
        clickOn(deleteCommentsButton);
    }


}
