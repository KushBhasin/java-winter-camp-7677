import java.io.*;

public class char_new {
    public static void main(String[] args) {
        int i,flag=0;
        String s= "I Love Java";
        char check='a';
        for(i=0;s.charAt(i)!='\0';i++){
        if(s.charAt(i)==check){
            System.out.println("Yes! At position:"+(i+1));
            flag=1;
            break;
        } 
        if(i+1==s.length() && flag==0){
            System.out.println("No!");
            break;
        }
        
    }
}
}

