public class backtracking2 {
    public static void findsubstring(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        //yes choice
        findsubstring(str, ans+str.charAt(i), i+1);
        //no choice
        findsubstring(str, ans, i+1);
    }
    public static void main(String[] args) {
      String str="abc";
      String ans="";
      findsubstring(str,ans,0);  
    }
}
