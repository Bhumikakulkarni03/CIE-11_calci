class calclator extends ext_cal{
    int a;
    int b;
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
    int mul(int a,int b){
        return a+b;
    }
    int div(int a,int b){
        return a/b;
    }
   public static void main(String args[]){
    calclator c=new calclator();
    System.out.println("Sum: "+c.add(3,4));
    System.out.println("Difference: "+c.sub(7,4));
    System.out.println("Product: "+c.mul(3,4));
    System.out.println("Division: "+c.div(3,4));
    c.sq_root();
    c.cb_root();
   }
}