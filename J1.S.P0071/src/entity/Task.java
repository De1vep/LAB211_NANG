package entity;

import utility.Validate;
import static utility.Validate.getInt;
import constant.IConstant;

public class Task {

    private int id;
    private int taskTypeID;
    private String requirementName;
    private String date;
    private double planFrom;
    private double planTo;
    private String assignee;
    private String reviewer;

    public Task() {
    }

    public Task(int id,
            int taskTypeID,
            String requirementName,
            String date,
            double planFrom,
            double planTo,
            String assignee,
            String reviewer
    ) {
        this.id = id;
        this.taskTypeID = taskTypeID;
        this.requirementName = requirementName;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public int getTaskID() {
        return id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTaskID(int TaskID) {
        this.id = TaskID;
    }

    public int getTaskTypeID() {
        return taskTypeID;
    }

    public void setTaskTypeID(int taskTypeID) {
        this.taskTypeID = taskTypeID;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(double planFrom) {
        this.planFrom = planFrom;
    }

    public double getPlanTo() {
        return planTo;
    }

    public void setPlanTo(double planTo) {
        this.planTo = planTo;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    @Override
    public String toString() {
        double time = planTo - planFrom;
        String planTime = String.format("%.1f", time);
        String displayTaskTypeID = "";
        switch (taskTypeID) {
            case IConstant.REGEX_CODE:
                displayTaskTypeID = "Code";
                break;
            case IConstant.REGEX_DESIGN:
                displayTaskTypeID = "Design";
                break;
            case IConstant.REGEX_REVIEW:
                displayTaskTypeID = "Review";
                break;
            case IConstant.REGEX_TEST:
                displayTaskTypeID = "Test";
                break;
        }
        String result = String.format("|%-6d|%-20s|%-13s|%-13s|%-14s|%-13s|%-15s|",
                id, requirementName, displayTaskTypeID, date, planTime, assignee, reviewer);
        return result;
    }

    public void inputTask() {
        this.requirementName = Validate.getString(
                "Requirement Name:",
                "Invalid name!",
                IConstant.REGEX_NAME);
        this.taskTypeID = getInt(
                "Task Type:",
                "Numeric value out of range",
                "Invalid integer number!",
                1, 4
        );
        this.date = Validate.getString(
                "Input the date:",
                "invalid date!",
                IConstant.REGEX_DATE
        );
        this.planFrom = Validate.getDouble(
                "From:",
                "planFrom must be within 8-17h",
                "Invalid plan from!",
                8.0, 17.0
        );
        this.planTo = Validate.getDouble(
                "To:",
                "Plan To must be after planFrom and not after 17h30",
                "Invalid plan to!",
                planFrom + 0.5, 17.5
        );
        this.assignee = Validate.getString(
                "Assignee:",
                "Invalid assignee!",
                IConstant.REGEX_NAME
        );
        this.reviewer = Validate.getString(
                "Reviewer:",
                "Invalid reviewer!",
                IConstant.REGEX_NAME
        );
    }
}
