class factorial
{
    void main(int a)
    {
        int n = 1;
        while(a!=0)
        {
            n = n * a;
            a--;
        }
        System.out.println(n);
    }
}