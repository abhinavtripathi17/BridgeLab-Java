package JavaClassandObject.Level1;

public class mobliePhoneDetails {
    //Declaring variable for entering the details
	String brand;
	String model;
	double price;
	
	//constructor
	mobliePhoneDetails(String brand,String model,double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void diplayMobile() {
		System.out.println("Brand of mobile: "+brand);
		System.out.println("Model of mobile: "+model);
		System.out.println("Price of mobile: "+price);
		System.out.println("------------------------------");
	}
	public static void main(String[] args) {
	mobliePhoneDetails mobile1=new mobliePhoneDetails("VIVO","VIVO V29" , 15999);
	mobliePhoneDetails mobile2=new mobliePhoneDetails("ONE PLUS","ONE PLUS nord4",39999);
	mobliePhoneDetails mobile3=new mobliePhoneDetails("APPLE","iphone pro16",79999);

	mobile1.diplayMobile();
	mobile2.diplayMobile();
	mobile3.diplayMobile();
	}

}
