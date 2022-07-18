//Count and Say
public String count(int n) {
        return countUtil(n);   
    }
    // memoize the result
    Map<Integer, String> map = new HashMap<>();

    String countUtil(int n) {
        if (n == 1) {
            map.put(1, "1");
            return "1";
        }
        if (map.get(n) != null) {
            return map.get(n);
        }
        
        String res = countUtil(n-1);

        // count the digits and store in an array of length of the string..
        int[] countMap = new int[res.length()];
        int l = 0;
        char[] ch = res.toCharArray();
        for (int m = 0; m < ch.length; m++) {
        	char c = ch[m];
        	if (m > 0 && c == ch[m-1]) {
        		countMap[l-1] = countMap[l-1] + 1;
        	} else {
        		countMap[l++]++;
        	}
        }
        // string builder to append the result
        StringBuilder resString = new StringBuilder("");
        for (int k =0, m= 0 ; m < ch.length;) {
        	if (countMap[k] > 0) {
        		resString.append(countMap[k] + "" + (ch[m]-'0'));
        	}
        	// jump as many as required length based on the count
        	if (countMap[k] > 1) m = m + countMap[k];
        	else m++;
    		k++;
    		
        }
        map.put(n, resString.toString());
        return map.get(n);
    }