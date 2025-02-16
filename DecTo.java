package NumberConversion;
public class DecTo
{
    static long decToBin(long n)
    {
        long bin=0,p=1;
        while(n!=0)
        {
            long r=n%2;
            bin=bin+(r*p);
            n/=2;
            p*=10;
        }
        return bin;
    }
    static long decToOct(long n)
    {
        long oct=0,p=1;
        while(n!=0)
        {
            long r=n%8;
            oct=oct+(r*p);
            n/=8;
            p*=10;
        }
        return oct;
    }
    static String decToHex(long n)
    {
        String hex="";
        char h[]={'A', 'B', 'C', 'D', 'E', 'F'};
        while(n!=0)
        {
            int r=(int)n%16;
            if(r<10)
            hex=r+hex;
            else
            hex=h[r-10]+hex;
            n/=16;
        }
        return hex;
    }
}
