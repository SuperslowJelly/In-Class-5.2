package io.github.superslowjelly.inclass52;

public enum JobTitles {

    OWNER(2_147_483_647),
    MANGER(32_767),
    ADMIN(16_383),
    MODERATOR(8_191),
    HELPER(4_095);

    private final int SALARY;

    JobTitles(int salary) {
        this.SALARY = salary;
    }

    public int getSalary() {
        return this.SALARY;
    }

}
