package org.fasttrack.features;

import org.fasttrack.utils.Constans;
import org.junit.Test;

public class CommentTest extends BaseTest {

    @Test
    public void approveCommentsByAdmin() {
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        commentSteps.commentMenuButton();
        commentSteps.pendingButton();
        commentSteps.hoverPendingComments();
        commentSteps.approveCommentButton();
    }

    @Test
    public void deleteCommentsByAdmin() {
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.clickLogin();
        commentSteps.commentMenuButton();
        commentSteps.trashCommentButton();
        commentSteps.hoverTrashButton();
        commentSteps.deleteCommentsButton();

    }
}
