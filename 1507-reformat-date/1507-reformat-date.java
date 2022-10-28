class Solution {
    
    private HashMap<String,String> months = new HashMap<>();
    Solution(){
        months.put("Jan","01");
        months.put("Feb","02");
        months.put("Mar","03");
        months.put("Apr","04");
        months.put("May","05");
        months.put("Jun","06");
        months.put("Jul","07");
        months.put("Aug","08");
        months.put("Sep","09");
        months.put("Oct","10");
        months.put("Nov","11");
        months.put("Dec","12");
    }
    
    
    public String reformatDate(String date) {
        String[] data = date.split(" ");
        String[] result = new String[3];
        result[0] = data[2];
        result[1] = months.get(data[1]);
        result[2] = data[0].replaceAll("\\D+","");
        if(result[2].length() == 1) result[2] = "0"+result[2];
        return String.join("-",result);
    }
}