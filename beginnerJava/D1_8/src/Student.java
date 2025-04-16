
public class Student {
	int num;
	String name;
	String sex;
	int age;
	String cla;
	public Student(int num, String name, String sex, int age, String cla) {
		super();
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.cla = cla;
	}
	public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }
	public Student(){
	}
}
