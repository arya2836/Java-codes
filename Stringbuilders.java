
public class Stringbuilders{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //charAt index 0
        System.out.println(sb.charAt(0));

        // setCharAt index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        //insert index 0
        sb.insert(0 , 'S');
        System.out.println(sb);

        sb.insert( 2 , 'n');
        System.out.println(sb);

        //delete the extra n
        sb.delete(2 , 3);
        System.out.println(sb);

        //append
        sb.append("o");
        System.out.println(sb);

    }
}
   
      