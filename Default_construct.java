//  3

public class Default_construct {

    public static void main(String[] args){

        A r = new A();
        r.Disp();

    }
    
}

class A{

    int a ; String b ; boolean c ; double d ; float f ; long l ; char ch ;

    /*A() //default constructor created by us 
    {
        a = 100;
        b = "Kiran";
        c = true;
        d = 10.5;
        f = 10.5f;
        l = 1000;
        ch = 'A';
    }*/

    //if we dont use this then java automatically creates a default constructor for us and the values of instance variables will be initialized to default values.

    void Disp(){
        System.out.println(a + " " + b + " " + c + " " + d + " " + f + " " + l + " " + ch);
    }
}


