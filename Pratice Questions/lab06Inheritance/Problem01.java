package lab06Inheritance;

import java.util.*;

public class Problem01

{

String name;

int age;

String address;

public Problem01()

{

this.name="unknown";

this.age=0;

this.address="not avaliable";

}

public void setinfo(int age,String name)

{

this.name=name;

this.age=age;

}

public void setinfo(int age ,String name,String address)

{

this.name=name;

this.age=age;

this.address=address;

}

@Override

public String toString()

{

return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";

}

public static void main(String[] args)

{

List<Problem01> stu=new ArrayList<>();

stu.add(new Problem01());

stu.add(new Problem01());

stu.add(new Problem01());

stu.add(new Problem01());

stu.add(new Problem01());

stu.add(new Problem01());

stu.add(new Problem01());

stu.add(new Problem01());

stu.add(new Problem01());

stu.add(new Problem01());

stu.get(0).setinfo(55, "Name1");

stu.get(2).setinfo(50, "Name3","Bombay,India");

stu.get(3).setinfo(45, "Name4","Bhopal,India");

stu.get(5).setinfo(30, "Name6","Pune,India");

stu.get(6).setinfo(65, "Name7","Delhi,India");

stu.get(8).setinfo(55, "Name9");

for(Problem01 s :stu)

{

System.out.println(s);

}

}

}