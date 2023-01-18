public class vovel_consonants {
    public static void main(String args[]){
        String s= "kushbhasin@123";
        s.replaceAll("[-+.^:,]","");
        int count=0;
        char arr[]= s.toCharArray();
        for(int i=0;i<s.length();i++){
            switch(arr[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
        }
    }
    System.out.println("Count of vovels is: "+count);
}
}
