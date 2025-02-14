package NumberConversion;
public class OctTo extends BinTo
{
    static int octToDec(int n)
    {
        String oct=n+"";
        int index=0;
        int e=oct.length()-1;
        int dec=0;
        while(e>=0)
        {
            int digit=oct.charAt(index)-'0';
            dec=dec+((int)Math.pow(8,e)*digit);
            index++;
            e--;
        }
        return dec;
    }
    static int octToBin(int n)
    {
        String oct=n+"";
        String bin="";
        for(int i=oct.length()-1;i>=0;i--)
        {
            int digit=oct.charAt(i)-'0';
            while(digit!=0)
            {
                int r=digit%2;
                bin=r+bin;
                digit/=2;
            }
            if(i!=0)
            {
                while(bin.length()%3!=0)
                {
                    bin="0"+bin;
                }
            }
        }
        return Integer.parseInt(bin);
    }
    static String octToHex(int n)
    {
        int bin=octToBin(n);
        String hex=binToHex(bin);
        return hex;
    }
}