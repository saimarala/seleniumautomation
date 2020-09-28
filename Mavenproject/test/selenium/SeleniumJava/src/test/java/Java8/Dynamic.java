package Java8;

import org.testng.annotations.Test;

public class Dynamic {

    @Test
    public void dynamicval(){
        int a,b,c,d;
        a=1;
        b=1;
        c=2;
        d=3;
        boolean flag ;
        int tag;
        tag=0;
        while(tag==0)
        {
            System.out.println("a");
            if(a==b) {
                System.out.println("b");


            }

            else
            {
                System.out.println("ab");
                break;

            }

            if(c==d) {
                System.out.println("c");
                break;
            }
            else {
                System.out.println("cd");
                System.out.println("de");
                System.out.println("ef");
                //flag=false;
                //break;
                tag=1;
            }
        }
    }
}
