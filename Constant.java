public class Constant {
    public static void main(String[] args) {
        int mac = 1;  // Variable (can be reassigned)
        System.out.println(mac);
        
        mac = 2;  // Reassigning variable
        System.out.println(mac);
        
        final int finalMac = 3;  // Constant (cannot be reassigned)
        System.out.println(finalMac);
        
        // Uncommenting the next line will give an error because finalMac is a constant
        mac = 4; 
        System.out.println(mac);
        
        // To show the error for trying to reassign a constant
        // System.out.println(finalMac);
    }
}
