package classpackage;
 class Personner{
	static String number;
	static String name;
	static String sex;
	public Personner(String number,String name,String sex) {
		this.number=number;
		this.name=name;
		this.sex=sex;
		
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
	
}
public class Students extends Personner{
	public Students(String number, String name, String sex) {
		super(number, name, sex);	
	}
	public Students() {
		super(number, name, sex);
	}
    String classs;
	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}
	
}
class Teacher extends Personner{
	public Teacher(String number, String name, String sex) {
		super(number, name, sex);
	}
	public Teacher() {
		super(number, name, sex);
	}
	String  instruction;

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	
}
class Course  {
	String Name=null;
	public Course(String name) {
		this.Name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Name;
	}
	int arress;
	String time;
	String number;
	public int getArress() {
		return arress;
	}
	public void setArress(int arress) {
		this.arress = arress;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	String palce;
	String teacher;
	String [] a= {"c语言","C#","数据库"};
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPalce() {
		return palce;
	}
	public void setPalce(String palce) {
		this.palce = palce;
	}
	
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	public void xuanke(String name){
		Students students=new Students();
		students.getName();
		students.setNumber("2020322085");
		students.setName("林同学");
		String bh;
		bh=students.getNumber();
	    if(students.getNumber()=="2020322085") {
	    	arress=301;time="7:00";
	    	System.out.println("姓名："+students.getName());
	    	System.out.println("选择的课程 ："+a[0]);
	    	System.out.println("地点："+arress+"教室");
	    	System.out.println("时间："+time);
	    	
	    }else  {
	    	System.out.println("你输入的课程有误");
	    }
	}
	public void duike(String name) {
		Students students=new Students();
		students.getName();
		students.setNumber("2020322081");
		students.setName("林同学");
		String bh;
		bh=students.getNumber();
		if(students.getNumber()=="2020322081") {
			System.out.println("学生姓名："+students.getName());
			System.out.println("你已经退课了，其重新选课");
		}
	}

	
	
	
	
}

