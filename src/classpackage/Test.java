package classpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Students a = new Students();
		Teacher b = new Teacher();
		Course c= new Course("c����");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		String mName = a.getName();
		String mNumber = a.getNumber();
		String mSex = a.getSex();
		a.setNumber("2020322085");
		a.setName("��ͬѧ");
		a.setSex("��");
		mName = a.getName();
		mNumber = a.getNumber();
		mSex = a.getSex();
		String teachernumber=b.getNumber();
		String teachername = b.getName();
		String teacherclass =b.getInstruction();
		b.setName("��ͬѧ");
		b.setInstruction("c#����");
		teachername = b.getName();
		teachernumber=b.getNumber();
		teacherclass=b.getInstruction();
		String coursenumber =c.getNumber();
	
		String courseplace =c.getPalce();
		String courseteacher=c.getTeacher();
		c.setNumber("211");
	
		c.setPalce("3��¥");
		c.setTeacher("����ʦ");
		coursenumber =c.getNumber();

		courseplace =c.getPalce();
		courseteacher=c.getTeacher();
		System.out.println("ѧ��ѡ��ϵͳ");
		System.out.println("ѧ����� : " + mNumber);
		System.out.println("���� :   " + mName);
		System.out.println("�Ա� :" + mSex);
		a.setClasss("c#");
		String mClass = a.getClasss();
		System.out.println("�γ���:" + mClass);
		System.out.println("���� :"+coursenumber);
		System.out.println("�γ� :"+c);
		System.out.println("��ѧ¥ :"+courseplace);
		System.out.println("ʱ�� :"+df.format(new Date()));
		System.out.println("��ʦ���� :"+courseteacher);
        System.out.println("------------------------------------------");
        c.xuanke(a.name);
        System.out.println("------------------------------------------");
	    c.duike(a.name);
       
	}
}
