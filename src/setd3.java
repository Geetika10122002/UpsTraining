import java.util.*;
public class setd3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[] = {"Hello world", "World of Java", "Hello Java world"};
        HashMap<String,Integer>map=new HashMap<String,Integer>();
        for(int i=0;i<str.length;i++){
            String s=str[i];
            String str1[]=s.split(" ");
            for(int j=0;j<str1.length;j++){
                String s1=str1[j].toLowerCase();
                map.put(s1,map.getOrDefault(s1,0)+1);
            }
        }
        int max=0;
        String s2="";
        for(Map.Entry<String,Integer>i:map.entrySet()){
            if(i.getValue()>max){
                 max=i.getValue();
                 s2=i.getKey();
            }
        }
        System.out.print(s2);
    }
}
