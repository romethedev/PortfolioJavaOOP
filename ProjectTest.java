public class ProjectTest {
    public static void main(String[] args) {
        Project project = new Project("House Renovation", "Let's make some structural changes to our home", 20000.00);
        System.out.println(project.elevatorPitch());    //create our elevator pitch using the parameters passed in above

        Project sideProject = new Project();
        sideProject.setProjectName("Freelance Work");
        sideProject.setProjectDescription("Hired to create a landing page for a friend's business");
        sideProject.setInitialCost(4000.00);
        System.out.println(sideProject.elevatorPitch());
    }
}
