class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
        
    }
}


class Solution {
    public String defangIPaddr(String address) {
        String[] splits = address.split("\\.");
        StringBuilder sb = new StringBuilder();
        int i;
        for(i=0; i<splits.length-1; i++) {
            sb.append(splits[i]).append("[.]");
        }
        sb.append(splits[i]);
        return sb.toString();
    }
}