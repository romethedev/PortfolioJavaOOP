import java.util.*;

//Optional Challenges
// Create a Portfolio class that will keep an ArrayList of Projects in the field projects. Use generics to ensure these are Project objects.

// ● Add the appropriate getters/setters/constructors for this class to work

// ● Add the getPortfolioCost method that calculates and returns the cost to buy the entire portfolio.

// ● Add the showPortfolio method that will print all the project elevator pitches, followed by the total cost.



public class Portfolio {
    private ArrayList<Project> projects = new ArrayList<>();
    //Like our Project class has fields of Name, Description, and InitialCost
    //Our Portfolio class will only have one field which is "projects" which is of type ArrayList

    public Portfolio(){
    }

    //setter
    //instance method that adds a project to our portfolio
    public void addProject(Project project){        //takes in one parameter whos type is our Project object with the variable name of project
        this.projects.add(project);     //add this project to our projects field
    }

    //getter
    //instance method to get all projects within our portfolio
    public ArrayList<Project> getProjects(){
        return this.projects;       //simply return this portfolio's projects
    }

    //method to calculate and return the cost to buy the entire portfolio by creating a sum variable and iterating through our projects array list and running our getInitialCost method and adding that to our sum
    public float getPortfolioCost(){
        float sum = 0.0f;       //create a variable to store our sum with the type float, we cant set a float to equal 0 initally it must equal either 0f or 0.0f
        for(int i = 0; i < this.projects.size(); i++){
            sum += this.projects.get(i).getInitialCost();
        }
        return sum;
    }

    //method to show all the elevator pitches within a portfolio followed by the total cost
    public void showPortfolio(){
        System.out.println("This Portfolio contains: ");
        for(int i = 0; i < this.projects.size(); i++){
            System.out.println(this.projects.get(i).elevatorPitch());   //run our getElevatorPitch method on each project during loop and print it out
        }
        System.out.println("The Cost for this entire Portfolio: $" + this.getPortfolioCost());     //print out a string showing our portfolio cost and call our getPortfolioCost method to display
    }

}
