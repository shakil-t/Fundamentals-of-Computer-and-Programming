/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivan.and.natasha.messages;

/**
 *
 * @author shakil
 */
public class IvanAndNatashaMessages {

    /**
     * @param args the command line arguments
     */
    public static boolean isPalindrome(int length) {
        String number = String.valueOf(length);
        String reverse = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            reverse += number.charAt(i);
        }
        if (number.equals(reverse)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String keyboard = "qwerBtyui>op)asdf(ghjkl;zxc3vb<nm,.:/";
        String[] messages = {
            "djsl>;;pbrdupinv",
            "lrr)3s;,smfrsy)r3j)r3je>yjdj>Blslspi/a",
            ";pbr>d;pbr",
            "s;;upimrrf>d;pbr"
        };
        for (int i = 0; i < messages.length; i++) {
            boolean result = isPalindrome(messages[i].length());
            String originalMessage = "";
            for (int j = 0; j < messages[i].length(); j++) {
                for (int k = 0; k < keyboard.length(); k++) {
                    if (messages[i].charAt(j) == keyboard.charAt(k)) {
                        if (result) {
                            originalMessage += keyboard.charAt(k + 1);
                        } else {
                            originalMessage += keyboard.charAt(k - 1);
                        }
                    }
                }
            }
            System.out.println(originalMessage);
        }
    }

}
