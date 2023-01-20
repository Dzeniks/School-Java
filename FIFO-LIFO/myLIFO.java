import java.util.ArrayList;

public class myLIFO<E> {
    
    private ArrayList<E> stack;
    private int size;

    public myLIFO(){
        this.stack = new ArrayList<E>();
        this.size = 0;
    }

    public void add(E item){
        stack.add(size++, item);
    }

    public E remove(){
        if (this.size > 0){
            ArrayList<E> tempstack = new ArrayList<E>();
                for(int i=0, k=0;i<size;i++){
                    if(i!=size){
                        tempstack.add(k,stack. get(i));
                        k++;
                    }
                }
        E rmItem = this.stack.get(size); 
        this.stack = tempstack;
        size--;
        return rmItem;
        }
        return null;
    }

    public String GetSize(){
        return Integer.toString(this.size);
    }

    @Override
    public String toString() {
        return stack.toString();
    }

}
