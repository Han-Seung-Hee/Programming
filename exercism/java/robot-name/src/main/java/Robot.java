import java.util.*;

class Robot{
    private String name;
    private static final List<String> nameList = new ArrayList<>();

    public Robot(){
        this.name = genName();
    }

    public String genName(){

        StringBuilder sb = new StringBuilder();
        Random rm = new Random();

        for(int j = 0 ; j < 2 ; j++){
            char ch = (char) (rm.nextInt(26)+'A');
            sb.append(ch);
        }
        for(int i = 0 ; i < 3 ; i++) {
            sb.append(rm.nextInt(10));
        }

        if(nameList.contains(sb.toString())){
            return genName();
        }else{
            nameList.add(sb.toString());
        }

        return sb.toString();
    }

    String getName(){
        return this.name;
    }

    void reset(){
        nameList.removeIf(s -> s.equals(this.name));
        this.name = genName();
    }

    public static void main(String[] args) {
        Set<String> st = new HashSet<>();
        Robot rb = new Robot();

        for(int i = 0 ; i < 5000 ; i++){
            st.add(new Robot().getName());
        }

        System.out.println(st.size());
        System.out.println(nameList.size());
    }
}