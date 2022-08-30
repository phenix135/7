package Object;

public class Student {//extends Object(默认继承object)
    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 比较者s1======主调，代表本类this
     * 被比较者s2=====o
     * @param o
     * @return
     */

    public boolean equals(Object o) {
        //1.判断o是不是学生对象
        if (o instanceof Student) {
            //2.判断两个对象的内容是否一样
            Student s2 = (Student) o;
            if (this.name.equals(s2.name) && this.age == s2.age && this.sex == s2.sex) {
                return true;
            } else { return false;
            }
        } else {
            return false;
        }

    }
    public String toString() {
        return  "name:"+name+"sex:"+sex+"age:"+age;
    }
}
