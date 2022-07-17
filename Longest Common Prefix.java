public String longestCommonPrefix(String[] strs) {
	if(strs.length==0) return "";
	int resLen=strs[0].length();
	for(String s: strs){
        int lenS=s.length();
        for(int i=0;i<lenS;i++){
            if(i<resLen && s.charAt(i)!=strs[0].charAt(i)){
                resLen=i;
                break;
            }
        }
        
        if(lenS<resLen) resLen=lenS;
    }

	return strs[0].substring(0,resLen);
}