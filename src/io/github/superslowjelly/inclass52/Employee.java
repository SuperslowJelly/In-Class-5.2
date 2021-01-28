package io.github.superslowjelly.inclass52;

public class Employee {

    public Employee(String name, JobTitles job) {
        this.name = name;
        this.job = job;
    }

    private String name;

    private JobTitles job;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobTitles getJob() {
        return this.job;
    }

    public void setJob(JobTitles job) {
        this.job = job;
    }

}
