class binary
{
    void main(int a)
    {
        int num =a;
        String bin ="";
        while(num!=0)
        {
            bin = (num%2==0)?0 + bin : 1 + bin;
            num = num/2;
        }
        System.out.println(bin);
    }
}