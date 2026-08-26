class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        
        int shr = ((startTime.charAt(0)-'0')*10) + (startTime.charAt(1)-'0');
        int smin = ((startTime.charAt(3)-'0')*10) + (startTime.charAt(4)-'0');
        int ssec = ((startTime.charAt(6)-'0')*10) + (startTime.charAt(7)-'0');

        int st = shr*3600 + smin*60 + ssec;

        int ehr = ((endTime.charAt(0)-'0')*10) + (endTime.charAt(1)-'0');
        int emin = ((endTime.charAt(3)-'0')*10) + (endTime.charAt(4)-'0');
        int esec = ((endTime.charAt(6)-'0')*10) + (endTime.charAt(7)-'0');

        int end = ehr*3600 + emin*60 + esec;

        return end - st;
        
        
    }
}