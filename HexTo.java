package NumberConversion;
public class HexTo extends BinTo
{
    static long hexToDec(String n)
    {
        int d[]={10, 11, 12, 13, 14, 15};
        long e=n.length()-1;
        int index=0;
        long dec=0;
        long digit=0;
        while(e>=0)
        {
            char ch=n.charAt(index);
            if(Character.isDigit(ch))
            digit=ch-'0';
            else
            digit=d[Character.toUpperCase(ch)-65];
            dec=dec+((int)Math.pow(16,e)*digit);
            e--;
            index++;
        }
        return dec;
    }
    static long hexToBin(String n)
    {
        int d[]={10, 11, 12, 13, 14, 15};
        String oct=n;
        String bin="";
        int digit=0;
        for(int i=oct.length()-1;i>=0;i--)
        {
            char ch=oct.charAt(i);
            if(Character.isDigit(ch))
            {
                digit=oct.charAt(i)-'0';
            }
            else
            {
                digit=d[Character.toUpperCase(ch)-65];
            }
            while(digit!=0)
            {
                int r=digit%2;
                bin=r+bin;
                digit/=2;
            }
            if(i!=0)
            {
                while(bin.length()%4!=0)
                {
                    bin="0"+bin;
                }
            }
        }
        return Long.parseLong(bin);
    }
    static long hexToOct(String n)
    {
        long bin=hexToBin(n);
        return binToOct(bin);
    }
}
