class Clearbit{
    public static void main (String args[]){
        int n = 5;
        int pos = 0;
        int bitmask = 1<<pos;
        int newbitmask = ~(bitmask);
        int newno = newbitmask & n;
        System.out.println(newno);
    }
}