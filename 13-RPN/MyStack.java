
public class MyStack{
    
    private int[] a;
    int i;
    
    public MyStack(){
	a = new int[10];
	i=-1;
    }

    public void push(int s){
	if (i+1 >= a.length){
	    int[] aa = new int[2*a.length];
	    for(int b = 0; b < a.length; b++)
		aa[b] = a[b];
	    a = aa;
	}
	a[++i] = s;
    }
    
    public boolean isEmpty(){
	return i==0;
    }
    
    public int pop(){
	int asd = a[i];
        a[i--] = 0;
	return asd;
    }

    public String toString(){
	String s = "";

	for(int z = 0; z < i; z++){
	    s = s + a[i-z-1] + ", ";	 
	}
	return s.substring(0,s.length()-2);
    }


    public static void main(String[] args){

    }
}