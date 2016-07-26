package com.hudongwuxian.utils;

import java.util.Map;
//匹配工具
public class MatchUtil {
	private static int maxLevel = DefultValue.MAXLEVEL;
/*	设置匹配级别，maxLevel越高越模糊，匹配时间越长
*/	public void setDefaltMaxLevel(int level){
		maxLevel = level;
	}
	/*传入字符串正常匹配*/
	public boolean commonMatch(String parent,String child){
		return parent.contains(child);
	}
	/*传入字符串模糊匹配，使用时穿入字符串应尽量短
	 * */	
	public static boolean blurMatch(String parent,String child){
		return match(maxLevel,parent,child,new MatchHander() {
			@Override
			public boolean compare(int a, int b) {
				// TODO Auto-generated method stub
				return a==b;
			}
		});
		
	}
	//解串
	private static boolean match(int errorNum,String src,String dest,MatchHander hander){  
        char[] csrc = src.toCharArray();  
        char[] cdest = dest.toCharArray();  
        int score = 0;  
        score = cal(csrc,0,cdest,0,hander,0,errorNum);  
        int max = csrc.length>cdest.length?csrc.length:cdest.length;  
        System.out.println("可以接受错误数："+errorNum+"，发现错误数："+(max - score) );  
        return max - score  <= errorNum;  
    } 
	//递归匹配
	 private static int cal(char[] csrc, int i, char[] cdest, int j, MatchHander hander,int curdeep,int maxdeep) {  
	        int score = 0;  
	        if( curdeep > maxdeep ||i >= csrc.length || j >= cdest.length)  
	            return 0;  
	        boolean ismatch = hander.compare(csrc[i], cdest[j]);  
	        if(ismatch){  
	            score++;  
	            if(i+1<csrc.length && j+1<cdest.length)  
	                score +=  cal(csrc, i+1, cdest, j+1, hander,0,maxdeep) ;  
	        }else{  
	            int temp1 = 0;  
	            int temp2 = 0;  
	            int temp3 = 0;  
	            temp1 +=  cal(csrc, i, cdest, j+1, hander,curdeep+1,maxdeep) ;  
	            temp2 +=  cal(csrc, i+1, cdest, j, hander,curdeep+1,maxdeep) ;  
	            temp3 +=  cal(csrc, i+1, cdest, j+1, hander,curdeep+1,maxdeep) ;  
	            int temp4 = Math.max(temp1, temp2);  
	            score += Math.max(temp3, temp4);  
	        }  
	        return score;  
	    }  
}
