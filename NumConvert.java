package NumberConversion;
import java.util.Scanner;
public class NumConvert
{
    static boolean checkBin(int n)
    {
        while(n!=0)
        {
            int r=n%10;
            n/=10;
            if(r==1 || r==0)
            continue;
            else
            {
                return false;
            }
        }
        return true;
    }
    static boolean checkOct(int n)
    {
        while(n!=0)
        {
            int r=n%10;
            n/=10;
            if(!(r<8))
            return false;
        }
        return true;
    }
    static boolean checkHex(String n)
    {
        for(int i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            if(Character.isLetter(ch))
            {
                if(!"ABCDEF".contains(String.valueOf(Character.toUpperCase(ch))))
                return false;
            }
        }
        return true;
    }
    static String returnHex(String n,Scanner sc)
    {
        while(checkHex(n)==false)
        {
            System.out.print("Please Enter a Valid Hexadecimal Number : ");
            n=sc.nextLine();
        }
        return n;
    }
    static int returnOct(int n,Scanner sc)
    {
        while(checkOct(n)==false)
        {
            System.out.print("Please Enter a Valid Octal Number : ");
            n=sc.nextInt();
        }
        return n;
    }
    static int returnBin(int n,Scanner sc)
    {
        while(checkBin(n)==false)
        {
            System.out.print("Please Enter a Valid Binary Number : ");
            n=sc.nextInt();
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nNUMBER CONVERSION");
        while(true)
        {
        String ch[]={"Decimal", "Binary", "Octal", "Hexadecimal"};
        System.out.println("1.Decimal\n2.Binary\n3.Octal\n4.Hexadecimal\n");
        System.out.print("From [1/2/3/4] : ");
        int ch1=sc.nextInt();
        while(true)
        {
            if(ch1==1 || ch1==2 || ch1==3 || ch1==4)
            {
                break;
            }
            else
            {
                System.out.print("Please enter a valid choice : ");
                ch1=sc.nextInt();
            }
        }
        System.out.print("To [1/2/3/4] : ");
        int ch2=sc.nextInt();
        while(true)
        {
            if((ch2==1 || ch2==2 || ch2==3 || ch2==4)&& ch2!=ch1)
            {
                break;
            }
            else
            {
                System.out.print("Please enter a valid choice : ");
                ch2=sc.nextInt();
            }
        }
        System.out.println("\n"+ch[ch1-1]+" To "+ch[ch2-1]+" !!\n");

        switch(ch1)
        {
            case 1:
            {
                System.out.print("Decimal Number : ");
                int d=sc.nextInt();
                if(ch2==2)
                {
                    int result=DecTo.decToBin(d);
                    System.out.println("Binary Number : "+result+"\n");
                }
                if(ch2==3)
                {
                    int result=DecTo.decToOct(d);
                    System.out.println("Octal Number : "+result+"\n");
                }
                if(ch2==4)
                {
                    String result=DecTo.decToHex(d);
                    System.out.println("Hexadecimal Number : "+result+"\n");
                }
                break;
            }
            case 2:
            {
                System.out.print("Binary Number : ");
                int b=sc.nextInt();
                b=returnBin(b, sc);
                if(ch2==1)
                {
                    int result=BinTo.binToDec(b);
                    System.out.println("Decimal Number : "+result+"\n");
                }
                if(ch2==3)
                {
                    int result=BinTo.binToOct(b);
                    System.out.println("Octal Number : "+result+"\n");
                }
                if(ch2==4)
                {
                    String result=BinTo.binToHex(b);
                    System.out.println("Hexadecimal Number : "+result+"\n");
                }
                break;
            }
            case 3:
            {
                System.out.print("Octal Number : ");
                int o=sc.nextInt();
                o=returnOct(o, sc);
                if(ch2==1)
                {
                    int result=OctTo.octToDec(o);
                    System.out.println("Decimal Number : "+result+"\n");
                }
                if(ch2==2)
                {
                    int result=OctTo.octToBin(o);
                    System.out.println("Binary Number : "+result+"\n");
                }
                if(ch2==4)
                {
                    String result=OctTo.octToHex(o);
                    System.out.println("Hexadecimal Number : "+result+"\n");
                }
                break;
            }
            case 4:
            {
                System.out.print("Hexadecimal Number : ");
                sc.nextLine();
                String h=sc.nextLine();
                h=returnHex(h, sc);
                if(ch2==1)
                {
                    int result=HexTo.hexToDec(h);
                    System.out.println("Decimal Number : "+result+"\n");
                }
                if(ch2==2)
                {
                    int result=HexTo.hexToBin(h);
                    System.out.println("Binary Number : "+result+"\n");
                }
                if(ch2==3)
                {
                    int result=HexTo.hexToOct(h);
                    System.out.println("Octal Number : "+result+"\n");
                }
                break;
            }
        }
        if(ch1!=4)
        sc.nextLine();
        System.out.println("1.Press ENTER to Convert again\n2.Type Anything & press ENTER to STOP");
        String input=sc.nextLine();
        if(!input.isEmpty())
        break;
        }
        sc.close();
    }
}
