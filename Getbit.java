class Getbit{
    public static void main(String args[]){
        int n = 5;// original value
        int pos = 1;
        int bitmask = 1<<pos;
        int newnumber = bitmask & n;
        if(newnumber == 0){
            System.out.println("bit is 0");
        }
        else{
            System.out.println("bit is 1");
        }
    }
}