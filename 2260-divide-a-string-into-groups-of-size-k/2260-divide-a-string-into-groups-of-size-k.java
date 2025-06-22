class Solution {
    public String[] divideString(String s, int k, char fill) {
        // ArrayList<String> list = new ArrayList<>();
        // if(s.length()%k != 0){
        //     int fills = k - s.length()%k;
        //     for(int x=0;x<fills;x++){
        //         s += fill;
        //     }
        // }
        // for(int i=0;i<s.length();i+=k){
        //     list.add(s.substring(i,i+k));
        // }
        // return list.toArray(new String[0]);

        StringBuilder str = new StringBuilder(s);
        while(str.length()%k!=0){
            str.append(fill);
        }
        String arr[] = new String[str.length()/k];
        for(int i=0;i<str.length()/k;i++){
            arr[i] = str.substring(i*k,i*k+k);
        }
        return arr;
    }
}