// 2
public class construct {
    public static void main(String[] args){
            A ref = new A();
            ref.show();
    }    
}

class A {

    int a; String name;
    /*A(){
        a = 0;
        name = null;
    }*/

// and again we get the same result as 0 and Null
// 0 is the default value for integer         
// null is the default value for String
// Even after commenting out the constrcurtor which we made 
// still the program executes this shows that java will alwyas have a default constructor if we dont make one.
    A(){
        a = 100;
        name = "Hanamaraddi";
    }
// Now this constructor will be called and the values of a and name will be changed to 100 and Hanamaraddi respectively.


//Hence instance variables are initialized to default values if we dont make a constructor and if we make a constructor then the values of instance variables will be changed to the values which we have given in the constructor.
    void show(){
        System.out.println(a + " " + name);
    }
}

