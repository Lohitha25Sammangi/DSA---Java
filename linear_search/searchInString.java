package linear_search;

public class searchInString {
    public static void main(String[] args) {
        String name="Lohitha";
        System.out.println(search1(name,'a'));
        System.out.println(search2(name,'r'));
    }
    static int search1(String str,char target){
        if(str.length()==0){return -1;}
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
    static boolean search2(String str,char target){
        if(str.length()==0){return false;}
        for(char c:str.toCharArray()){
            if(c==target){
                return true;
            }
        }
        return false;
    }
}
