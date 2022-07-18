
// Compare Version Numbers
class Solution {

public int compareVersion(String version1, String version2) {
    String[] v1 = version1.split("[.]");
    String[] v2 = version2.split("[.]");
    
    int i = 0;
    int j = 0;
    
    while(i<v1.length && j<v2.length){
        int value1 = Integer.valueOf(v1[i]);
        int value2 = Integer.valueOf(v2[j]);
        if(value1>value2){
            return 1;
        }else if(value2>value1){
            return -1;
        }
        i++;
        j++;
    }
    while(i<v1.length){
        int value1 = Integer.valueOf(v1[i]);
        if(value1>0){
            return 1;
        }
        i++;
    }
    while(j<v2.length){
        int value2 = Integer.valueOf(v2[j]);
        if(value2>0){
            return -1;
        }
        j++;
    }
    return 0;
}
}

