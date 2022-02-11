//Create a Project class that has the fields of name and description
public class Project {
    private String name;
    private String description;

    //*Optional Challenge: Add an additional initialCost member variable that is of type double and has both getters and setters
    private Double initialCost;

    //Overload the constructor method in three different ways
    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Project(String name, String description, Double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    //Create getters and setters for each field
    //getter
    public String getProjectName() {
        return name;
    }

    //setter
    public void setProjectName(String projectName) {
        name = projectName;
    }

    //getter
    public String getProjectDescription() {
        return description;
    }

    //setter
    public void setProjectDescription(String projectDescription) {
        description = projectDescription;
    }

    //getter
    public Double getInitialCost() {
        return initialCost;
    }

    //setter
    public void setInitialCost(Double projectInitialCost) {
        initialCost = projectInitialCost;
    }

    //Create an instance method called elevatorPitch that will return the name and description separated by a colon.
	public String elevatorPitch() {
        //Add this to the elevator pitch in parentheses after the name, e.g.: name (cost): description
		return this.name + " ($" + this.initialCost + "): " + this.description;
	}

}
