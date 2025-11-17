class DecisionMaking {
    public static String compareNM(int n, int m) {
        if(n<m)
        {
            return "lesser";
        }
        else if(n==m)
        {
            return "equal";
        }
        else
        {
            return "greater";
        }
    }
        public static void main(String[] args)
        {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("enter the value of n");
        int m=s.nextInt();
        System.out.println("enter the value of m");
        String result=compareNM(n , m);
        System.out.println("Relation :" + result);
        s.close();
    }
}
