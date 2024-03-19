package practice.model;

public class Student {
    private String studentId;
    private String name;
    private byte age;
    private boolean gender;
    private float score;

    public Student() {
    }

    public Student(String studentId, String name, byte age, boolean gender, float score) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.score = score;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
