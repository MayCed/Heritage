package com.parent;

import com.child.Employee;
import com.subchild.Dev;
import com.subchild.ProductOwner;

public class Main {



    public static void main(String[] args) {



        Dev dev1 = new Dev(
                "Mayoute",
                "Cedric",
                35,
                2500,
                35,
                "Java");


        Dev dev2 = new Dev(
                "Cange",
                "William",
                35,
                2500,
                35,
                "Javascript");

        ProductOwner ludovic = new ProductOwner(
                "Ludovic",
                "Mayoute",
                25,
                7500,
                45,
                "AGILE");

        System.out.println(Employee.instanceCount);
        Employee.afficheListe();
    }

}
