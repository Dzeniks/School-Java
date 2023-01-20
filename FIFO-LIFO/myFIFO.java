import java.util.Arrays;

public class myFIFO<E> {
    private E[] que;
    private int size, defaultSize;

    public myFIFO() {
        this.defaultSize = 10;
        this.que = (E[]) new Object[defaultSize];
        this.size = 0;
    }


    public void add(E item){
        if(size >= defaultSize){
            remove();
        }
        que[size++] = item;
    }

    public E remove(){
        E[] tempque = (E[]) new Object[que.length];
                for(int i=0, k=0;i<que.length;i++){
                    if(i!=0){
                        tempque[k]=que[i];
                        k++;
                    }
                }
        E rmItem = this.que[0]; 
        this.que = tempque;
        size--;
        return rmItem;
    }

    public String GetSize(){
        return Integer.toString(this.size);
    }

    @Override
    public String toString() {
        return Arrays.toString(que);
    }

}
