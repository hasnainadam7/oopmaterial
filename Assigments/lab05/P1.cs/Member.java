class Member {
    int phoneNo, age;
    String sallary, name, address;
}

class Employee extends Member {
    String specialization;

    void setPhone(int a) {
        this.phoneNo = a;
    }

    void setAge(int a) {
        this.age = a;
    }

    void setSallary(String a) {
        this.sallary = a;
    }

    void setName(String a) {
        this.name = a;
    }

    void setAddress(String a) {
        this.address = a;
    }

    void setSpecialization(String a) {
        this.specialization = a;
    }
}

class Manager extends Member {
    String department;

    void setPhone(int a) {
        this.phoneNo = a;
    }

    void setAge(int a) {
        this.age = a;
    }

    void setSallary(String a) {
        this.sallary = a;
    }

    void setName(String a) {
        this.name = a;
    }

    void setAddress(String a) {
        this.address = a;
    }

    void setDepartment(String a) {
        this.department = a;
    }
}

class Display {
    public static void main(String[] args) {
        Employee objEmployee = new Employee();
        Manager objManager = new Manager();
        objEmployee.setPhone(123452321);
        objEmployee.setAge(21);
        objEmployee.setName("Mr John");
        objEmployee.setSallary("9,000$");
        objEmployee.setAddress("Calfornia ");
        objEmployee.setSpecialization("Supervisor ");
        objManager.setPhone(123452321);
        objManager.setAge(21);
        objManager.setName("Mr Bush");
        objManager.setSallary("9,0$");
        objManager.setAddress("Calfornia ");
        objManager.setDepartment("Construction");
        String printEmployee = "******* For Employees ******* \nname :" + objEmployee.name + "\n" + "Age :"
                + objEmployee.age + "\n" + "Phone : " + objEmployee.phoneNo + "\n";
        printEmployee += "Sallary :" + objEmployee.sallary + "\n" + "Address : " + objEmployee.address + "\n"
                + "specialiazation : " + objEmployee.specialization;
        String printManager = "******* For Manager *******\nname :" + objManager.name + "\n" + "Age :" + objManager.age
                + "\n" + "Phone : " + objManager.phoneNo + "\n";
        printManager += "Sallary :" + objManager.sallary + "\n" + "Address : " + objManager.address + "\n"
                + "department : " + objManager.department;
        System.out.println(printEmployee);
        System.out.println(printManager);

    }
}