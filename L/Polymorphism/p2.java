class Payment
{
    void pay(double amount)
    {
        System.out.println("Processing payment");
    }
}

class UPI extends Payment
{
    void pay(double amount)
    {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}

class CreditCard extends Payment
{
    void pay(double amount)
    {
        System.out.println("Paid Rs." + amount + " using Credit Card");
    }
}

class Cash extends Payment
{
    void pay(double amount)
    {
        System.out.println("Paid Rs." + amount + " using Cash");
    }
}

public class p2
{
    public static void main(String[] args)
    {
        Payment p;

        p = new UPI();
        p.pay(500);

        p = new CreditCard();
        p.pay(1000);

        p = new Cash();
        p.pay(300);
    }
}