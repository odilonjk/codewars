//  Problem: https://www.codewars.com/kata/554e4a2f232cdd87d9000038
public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        String complement = "";
        for(int i=0;i<dna.length();i++) {
            switch(dna.charAt(i)) {
                case 'A':
                complement += "T";
                break;
                case 'T':
                complement += "A";
                break;
                case 'C':
                complement += "G";
                break;
                case 'G':
                complement += "C";
                break;
            }
        }
        return complement; 
    }
}