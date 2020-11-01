# 2020322085 G201 林钰宸
# JAVA-2
## 1.实验内容
+ 学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
## 2.实验对象
```
  static String number;
	static String name;
	static String sex;
	public Personner(String number,String name,String sex) {
		this.number=number;
		this.name=name;
		this.sex=sex;
    }
```
## 3.实验方法

```
 public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
```
## 4.运行方法
```
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
```
## 4.实验结果
```
       https://github.com/lyc-eng/Selectcourse/blob/main/ww.png
```
## 5.实验感想

