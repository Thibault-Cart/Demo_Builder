public class Student {
    private String name;
    private int age;
    private String email;
    private String phone;

    public Student(StudentBuilder build) {
        this.age = build.age;
        this.email = build.email;
        this.name = build.name;
        this.phone = build.phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class StudentBuilder {
        private String name;
        private int age;
        private String email;
        private String phone;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
