package u3;

public class IntegerSet {
    boolean[] set = new boolean[101]; //stores from 0 to 100

    public IntegerSet(){

    }

    public IntegerSet Union(IntegerSet set2){
        IntegerSet set3 = new IntegerSet();
        for (int i=0; i<101; i++){
            set3.set[i] = set[i] || set2.set[i];
        }
        return set3;
    }

    public IntegerSet Intersection(IntegerSet set2){
        IntegerSet set3 = new IntegerSet();
        for (int i=0; i<101; i++){
            set3.set[i] = set[i] && set2.set[i];
        }
        return set3;
    }

    public boolean isEqualTo(IntegerSet set2){
        for (int i=0; i<101; i++){
            if (set[i]!=set2.set[i])
                return false;
        }
        return true;
    }

    public void insertElement(int k){
        if (k>=0 && k<=100)
            set[k] = true;
        else
            throw new IllegalArgumentException("Element out of bounds");
    }

    public void deleteElement(int m){
        if (m>=0 && m<=100)
            set[m] = false;
        else
            throw new IllegalArgumentException("Element out of bounds");
    }

    
    public String toSetString(){
        String output = "";
        boolean isEmpty = true;
        for (int i=0; i<101; i++){
            if (set[i]){
                output+=i+" ";
                isEmpty=false;
            }
        }

        if (isEmpty)
            output+="---";
        else
            output=output.trim();
        return output;
    }
}
