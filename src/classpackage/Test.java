package classpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Students a = new Students();
		Teacher b = new Teacher();
		Course c= new Course("c语言");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String mName = a.getName();
		String mNumber = a.getNumber();
		String mSex = a.getSex();
		a.setNumber("2020322085");
		a.setName("林同学");
		a.setSex("男");
		mName = a.getName();
		mNumber = a.getNumber();
		mSex = a.getSex();
		String teachernumber=b.getNumber();
		String teachername = b.getName();
		String teacherclass =b.getInstruction();
		b.setName("林同学");
		b.setInstruction("c#语言");
		teachername = b.getName();
		teachernumber=b.getNumber();
		teacherclass=b.getInstruction();
		String coursenumber =c.getNumber();
	
		String courseplace =c.getPalce();
		String courseteacher=c.getTeacher();
		c.setNumber("211");
	
		c.setPalce("3号楼");
		c.setTeacher("李老师");
		coursenumber =c.getNumber();

		courseplace =c.getPalce();
		courseteacher=c.getTeacher();
		System.out.println("学生选课系统");
		System.out.println("学生编号 : " + mNumber);
		System.out.println("姓名 :   " + mName);
		System.out.println("性别 :" + mSex);
		a.setClasss("c#");
		String mClass = a.getClasss();
		System.out.println("课程名:" + mClass);
		System.out.println("教室 :"+coursenumber);
		System.out.println("课程 :"+c);
		System.out.println("教学楼 :"+courseplace);
		System.out.println("时间 :"+df.format(new Date()));
		System.out.println("教师姓名 :"+courseteacher);
        System.out.println("------------------------------------------");
        c.xuanke(a.name);
        System.out.println("------------------------------------------");
	    c.duike(a.name);
       
	}
}
