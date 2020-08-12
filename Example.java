class Customer{
	private int code;
	private String name;
	Customer next;
	public Customer(int code, String name){this.code=code;this.name=name;}
	
	public int getCode(){
		return code;
	}
	public void setCode(int code){
		this.code=code;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public Customer getNext(){
		return next;
	}
	public void setNext(Customer next){
		this.next=next;
	}
}

class CustomerStack{
	Customer top;
	public void push(Customer customer){
		Customer c1=new Customer(customer.getCode(),customer.getName()); //Create a node Object
		c1.next=top;
		top=c1;
	}
	public void pop(){
		if(top!=null){
                    top=top.next;
		}
	}
	
	public void printCustomerStack(){
		Customer temp=top;
		System.out.print("[");
		while(temp!=null){
			System.out.print(temp.getCode()+" "+temp.getName()+" ");
			temp=temp.next;
		}
		System.out.println("\b\b]");
	}
}

class Example{
	public static void main(String args[]){
		CustomerStack stack=new CustomerStack();
		stack.push(new Customer(1001,"Danapala"));
		stack.push(new Customer(1002,"Gunapala"));
		stack.push(new Customer(1003,"Somapala"));
		stack.push(new Customer(1004,"Siripala"));
		stack.printCustomerStack();
		
		stack.pop(); 
		stack.printCustomerStack();
	}
}

