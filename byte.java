class ByteCode {
    public static void main(String[] args) {
        byte a=126;
        a++;
        a++;
        System.out.println(a+" ");
        a++;
        System.out.println(a);
    }
}

// Range of data type byte is -128 to 127. When we increment the variable "a" twice. it cross the positive range and goes into negative cycle cyclical range.
