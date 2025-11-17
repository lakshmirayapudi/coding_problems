class Armstrong 
{
    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 999:");

        for (int num = 1; num <= 999; num++) {
            int digits = 0;
            int copy = num;
            int sum = 0;

            
            for (int i = num; i > 0; i /= 10) {
                digits++;
            }

            java
            for (int i = num; i > 0; i /= 10) {
                int digit = i % 10;
                int power = 1;

                for (int j = 1; j <= digits; j++) {
                    power *= digit;
                }

                sum += power;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
