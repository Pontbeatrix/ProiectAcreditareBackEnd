package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

public class CommentSteps extends BaseSteps {

    @Step
    public void commentMenuButton() {
        commentPage.clickCommentMenuButton();

    }

    @Step
    public void pendingButton() {
        commentPage.clickPendingButton();

    }

    @Step
    public void hoverPendingComments() {
        commentPage.clickHoverPendingComments();

    }

    @Step
    public void approveCommentButton() {
        commentPage.clickApproveCommentButton();

    }

    @Step
    public void trashCommentButton() {
        commentPage.clickTrashCommentButton();

    }

    @Step
    public void hoverTrashButton() {
        commentPage.clickHoverTrashComments();

    }

    @Step
    public void deleteCommentsButton() {
        commentPage.clickDeleteCommentsButton();

    }

}