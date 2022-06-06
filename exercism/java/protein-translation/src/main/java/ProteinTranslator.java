import java.util.*;

class ProteinTranslator {
/*
AUG	Methionine
UUU, UUC	Phenylalanine
UUA, UUG	Leucine
UCU, UCC, UCA, UCG	Serine
UAU, UAC	Tyrosine
UGU, UGC	Cysteine
UGG	Tryptophan
UAA, UAG, UGA STOP*/
    Map<String ,List<String>>map = new HashMap<>();

    public ProteinTranslator(){
        setMap();
    }

    List<String> translate(String rnaSequence) {
        List<String> res = new ArrayList<>();

        if(rnaSequence.startsWith("U")|| rnaSequence.startsWith("A")){
            //3자리씩 구분
            int strSize = rnaSequence.length();
            int cnt = strSize/3;

            for(int i = 0 ; i < cnt ; i++){

                int start = i == 0 ? 0 : i * 3;
                String sub = toProtein(rnaSequence.substring(start,start+3));
                if("STOP".equals(sub)) break;
                else res.add(sub);
            }
        }else{
            res.addAll(toRna(rnaSequence));
        }

        return res;
    }

    private String toProtein(String req){
        String res = "";
        switch(req){
            case "AUG":
                res = "Methionine";
                break;
            case "UUU":
            case "UUC":
                res = "Phenylalanine";
                break;
            case "UCU":
            case "UCC":
            case "UCA":
            case "UCG":
                res = "Serine";
                break;
            case "UAU":
            case "UAC":
                res = "Tyrosine";
                break;
            case "UGU":
            case "UGC":
                res = "Cysteine";
                break;
            case "UGG":
                res = "Tryptophan";
                break;
            case "UAA":
            case "UAG":
            case "UGA":
                res = "STOP";
                break;
            case "UUA":
            case "UUG":
                res = "Leucine";
                break;
        }

        return res;
    }

    private List<String> toRna(String req){
        return "STOP".equals(req) ? List.of("") : this.map.get(req) ;
    }

    private void setMap(){
        this.map.put("Methionine", List.of("AUG"));
        this.map.put("Phenylalanine",Arrays.asList("UUU","UUC"));
        this.map.put("Leucine",Arrays.asList("UUA","UUG"));
        this.map.put("Serine",Arrays.asList("UCU", "UCC", "UCA", "UCG"));
        this.map.put("Tyrosine",Arrays.asList("UAU", "UAC"));
        this.map.put("Cysteine",Arrays.asList("UGU","UGC"));
        this.map.put("Tryptophan",List.of("UGG"));
        this.map.put("STOP", Arrays.asList("UAA","UAG","UGA"));
    }
}
