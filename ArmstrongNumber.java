class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp = num;

        while (num > 0) {
            int r = num % 10;
            sum += r * r * r;
            num /= 10;
        }

        if (temp == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
