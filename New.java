import java.util.ArrayList;
import java.util.Scanner;
public class New 
{
    public static void main(String[] args) 
    {
        Scanner jt=new Scanner(System.in);
            System.out.println("(288) base 9 to covert 10 first you dial 288 after 9 and after 10");
            System.out.println("Enter number");
            String s=jt.next();
            System.out.println("Enter the base");
            int base=jt.nextInt();
            System.out.println("Enter the convert base");
            int cbase=jt.nextInt();
            ArrayList<Integer> a=new ArrayList<>();
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                switch(c)
                {
                    case '0':
                        a.add(0);
                        break;
                    case '1':
                        a.add(1);
                        break;
                    case '2':
                        a.add(2);
                        break;
                    case '3':
                        a.add(3);
                        break;
                    case '4':
                        a.add(4);
                        break;
                    case '5':
                        a.add(5);
                        break;
                    case '6':
                        a.add(6);
                        break;
                    case '7':
                        a.add(7);
                        break;
                    case '8':
                        a.add(8);
                        break;
                    case '9':
                        a.add(9);
                        break;
                    case 'A':
                        a.add(10);
                        break;
                    case 'B':
                        a.add(11);
                        break;
                    case 'C':
                        a.add(12);
                        break;
                    case 'D':
                        a.add(13);
                        break;
                    case 'E':
                        a.add(14);
                        break;
                    case 'F':
                        a.add(15);
                        break;
                    case 'G':
                        a.add(16);
                        break;
                    case 'H':
                        a.add(17);
                        break;
                    case 'I':
                        a.add(18);
                        break;
                    case 'J':
                        a.add(19);
                        break;
                    case 'K':
                        a.add(20);
                        break;
                    case 'L':
                        a.add(21);
                        break;
                    case 'M':
                        a.add(22);
                        break;
                    case 'N':
                        a.add(23);
                        break;
                    case 'O':
                        a.add(24);
                        break;
                    case 'P':
                        a.add(25);
                        break;
                    case 'Q':
                        a.add(26);
                        break;
                    case 'R':
                        a.add(27);
                        break;
                    case 'S':
                        a.add(28);
                        break;
                    case 'T':
                        a.add(29);
                        break;
                    case 'U':
                        a.add(30);
                        break;
                    case 'V':
                        a.add(31);
                        break;
                    case 'W':
                        a.add(32);
                        break;
                    case 'X':
                        a.add(33);
                        break;
                    case 'Y':
                        a.add(34);
                        break;
                    case 'Z':
                        a.add(35);
                        break;
                }
            }      
            int sum=0;
            for(int i=a.size()-1,j=0;i>=0;i--,j++)
            {
                sum+=(a.get(i))*Math.pow(base,j);   
            }
            String[] digit={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
            String ans="";
            
            while(sum!=0)
            {
                
                ans+=digit[sum%cbase];
                sum=sum/cbase;
            }
    
            StringBuffer newans=new StringBuffer(ans);
            // //reverse ans and print..
             System.out.println("Converted base "+newans.reverse());
    }    
}
