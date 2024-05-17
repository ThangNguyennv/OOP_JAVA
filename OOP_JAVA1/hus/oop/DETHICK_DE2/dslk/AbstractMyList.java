package dslk;

public abstract class AbstractMyList implements MyList {
    
    public AbstractMyList() {

    }

    boolean checkBoundaries(int index, int limit) {
        return index >= 0 && index < limit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size(); i++){
            sb.append(String.format("[%s]", get(i)));
        }
        return sb.toString();
    }
}
