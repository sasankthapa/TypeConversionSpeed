public class Main{
    //boolean>>char>>byte>>short>>int>>long>>float>>double>>String
    
    //int to String 
    public static void intToString(){
        int val;
        String s;
        long startTime,elapsedTime;
        val=Integer.MAX_VALUE;
        startTime=System.nanoTime();
        s= Integer.toString(val);
        elapsedTime=System.nanoTime()-startTime;
        System.out.println("Using Integer.toString() : "+(float)elapsedTime/1000000+"ms");
        startTime=System.nanoTime();
        s=String.valueOf(val);
        elapsedTime=System.nanoTime()-startTime;
        System.out.println("Using String.valueOf() : "+(float)elapsedTime/1000000+"ms");
    }

    //String to int
    public static void stringToInt(){
        String s="2147483647";
        int val;
        long startTime,elapsedTime;
        startTime=System.nanoTime();
        val=Integer.parseInt(s);
        elapsedTime=System.nanoTime()-startTime;
        System.out.println("Using Integer.parseInt() : "+(float)elapsedTime/1000000+"ms");
        startTime=System.nanoTime();
        val=Integer.valueOf(s);
        elapsedTime=System.nanoTime()-startTime;
        System.out.println("Using Integer.valueOf() : "+(float)elapsedTime/1000000+"ms");
    }

    public static void main(String[] args){
        System.out.println("'Int to String'");
        intToString();
        System.out.println();
        System.out.println("'String to Int'");
        stringToInt();
    }
}
