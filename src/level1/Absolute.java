package level1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * 프로그래머스 Lv1.
 * 음양 더하기
 */
public class Absolute {
    public static void main(String[] args) {
        Absolute absolute = new Absolute();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        int result = absolute.solution(absolutes, signs);
        System.out.println("result = " + result); // result 9
    
        double l = 122316297307L / (double)300;
        long ceil = (long) Math.ceil(l);
        System.out.println("ceil = " + ceil);
    
        String s = Absolute.encryptSha("skhj458qwer!@34");
        System.out.println("s = " + s); // tP3Te7oINq9OVLSjTxEl4vrEBcxORW0WUXoC360tPeEPpOajjklkYHypxQSSqahJ0iq/MELqFFqbI2Yll8FP6Q==
    
    }

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer = (signs[i]) ? answer + absolutes[i] : answer - absolutes[i];
        }

        return answer;
    }
    
    public static String encryptSha(String text)
    {
        String encrypted = null;
        
        try
        {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(text.getBytes("UTF-8"));
            
            byte[] digested = md.digest();
            encrypted = new String(Base64Coder.encode(digested));
        }
        catch (Exception e)
        {
        }
        
        return encrypted;
    }
}
