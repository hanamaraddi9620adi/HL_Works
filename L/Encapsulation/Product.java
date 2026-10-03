class Pro
{
	private int productId;
	private String productName;
	private double price;
	private int quantity;



						//GETTERS



	public void setProductId(int productId)
	{
		this.productId = productId;
	}

	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	public void setProductPrice(double price)
	{
		if(price>0)
		{
			this.price = price;
		}
		else
		{
			System.out.println("Invalid price");
		}
	}

	public void setProductQuantity(int quantity)
	{
		if(quantity>=0)
		{
			this.quantity = quantity;
		}
		else
		{
			System.out.println("Invalid Quantities");
		}
	}





					//SETTERS

	public int getProductId()
	{
		return productId;
	}

	public String getProductName()
	{
		return productName;
	}

	public double getProductPrice()
	{
		return price;
	}

	public int getProductQuantity()
	{
		return quantity;
	}
}



public class Product
{
	public static void main(String[] args)
	{
		Pro p = new Pro();
		
		//p.setProductName("Apple");
		//p.setProductPrice(100000);
		//p.setProductQuantity(10);
		//p.setProductId(100);

		

		//System.out.println("Product Id : " + p.getProductId());
		//System.out.println("Product Name : " + p.getProductName());
		//System.out.println("Product Price : " + p.getProductPrice());
		//System.out.println("Product Quantity : " + p.getProductQuantity());



		p.setProductPrice(-100);
		p.setProductQuantity(-10);
		
		System.out.println("Product Price : " + p.getProductPrice());
		System.out.println("Product Quantity : " + p.getProductQuantity());
		
	}
}































