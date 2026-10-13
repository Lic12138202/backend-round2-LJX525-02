package src;

public  class Student {
    private String name;
    private String studentID;
    private int score;


    //无参构造方法  （不引入参name,studentID,score等参。
    public Student() {
    }

    //有参构造方法
    public Student(String name, String studentID, int score) {
        this.name = name;
        this.studentID = studentID;
        this.score = score;
    }

    public String getName() {       //权限+类型+getName() 获取名字
        return name;         //返还给name栏
    }

    public void setName(String name) {       //权限+执行结果+setName() 设置名字
        this.name = name;        //赋值 下面操作同理
    }       //设置getter setter

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {

        this.studentID = studentID;
    }       //设置getter setter

    public int getScore() {
        return score;
    }
    public void setScore(int score) {          //分别设置getter和setter
        if (score >= 0 && score <= 100) {
            this.score = score;
            System.out.println("数据录入成功！");
        } else {
            System.out.println("【警告】非法数据 " + score + "！已自动拦截并修正为 0。");
            this.score = 0;}
    }

    public void introduce() {        //引入introduce标准格式

        System.out.println("我是" + name + "，学号" + studentID + "，成绩" + score);
    }

    public static void main(String[] args) {
        Student a = new Student();
        a.name = "张三";
        a.studentID = "202601";
        a.score = 100;      //输入同学a的信息
        a.introduce();      //执行上面定义的针对a的introduce，及introduce()方法

        Student b = new Student();
        b.name = "李四";
        b.studentID = "202602";
        b.score = 60;
        b.introduce();      //有参构造，分别填入

        Student c = new Student("王五", "202603", 0);
        c.introduce();//无参构造，一次填入
    }

    public static class GraduateStudent extends Student{
        private String advisor;
        public GraduateStudent(String name, String studentID, int score,String advisor){
            super(name,studentID,score);
            this.advisor = advisor;
        }

        public String getAdvisor() {
            return advisor;
        }

        public void setAdvisor(String advisor) {
            this.advisor = advisor;
        }
        @Override
        public void introduce() {
            System.out.println("我是" + getName() + "，学号" + getStudentID()+ "，成绩" + getScore() + "，我的导师是" + advisor);
        }
        public void research() {
        System.out.println("我在做科研");
        }
        public static void main (String[] args) {
            GraduateStudent d = new GraduateStudent("赵四", "202501",99 , "凌老师");
            d.introduce();
            d.research();
            Student s = new GraduateStudent("灵灵","119",99,"赵四");
            s.introduce();
        }
    }
}


