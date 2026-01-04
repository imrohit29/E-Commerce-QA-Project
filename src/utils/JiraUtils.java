package utils;

public class JiraUtils {

    public void createIssue(String projectKey, String summary, String description) {
        System.out.println("Jira Issue Created: " + summary);
    }

    public void updateIssueStatus(String issueID, String status) {
        System.out.println("Jira Issue " + issueID + " updated to " + status);
    }
}
