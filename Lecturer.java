package Company;
public class Lecturer {
        private String name;
        private String course;
        private final int age;
        private int date;
        Lecturer(String name,  int age) {this.name = name;this.age = age;}
        public void setName(String newName) {
            this.name = newName;
        }
        public void setDate(int date) {this.date = date;}
    public void setCourse(String course) {
        this.course = course;
    }
        public String getName() {
            return name;
        }
    public String toString() {return course+" "+getName()+" "+age;}
    }

