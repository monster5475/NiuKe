package com.likou.Code50_100;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author wyh
 * @Description 深度搜索+剪枝
 * @Date: 2020 08 09 下午6:08
 */
public class Code93 {
    public static List<String> result;
    public static String s_global;

    public static void dfs(int stageId, int startIndex, String str){
        if(stageId==4){
            if(startIndex == s_global.length()){
                result.add(str);
            }else{
                ;
            }
            return ;
        }
        String ts = "";
        for(int i=startIndex;i<s_global.length();i++){
            ts+=s_global.charAt(i);
            if(ts.charAt(0) == '0' && ts.length()>1){
                break;
            }
            if(Integer.valueOf(ts)<=255){
                String ss = str;
                ss+=".";
                ss+=ts;
                dfs(stageId+1, i+1, ss);
            }else{
                break;
            }
        }
    }

    public static List<String> restoreIpAddresses(String s) {
        s_global = s;
        result = new ArrayList<>();
        String str="";
        dfs(0,0,str);
        result = result.stream().map(s1->s1.substring(1)).collect(Collectors.toList());
        return result;
    }
}
