public class RPN{
    private MyStack asd;
    private static final String asdasd = "+-*/^";
    
    public RPN(){
	asd = new MyStack();
    }
    
    public int calc(String a){
	for(int i = 0; i < a.length(); i++){
	    String p = a.substring(i,i+1);
	    int x = asdasd.indexOf(p);
	    if(x == -1)
		asd.push(Integer.parseInt(p));
	    else if(x == 0)
		asd.push(asd.pop() + asd.pop());
	    else if(x == 1)
		asd.push(0 - asd.pop() + asd.pop());
	    else if(x == 2)
		asd.push(asd.pop() * asd.pop());
	    else if(x == 3)
		asd.push(1/asd.pop() * asd.pop());
	    else if(x == 4){
		int pow =  asd.pop();
		asd.push((int)Math.pow(asd.pop(), pow));
	    }

	}
	return asd.pop();
    }

    public static void main(String[] args){
	RPN qwer = new RPN();
	System.out.println(qwer.calc("34-"));
	System.out.println(qwer.calc("34-1+"));
	System.out.println(qwer.calc("34*"));
	System.out.println(qwer.calc("34/"));
	System.out.println(qwer.calc("34^"));
    }
}