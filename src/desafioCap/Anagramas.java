package desafioCap;

import java.util.ArrayList;
import java.util.HashMap;

public class Anagramas {


    // Conta a quantidade de anagramas
    public int contarAnagramas(String palavra){
        String p = palavra;
        HashMap<Integer, ArrayList<String>> sub= getSub(p);
        int counter=0;
        for(int t=1; t<=p.length(); t++){
            ArrayList<String> subsl= sub.get(t);
            for(int i=0; i<subsl.size()-1; i++){
                for(int j=i+1; j<subsl.size(); j++){
                    if(isAnagram(subsl.get(j),subsl.get(i))){
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
        return counter;
    }


    // divide a string em substrings e faz as comparações
    public static HashMap<Integer,ArrayList<String>> getSub(String str1){
        HashMap<Integer,ArrayList<String>> ret= new HashMap<Integer,ArrayList<String>>();
        for(int i=0; i<str1.length(); i++){
            for(int j=i; j<str1.length(); j++){
                if(!ret.containsKey(str1.substring(i, j+1).length())){
                    ArrayList<String> x= new ArrayList<String>();
                    x.add(str1.substring(i, j+1));
                    ret.put(str1.substring(i, j+1).length(), x);
                }
                else
                    ret.get(str1.substring(i, j+1).length()).add(str1.substring(i, j+1));
            }
        }
        return ret;
    }

    //Valida a existencia de anagramas
    public static boolean isAnagram(String a1, String a2){
        int count1[]= new int[26];
        int count2[]= new int[26];
        if(a1.length()!=a2.length())
            return false;
        for(int i=0; i<a1.length(); i++){
            count1[(int)a1.charAt(i)-97]++;
            count2[(int)a2.charAt(i)-97]++;
        }
        for(int i=0; i<26; i++){
            if(count1[i]!=count2[i])
                return false;
        }
        return true;
    }

}
