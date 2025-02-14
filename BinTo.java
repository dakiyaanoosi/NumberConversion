package NumberConversion;
public class BinTo
{
    static int binToDec(int n)
    {
        String bin=n+"";
        int e=bin.length()-1;
        int index=0;
        int dec=0;
        while(e>=0)
        {
            int digit=bin.charAt(index)-'0';
            dec=dec+((int)Math.pow(2,e)*digit);
            e--;
            index++;
        }
        return dec;
    }
    static int binToOct(int n)
    {
        String bin=n+"";
        while(bin.length()%3!=0)
        {
            bin="0"+bin;
        }
        String bit[]=new String[bin.length()/3];
        String bitval="";
        int c=0,bitindex=0;
        for(int i=0;i<bin.length();i++)
        {
            bitval+=bin.charAt(i);
            c++;
            if(c==3)
            {
                bit[bitindex]=bitval;
                bitval="";
                c=0;
                bitindex++;
            }
        }
        int oct=0;
        for(int i=0;i<bitindex;i++)
        {
            int e=2;
            int index=0;
            int deceq=0;
            while(e>=0)
            {
                int digit=bit[i].charAt(index)-'0';
                deceq=deceq+((int)Math.pow(2,e)*digit);
                e--;
                index++;
            }
            oct=(oct*10)+deceq;
        }
        return oct;
    }
    static String binToHex(int n)
    {
        char h[]={'A', 'B', 'C', 'D', 'E', 'F'};
        String bin=n+"";
        while(bin.length()%4!=0)
        {
            bin="0"+bin;
        }
        String bit[]=new String[bin.length()/4];
        String bitval="";
        int c=0,bitindex=0;
        for(int i=0;i<bin.length();i++)
        {
            bitval+=bin.charAt(i);
            c++;
            if(c==4)
            {
                bit[bitindex]=bitval;
                bitval="";
                c=0;
                bitindex++;
            }
        }
        String hex="";
        for(int i=0;i<bitindex;i++)
        {
            int e=3;
            int index=0;
            int deceq=0;
            while(e>=0)
            {
                int digit=bit[i].charAt(index)-'0';
                deceq=deceq+((int)Math.pow(2,e)*digit);
                e--;
                index++;
            }
            if(deceq>=10 && deceq<16)
            hex=hex+h[deceq-10];
            else
            hex=hex+deceq;
        }
        return hex;
    }
}