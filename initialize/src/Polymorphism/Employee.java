package Polymorphism;

import java.sql.SQLClientInfoException;

public class Employee {
    private String name;
    public  double earning(){
        return 0;
    }
    public String getInfo(){
        System.out.println(name+':');
        earning();
        return name;
    }
}

class SalaryEmployee extends Employee{
    private double salary;  //薪资
    private int workDay;  //工作日天数
    private int leveDay;  // 请假天数

    @Override
    public double earning() {
        return salary - ((salary/workDay)*leveDay);
    }
}
class HourEmployee extends Employee{
    private int wordHour = 0;   //工作小时
    private double hourSalary = 0.0;  //每小时薪资

    @Override
    public double earning() {
        return  hourSalary*wordHour;
    }
}

class Manager extends SalaryEmployee{
    private double prizeSalary = 0;  //奖金比例

    @Override
    public double earning() {
        return super.earning()*(1+prizeSalary);
    }
}