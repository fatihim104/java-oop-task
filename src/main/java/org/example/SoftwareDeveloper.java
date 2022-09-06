package org.example;


public class SoftwareDeveloper extends Employee implements ISoftwareDeveloper{
    private String skills;
    private  int experience;
    private Employee manager;

    public SoftwareDeveloper(int id, String firstName, String lastName, int age, double salary, String department, Employee manager, String skills, int experience) {
        super(id, firstName, lastName, age, salary, department);
        this.manager = manager;
        this.skills = skills;
        this.experience = experience;
    }


    public SoftwareDeveloper(int id, String firstName, String lastName, int age, double salary, String department) {
        super(id, firstName, lastName, age, salary, department);
    }

    @Override
    public void writeCode() {
        System.out.println("Code has been written by : " + this.getFirstName() + " " + this.getLastName());
    }

    @Override
    public void testCode() {
        System.out.println("Code has tested by : " + this.getFirstName() + " " + this.getLastName());
    }

    @Override
    public void pushChanges() {
        System.out.println("Code has been pushed by : " + this.getFirstName() + " " + this.getLastName());
    }

    public String getSkills() {
        return skills;
    }

    // A SoftwareDeveloper has Supervisor, skills, experience attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager
}
