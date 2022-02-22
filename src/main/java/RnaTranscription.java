import java.util.HashMap;
public class RnaTranscription {
    String transcribe(String dnaStrand) {
        String rnaStrand="";
        HashMap<Character,Character> mapStrand = new HashMap<>();
        mapStrand.put('G', 'C');
        mapStrand.put('C', 'G');
        mapStrand.put('T', 'A');
        mapStrand.put('A', 'U');
        for(int itr=0;itr<dnaStrand.length();itr++){
            rnaStrand+=mapStrand.get(dnaStrand.charAt(itr));
        }
        return rnaStrand;
    }
}

