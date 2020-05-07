package restoreIPAddresses;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
    public static void main(String[] args) {


        String s = "25525511135";

        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        ArrayList<String> t = new ArrayList<String>();
        dfs(result, s, 0, t);

        ArrayList<String> finalResult = new ArrayList<String>();

        for (ArrayList<String> l : result) {
            StringBuilder sb = new StringBuilder();
            for (String str : l) {
                sb.append(str + ".");
            }
            sb.setLength(sb.length() - 1);
            finalResult.add(sb.toString());
        }

        System.out.println(finalResult);


    }


    public static void dfs(ArrayList<ArrayList<String>> result, String s, int start, ArrayList<String> t){

        if(t.size()>=4 && start!=s.length())
            return;


        if((t.size()+s.length()-start+1)<4)
            return;


        if(t.size()==4 && start==s.length()){
            ArrayList<String> temp = new ArrayList<String>(t);
            result.add(temp);
            return;
        }

        for(int i=1; i<=3; i++){

            if(start+i>s.length())
                break;

            String sub = s.substring(start, start+i);

            if(i>1 && s.charAt(start)=='0'){
                break;
            }


            if(Integer.valueOf(sub)>255)
                break;

            t.add(sub);
            dfs(result, s, start+i, t);
            t.remove(t.size()-1);
        }
    }}